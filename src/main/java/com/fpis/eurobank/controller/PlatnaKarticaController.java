/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.controller;

import com.fpis.eurobank.domain.KasnjenjePoPlatnojKartici;
import com.fpis.eurobank.domain.KasnjenjePoPlatnojKarticiID;
import com.fpis.eurobank.domain.KoriscenjePlatneKartice;
import com.fpis.eurobank.domain.KoriscenjePlatneKarticeID;
import com.fpis.eurobank.domain.PlatnaKartica;
import com.fpis.eurobank.dto.KasnjenjePoPlatnojKarticiDTO;
import com.fpis.eurobank.dto.KoriscenjePlatneKarticeDTO;
import com.fpis.eurobank.dto.PlatnaKarticaDTO;
import com.fpis.eurobank.service.PlatnaKarticaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/platnaKartica/*")
public class PlatnaKarticaController {

    @Autowired
    private PlatnaKarticaService platnaKarticaService;

    @Autowired
    private ModelMapper mapper;

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public PlatnaKarticaDTO findById(@PathVariable int id) {
        PlatnaKartica kartica = platnaKarticaService.findById(id);
        return mapirajKarticu(kartica);
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public PlatnaKarticaDTO save(@RequestBody PlatnaKarticaDTO platnaKarticaDTO) {
        PlatnaKartica platnaKartica = mapper.map(platnaKarticaDTO, PlatnaKartica.class);
        for (KoriscenjePlatneKartice koriscenje : platnaKartica.getKoriscenja()) {
            koriscenje.setId(new KoriscenjePlatneKarticeID(0, platnaKarticaDTO.getKoriscenja().get(platnaKartica.getKoriscenja().indexOf(koriscenje)).getRedniBroj()));
        }
        for (KasnjenjePoPlatnojKartici kasnjenje : platnaKartica.getKasnjenja()) {
            kasnjenje.setId(new KasnjenjePoPlatnojKarticiID(0, platnaKarticaDTO.getKasnjenja().get(platnaKartica.getKasnjenja().indexOf(kasnjenje)).getRedniBroj()));
        }
        platnaKartica = platnaKarticaService.saveOrUpdate(platnaKartica);
        return mapirajKarticu(platnaKartica);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        platnaKarticaService.delete(id);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public PlatnaKarticaDTO update(@RequestBody PlatnaKarticaDTO platnaKarticaDTO, @PathVariable int id) {
        PlatnaKartica platnaKartica = mapper.map(platnaKarticaDTO, PlatnaKartica.class);

        System.out.println(platnaKartica);
        System.out.println(platnaKarticaDTO);

        if (platnaKartica.getKoriscenja() != null) {
            for (KoriscenjePlatneKartice koriscenje : platnaKartica.getKoriscenja()) {
                koriscenje.setId(new KoriscenjePlatneKarticeID(id, platnaKarticaDTO.getKoriscenja().get(platnaKartica.getKoriscenja().indexOf(koriscenje)).getRedniBroj()));
            }
        }

        if (platnaKartica.getKasnjenja() != null) {
            for (KasnjenjePoPlatnojKartici kasnjenje : platnaKartica.getKasnjenja()) {
                kasnjenje.setId(new KasnjenjePoPlatnojKarticiID(id, platnaKarticaDTO.getKasnjenja().get(platnaKartica.getKasnjenja().indexOf(kasnjenje)).getRedniBroj()));
            }
        }
        platnaKartica = platnaKarticaService.saveOrUpdate(platnaKartica);
        return mapirajKarticu(platnaKartica);
    }

    private PlatnaKarticaDTO mapirajKarticu(PlatnaKartica kartica) {
        PlatnaKarticaDTO karticaDTO = mapper.map(kartica, PlatnaKarticaDTO.class);
        if (kartica.getKasnjenja() != null) {
            for (KasnjenjePoPlatnojKarticiDTO kasnjenje : karticaDTO.getKasnjenja()) {
                KasnjenjePoPlatnojKarticiID id = kartica.getKasnjenja().get(karticaDTO.getKasnjenja().indexOf(kasnjenje)).getId();
                kasnjenje.setRedniBroj(id.getRedniBroj());
                kasnjenje.setSifraPlatneKartice(id.getSifraPlatneKartice());
            }
        }
        if (kartica.getKoriscenja() != null) {
            for (KoriscenjePlatneKarticeDTO koriscenje : karticaDTO.getKoriscenja()) {
                KoriscenjePlatneKarticeID id = kartica.getKoriscenja().get(karticaDTO.getKoriscenja().indexOf(koriscenje)).getId();
                koriscenje.setRedniBroj(id.getRedniBroj());
                koriscenje.setSifraPlatneKartice(id.getSifraPlatneKartice());
            }
        }
        return karticaDTO;
    }
}
