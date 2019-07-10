/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.controller;

import com.fpis.eurobank.domain.VrstaPlatneKartice;
import com.fpis.eurobank.dto.VrstaPlatneKarticeDTO;
import com.fpis.eurobank.service.VrstaPlatneKarticeService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@CrossOrigin
@RequestMapping("/vrsta/*")
public class VrstaPlatneKarticeController {

    @Autowired
    private VrstaPlatneKarticeService vrstaPKService;
    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value = "get")
    public List<VrstaPlatneKarticeDTO> findAll() {
        List<VrstaPlatneKartice> vrste = vrstaPKService.findAll();
        return vrste.stream().map(vrsta -> modelMapper.map(vrsta, VrstaPlatneKarticeDTO.class)).collect(Collectors.toList());
    }
}
