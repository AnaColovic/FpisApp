/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.repository;

import com.fpis.eurobank.domain.PlatnaKartica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface PlatnaKarticaRepository extends JpaRepository<PlatnaKartica, Integer>{
    
}
