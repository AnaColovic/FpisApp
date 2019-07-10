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
public class IzvestajOPromeniNaRacunuDTO implements Serializable{
    private int sifraIzvestaja;
    private Date datum;
    private double iznos;
    private int brojRate;
    private KlijentDTO klijent;

    public IzvestajOPromeniNaRacunuDTO() {
    }

    public IzvestajOPromeniNaRacunuDTO(int sifraIzvestaja, Date datum, double iznos, int brojRate, KlijentDTO klijent) {
        this.sifraIzvestaja = sifraIzvestaja;
        this.datum = datum;
        this.iznos = iznos;
        this.brojRate = brojRate;
        this.klijent = klijent;
    }

    public int getSifraIzvestaja() {
        return sifraIzvestaja;
    }

    public void setSifraIzvestaja(int sifraIzvestaja) {
        this.sifraIzvestaja = sifraIzvestaja;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public int getBrojRate() {
        return brojRate;
    }

    public void setBrojRate(int brojRate) {
        this.brojRate = brojRate;
    }

    public KlijentDTO getKlijent() {
        return klijent;
    }

    public void setKlijent(KlijentDTO klijent) {
        this.klijent = klijent;
    }
    
    
}
