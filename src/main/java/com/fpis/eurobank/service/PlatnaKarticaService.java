/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service;

import com.fpis.eurobank.domain.PlatnaKartica;

/**
 *
 * @author Administrator
 */
public interface PlatnaKarticaService {
    public PlatnaKartica findById(int id);
    public PlatnaKartica saveOrUpdate(PlatnaKartica platnaKartica);
    public void delete(int id);
}
