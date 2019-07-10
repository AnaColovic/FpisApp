/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class VrstaPlatneKarticeDTO implements Serializable{
    private String sifraVrstePK;
    private double dozvoljeniPlus;
    private double dozvoljeniMinus;
    private Date datumPlacanja;
    private String naziv;

    public VrstaPlatneKarticeDTO() {
    }

    public VrstaPlatneKarticeDTO(String sifraVrstePK, double dozvoljeniPlus, double dozvoljeniMinus, Date datumPlacanja, String naziv) {
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
