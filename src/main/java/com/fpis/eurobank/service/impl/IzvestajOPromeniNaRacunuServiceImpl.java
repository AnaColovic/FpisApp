/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service.impl;

import com.fpis.eurobank.domain.IzvestajOPromeniNaRacunu;
import com.fpis.eurobank.repository.IzvestajOPromeniNaRacunuRepository;
import com.fpis.eurobank.repository.KlijentRepository;
import com.fpis.eurobank.service.IzvestajOPromeniNaRacunuService;
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
public class IzvestajOPromeniNaRacunuServiceImpl implements IzvestajOPromeniNaRacunuService {

    @Autowired
    IzvestajOPromeniNaRacunuRepository izvestajRepository;

    @Override
    public IzvestajOPromeniNaRacunu saveOrUpdate(IzvestajOPromeniNaRacunu izvestaj) {
        return izvestajRepository.save(izvestaj);
    }

    @Override
    public void delete(int id) {
        izvestajRepository.deleteById(id);
    }

    @Override
    public IzvestajOPromeniNaRacunu findById(int id) {
        Optional<IzvestajOPromeniNaRacunu> izvestaj = izvestajRepository.findById(id);
        if (izvestaj.isPresent()) {
            return izvestaj.get();
        }
        return null;
    }
}
