/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.service;

import com.fpis.eurobank.domain.VrstaPlatneKartice;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface VrstaPlatneKarticeService {
    public List<VrstaPlatneKartice> findAll();
}
