/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.dto;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class KlijentDTO implements Serializable{
    private String jmbg;
    private String imeImerodPrezime;
    private String brojLicneKarte;
    private String bracniStatus;
    private String telefon;
    private String osnov;

    public KlijentDTO() {
    }

    public KlijentDTO(String jmbg, String imeImerodPrezime, String brojLicneKarte, String bracniStatus, String telefon, String osnov) {
        this.jmbg = jmbg;
        this.imeImerodPrezime = imeImerodPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.bracniStatus = bracniStatus;
        this.telefon = telefon;
        this.osnov = osnov;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getImeImerodPrezime() {
        return imeImerodPrezime;
    }

    public void setImeImerodPrezime(String imeImerodPrezime) {
        this.imeImerodPrezime = imeImerodPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getBracniStatus() {
        return bracniStatus;
    }

    public void setBracniStatus(String bracniStatus) {
        this.bracniStatus = bracniStatus;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getOsnov() {
        return osnov;
    }

    public void setOsnov(String osnov) {
        this.osnov = osnov;
    }
    
}
