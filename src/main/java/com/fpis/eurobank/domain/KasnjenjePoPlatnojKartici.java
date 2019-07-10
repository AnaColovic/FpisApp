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
public class KasnjenjePoPlatnojKartici implements Serializable {
    @EmbeddedId
    private KasnjenjePoPlatnojKarticiID id;
    @Temporal(TemporalType.DATE)
    private Date datumIzdavanja;
    private String aktivnost;
    @Temporal(TemporalType.DATE)
    private Date statusOd;
    @Temporal(TemporalType.DATE)
    private Date datumPrijave;
    @Temporal(TemporalType.DATE)
    private Date datumIsteka;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("sifraPlatneKartice")
    @JoinColumn
    private PlatnaKartica platnaKartica;

    public KasnjenjePoPlatnojKartici() {
    }

    public KasnjenjePoPlatnojKartici(KasnjenjePoPlatnojKarticiID id, Date datumIzdavanja, String aktivnost, Date statusOd, Date datumPrijave, Date datumIsteka, PlatnaKartica platnaKartica) {
        this.id = id;
        this.datumIzdavanja = datumIzdavanja;
        this.aktivnost = aktivnost;
        this.statusOd = statusOd;
        this.datumPrijave = datumPrijave;
        this.datumIsteka = datumIsteka;
        this.platnaKartica = platnaKartica;
    }

    @JsonIgnore
    public KasnjenjePoPlatnojKarticiID getId() {
        return id;
    }

    public void setId(KasnjenjePoPlatnojKarticiID id) {
        this.id = id;
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

    public PlatnaKartica getPlatnaKartica() {
        return platnaKartica;
    }

    public void setPlatnaKartica(PlatnaKartica platnaKartica) {
        this.platnaKartica = platnaKartica;
    }

    @Override
    public String toString() {
        return "KasnjenjePoPlatnojKartici{" + "id=" + id + ", datumIzdavanja=" + datumIzdavanja + ", aktivnost=" + aktivnost + ", statusOd=" + statusOd + ", datumPrijave=" + datumPrijave + ", datumIsteka=" + datumIsteka + ", platnaKartica=" + platnaKartica + '}';
    }
    
    
    
}
