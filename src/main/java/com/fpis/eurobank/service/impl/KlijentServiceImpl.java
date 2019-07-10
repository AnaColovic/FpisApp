/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service.impl;

import com.fpis.eurobank.domain.Klijent;
import com.fpis.eurobank.repository.KlijentRepository;
import com.fpis.eurobank.service.KlijentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class KlijentServiceImpl implements KlijentService {

    @Autowired
    KlijentRepository klijentRepository;

    @Override
    public Klijent findById(String id) {
        Optional<Klijent> klijent = klijentRepository.findById(id);
        if (klijent.isPresent()) {
            return klijent.get();
        }
        return null;
    }

}
