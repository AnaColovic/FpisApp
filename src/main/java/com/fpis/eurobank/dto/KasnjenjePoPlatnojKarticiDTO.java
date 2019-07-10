/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fpis.eurobank.domain.KasnjenjePoPlatnojKarticiID;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KasnjenjePoPlatnojKarticiDTO implements Serializable{
    private int sifraPlatneKartice;
    private int redniBroj;
    private Date datumIzdavanja;
    private String aktivnost;
    private Date statusOd;
    private Date datumPrijave;
    private Date datumIsteka;
    @JsonIgnore
    private PlatnaKarticaDTO platnaKartica;

    public KasnjenjePoPlatnojKarticiDTO() {
    }

    public KasnjenjePoPlatnojKarticiDTO(int sifraPlatneKartice, int redniBroj, Date datumIzdavanja, String aktivnost, Date statusOd, Date datumPrijave, Date datumIsteka, PlatnaKarticaDTO platnaKartica) {
        this.sifraPlatneKartice = sifraPlatneKartice;
        this.redniBroj = redniBroj;
        this.datumIzdavanja = datumIzdavanja;
        this.aktivnost = aktivnost;
        this.statusOd = statusOd;
        this.datumPrijave = datumPrijave;
        this.datumIsteka = datumIsteka;
        this.platnaKartica = platnaKartica;
    }

    public int getSifraPlatneKartice() {
        return sifraPlatneKartice;
    }

    public void setSifraPlatneKartice(int sifraPlatneKartice) {
        this.sifraPlatneKartice = sifraPlatneKartice;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

   

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public String getAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(String aktivnost) {
        this.aktivnost = aktivnost;
    }

    public Date getStatusOd() {
        return statusOd;
    }

    public void setStatusOd(Date statusOd) {
        this.statusOd = statusOd;
    }

    public Date getDatumPrijave() {
        return datumPrijave;
    }

    public void setDatumPrijave(Date datumPrijave) {
        this.datumPrijave = datumPrijave;
    }

    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public PlatnaKarticaDTO getPlatnaKartica() {
        return platnaKartica;
    }

    public void setPlatnaKartica(PlatnaKarticaDTO platnaKartica) {
        this.platnaKartica = platnaKartica;
    }

    @Override
    public String toString() {
        return "KasnjenjePoPlatnojKarticiDTO{" + "sifraPlatneKartice=" + sifraPlatneKartice + ", redniBroj=" + redniBroj + ", datumIzdavanja=" + datumIzdavanja + ", aktivnost=" + aktivnost + ", statusOd=" + statusOd + ", datumPrijave=" + datumPrijave + ", datumIsteka=" + datumIsteka + ", platnaKartica=" + platnaKartica + '}';
    }
    
    
    
}
