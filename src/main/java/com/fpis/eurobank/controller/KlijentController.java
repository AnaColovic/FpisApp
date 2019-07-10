/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.controller;

import com.fpis.eurobank.domain.Klijent;
import com.fpis.eurobank.dto.KlijentDTO;
import com.fpis.eurobank.service.KlijentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/klijent/*")
public class KlijentController {
    @Autowired
    private KlijentService klijentService;
    
    @Autowired
    private ModelMapper mapper;
    
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public KlijentDTO findById(@PathVariable String id){
        Klijent klijent = klijentService.findById(id);
        return mapper.map(klijent, KlijentDTO.class);
    }
}
