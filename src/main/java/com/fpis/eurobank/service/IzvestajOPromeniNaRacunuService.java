/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service;

import com.fpis.eurobank.domain.IzvestajOPromeniNaRacunu;

/**
 *
 * @author Administrator
 */
public interface IzvestajOPromeniNaRacunuService {
    public IzvestajOPromeniNaRacunu saveOrUpdate(IzvestajOPromeniNaRacunu izvestaj);
    public void delete(int id);
    public IzvestajOPromeniNaRacunu findById(int id);
}
