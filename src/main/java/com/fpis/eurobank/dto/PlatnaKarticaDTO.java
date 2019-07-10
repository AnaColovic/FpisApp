/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PlatnaKarticaDTO implements Serializable {

    private int sifraPlatneKartice;
    private VrstaPlatneKarticeDTO vrsta;
    private KlijentDTO klijent;
    private List<KoriscenjePlatneKarticeDTO> koriscenja;
    private List<KasnjenjePoPlatnojKarticiDTO> kasnjenja;

    public PlatnaKarticaDTO() {
    }

    public PlatnaKarticaDTO(int sifraPlatneKartice, VrstaPlatneKarticeDTO vrsta, KlijentDTO klijent, List<KoriscenjePlatneKarticeDTO> koriscenja, List<KasnjenjePoPlatnojKarticiDTO> kasnjenja) {
        this.sifraPlatneKartice = sifraPlatneKartice;
        this.vrsta = vrsta;
        this.klijent = klijent;
        this.koriscenja = koriscenja;
        this.kasnjenja = kasnjenja;
    }

    public int getSifraPlatneKartice() {
        return sifraPlatneKartice;
    }

    public void setSifraPlatneKartice(int sifraPlatneKartice) {
        this.sifraPlatneKartice = sifraPlatneKartice;
    }

    public VrstaPlatneKarticeDTO getVrsta() {
        return vrsta;
    }

    public void setVrsta(VrstaPlatneKarticeDTO vrsta) {
        this.vrsta = vrsta;
    }

    public KlijentDTO getKlijent() {
        return klijent;
    }

    public void setKlijent(KlijentDTO klijent) {
        this.klijent = klijent;
    }

    public List<KoriscenjePlatneKarticeDTO> getKoriscenja() {
        return koriscenja;
    }

    public void setKoriscenja(List<KoriscenjePlatneKarticeDTO> koriscenja) {
        this.koriscenja = koriscenja;
    }

    public List<KasnjenjePoPlatnojKarticiDTO> getKasnjenja() {
        return kasnjenja;
    }

    public void setKasnjenja(List<KasnjenjePoPlatnojKarticiDTO> kasnjenja) {
        this.kasnjenja = kasnjenja;
    }

    @Override
    public String toString() {
        return "PlatnaKarticaDTO{" + "sifraPlatneKartice=" + sifraPlatneKartice + ", vrsta=" + vrsta + ", klijent=" + klijent + ", koriscenja=" + koriscenja + ", kasnjenja=" + kasnjenja + '}';
    }
    
    
    
}
