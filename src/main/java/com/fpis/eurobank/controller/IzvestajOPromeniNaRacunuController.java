/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.controller;

import com.fpis.eurobank.domain.IzvestajOPromeniNaRacunu;
import com.fpis.eurobank.dto.IzvestajOPromeniNaRacunuDTO;
import com.fpis.eurobank.service.IzvestajOPromeniNaRacunuService;
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
@RequestMapping("/izvestaj/*")
public class IzvestajOPromeniNaRacunuController {

    @Autowired
    private IzvestajOPromeniNaRacunuService izvestajService;

    @Autowired
    private ModelMapper mapper;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public IzvestajOPromeniNaRacunuDTO save(@RequestBody IzvestajOPromeniNaRacunuDTO izvestajDTO) {
        IzvestajOPromeniNaRacunu izvestaj = mapper.map(izvestajDTO, IzvestajOPromeniNaRacunu.class);
        izvestaj = izvestajService.saveOrUpdate(izvestaj);
        return mapper.map(izvestaj, IzvestajOPromeniNaRacunuDTO.class);
    }

    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public IzvestajOPromeniNaRacunuDTO update(@RequestBody IzvestajOPromeniNaRacunuDTO izvestajDTO) {
        IzvestajOPromeniNaRacunu izvestaj = mapper.map(izvestajDTO, IzvestajOPromeniNaRacunu.class);
        izvestaj = izvestajService.saveOrUpdate(izvestaj);
        return mapper.map(izvestaj, IzvestajOPromeniNaRacunuDTO.class);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        izvestajService.delete(id);
    }

    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public IzvestajOPromeniNaRacunuDTO findById(@PathVariable int id) {
        IzvestajOPromeniNaRacunu izvestaj = izvestajService.findById(id);
        return mapper.map(izvestaj, IzvestajOPromeniNaRacunuDTO.class);
    }
}
