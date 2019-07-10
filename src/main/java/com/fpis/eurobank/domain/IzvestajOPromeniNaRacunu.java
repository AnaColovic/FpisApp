/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrator
 */
@Entity
public class IzvestajOPromeniNaRacunu implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifraIzvestaja;
    @Temporal(TemporalType.DATE)
    private Date datum;
    private double iznos;
    private int brojRate;
    @ManyToOne
    private Klijent klijent;

    public IzvestajOPromeniNaRacunu() {
    }

    public IzvestajOPromeniNaRacunu(int sifraIzvestaja, Date datum, double iznos, int brojRate, Klijent klijent) {
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

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }
    
    
}
