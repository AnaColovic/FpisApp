/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fpis.eurobank.domain.KoriscenjePlatneKarticeID;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class KoriscenjePlatneKarticeDTO implements Serializable{

    private int sifraPlatneKartice;
    private int redniBroj;
    private Date datumDospeca;
    private double trenutniIznos;
    private double maxIznos;
    private String status;
    private Date datumPrijema;
    @JsonIgnore
    private PlatnaKarticaDTO platnaKartica;

    public KoriscenjePlatneKarticeDTO() {
    }

    public KoriscenjePlatneKarticeDTO(int sifraPlatneKartice, int redniBroj, Date datumDospeca, double trenutniIznos, double maxIznos, String status, Date datumPrijema, PlatnaKarticaDTO platnaKartica) {
        this.sifraPlatneKartice = sifraPlatneKartice;
        this.redniBroj = redniBroj;
        this.datumDospeca = datumDospeca;
        this.trenutniIznos = trenutniIznos;
        this.maxIznos = maxIznos;
        this.status = status;
        this.datumPrijema = datumPrijema;
        this.platnaKartica = platnaKartica;
    }


    public Date getDatumDospeca() {
        return datumDospeca;
    }

    public void setDatumDospeca(Date datumDospeca) {
        this.datumDospeca = datumDospeca;
    }

    public double getTrenutniIznos() {
        return trenutniIznos;
    }

    public void setTrenutniIznos(double trenutniIznos) {
        this.trenutniIznos = trenutniIznos;
    }

    public double getMaxIznos() {
        return maxIznos;
    }

    public void setMaxIznos(double maxIznos) {
        this.maxIznos = maxIznos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatumPrijema() {
        return datumPrijema;
    }

    public void setDatumPrijema(Date datumPrijema) {
        this.datumPrijema = datumPrijema;
    }

    public PlatnaKarticaDTO getPlatnaKartica() {
        return platnaKartica;
    }

    public void setPlatnaKartica(PlatnaKarticaDTO platnaKartica) {
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

    @Override
    public String toString() {
        return "KoriscenjePlatneKarticeDTO{" + "sifraPlatneKartice=" + sifraPlatneKartice + ", redniBroj=" + redniBroj + ", datumDospeca=" + datumDospeca + ", trenutniIznos=" + trenutniIznos + ", maxIznos=" + maxIznos + ", status=" + status + ", datumPrijema=" + datumPrijema + ", platnaKartica=" + platnaKartica + '}';
    }
    
    

}
