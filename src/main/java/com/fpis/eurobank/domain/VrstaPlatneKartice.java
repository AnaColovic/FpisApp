/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Administrator
 */
@Entity
public class VrstaPlatneKartice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sifraVrstePK;
    private double dozvoljeniPlus;
    private double dozvoljeniMinus;
    @Temporal(TemporalType.DATE)
    private Date datumPlacanja;
    private String naziv;
    

    public VrstaPlatneKartice() {
    }

    public VrstaPlatneKartice(String sifraVrstePK, double dozvoljeniPlus, double dozvoljeniMinus, Date datumPlacanja, String naziv) {
        this.sifraVrstePK = sifraVrstePK;
        this.dozvoljeniPlus = dozvoljeniPlus;
        this.dozvoljeniMinus = dozvoljeniMinus;
        this.datumPlacanja = datumPlacanja;
        this.naziv = naziv;
    }

    public String getSifraVrstePK() {
        return sifraVrstePK;
    }

    public void setSifraVrstePK(String sifraVrstePK) {
        this.sifraVrstePK = sifraVrstePK;
    }

    public double getDozvoljeniPlus() {
        return dozvoljeniPlus;
    }

    public void setDozvoljeniPlus(double dozvoljeniPlus) {
        this.dozvoljeniPlus = dozvoljeniPlus;
    }

    public double getDozvoljeniMinus() {
        return dozvoljeniMinus;
    }

    public void setDozvoljeniMinus(double dozvoljeniMinus) {
        this.dozvoljeniMinus = dozvoljeniMinus;
    }

    public Date getDatumPlacanja() {
        return datumPlacanja;
    }

    public void setDatumPlacanja(Date datumPlacanja) {
        this.datumPlacanja = datumPlacanja;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
}
