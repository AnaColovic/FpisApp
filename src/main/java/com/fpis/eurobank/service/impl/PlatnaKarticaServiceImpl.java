/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service.impl;

import com.fpis.eurobank.domain.KasnjenjePoPlatnojKartici;
import com.fpis.eurobank.domain.KoriscenjePlatneKartice;
import com.fpis.eurobank.domain.PlatnaKartica;
import com.fpis.eurobank.repository.KasnjenjePoPlatnojKarticiRepository;
import com.fpis.eurobank.repository.KoriscenjePlatneKarticeRepository;
import com.fpis.eurobank.repository.PlatnaKarticaRepository;
import com.fpis.eurobank.service.PlatnaKarticaService;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
@Transactional
public class PlatnaKarticaServiceImpl implements PlatnaKarticaService {

    @Autowired
    private PlatnaKarticaRepository pkRepository;

    @Autowired
    private KasnjenjePoPlatnojKarticiRepository kasnjenjaRepository;

    @Autowired
    private KoriscenjePlatneKarticeRepository koriscenjaRepository;

    @Override
    public PlatnaKartica findById(int id) {
        Optional<PlatnaKartica> kartica = pkRepository.findById(id);
        if (kartica.isPresent()) {
            return kartica.get();
        }
        return null;
    }

    @Override
    public PlatnaKartica saveOrUpdate(PlatnaKartica platnaKartica) {

        PlatnaKartica pk = findById(platnaKartica.getSifraPlatneKartice());
        if (pk != null) {
            kasnjenjaRepository.deleteByPlatnaKarticaSifraPlatneKartice(platnaKartica.getSifraPlatneKartice());
            koriscenjaRepository.deleteByPlatnaKarticaSifraPlatneKartice(platnaKartica.getSifraPlatneKartice());
        }
        pkRepository.save(platnaKartica);

        if (platnaKartica.getKoriscenja() != null) {
            for (KoriscenjePlatneKartice koriscenje : platnaKartica.getKoriscenja()) {
                koriscenje.setPlatnaKartica(new PlatnaKartica(platnaKartica.getSifraPlatneKartice(), null, null));
            }
            koriscenjaRepository.saveAll(platnaKartica.getKoriscenja());

        }
        if (platnaKartica.getKasnjenja() != null) {
            for (KasnjenjePoPlatnojKartici kasnjenje : platnaKartica.getKasnjenja()) {
                kasnjenje.setPlatnaKartica(new PlatnaKartica(platnaKartica.getSifraPlatneKartice(), null, null));
            }
            kasnjenjaRepository.saveAll(platnaKartica.getKasnjenja());

        }

        return platnaKartica;
    }

    @Override
    public void delete(int id) {
        pkRepository.deleteById(id);
    }

}
