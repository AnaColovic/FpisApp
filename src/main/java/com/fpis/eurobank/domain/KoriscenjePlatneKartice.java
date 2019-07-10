/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrator
 */
@Entity
public class KoriscenjePlatneKartice implements Serializable {
    @EmbeddedId
    private KoriscenjePlatneKarticeID id;
    @Temporal(TemporalType.DATE)
    private Date datumDospeca;
    private double trenutniIznos;
    private double maxIznos;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date datumPrijema;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("sifraPlatneKartice")
    @JoinColumn
    private PlatnaKartica platnaKartica;

    public KoriscenjePlatneKartice() {
    }

    public KoriscenjePlatneKartice(KoriscenjePlatneKarticeID id, Date datumDospeca, double trenutniIznos, double maxIznos, String status, Date datumPrijema, PlatnaKartica platnaKartica) {
        this.id = id;
        this.datumDospeca = datumDospeca;
        this.trenutniIznos = trenutniIznos;
        this.maxIznos = maxIznos;
        this.status = status;
        this.datumPrijema = datumPrijema;
        this.platnaKartica = platnaKartica;
    }

    @JsonIgnore
    public KoriscenjePlatneKarticeID getId() {
        return id;
    }

    public void setId(KoriscenjePlatneKarticeID id) {
        this.id = id;
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

    public PlatnaKartica getPlatnaKartica() {
        return platnaKartica;
    }

    public void setPlatnaKartica(PlatnaKartica platnaKartica) {
        this.platnaKartica = platnaKartica;
    }

    @Override
    public String toString() {
        return "KoriscenjePlatneKartice{" + "id=" + id + ", datumDospeca=" + datumDospeca + ", trenutniIznos=" + trenutniIznos + ", maxIznos=" + maxIznos + ", status=" + status + ", datumPrijema=" + datumPrijema + ", platnaKartica=" + platnaKartica + '}';
    }
    
    
    
}
