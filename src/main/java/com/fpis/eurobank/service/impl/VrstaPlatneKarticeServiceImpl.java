/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service.impl;

import com.fpis.eurobank.domain.VrstaPlatneKartice;
import com.fpis.eurobank.repository.VrstaPlatneKarticeRepository;
import com.fpis.eurobank.service.VrstaPlatneKarticeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class VrstaPlatneKarticeServiceImpl implements VrstaPlatneKarticeService{
    @Autowired
    private VrstaPlatneKarticeRepository vrstaPKRepository;

    @Override
    public List<VrstaPlatneKartice> findAll() {
        return vrstaPKRepository.findAll();
    }
    
}
