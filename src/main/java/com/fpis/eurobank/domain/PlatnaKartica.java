/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.domain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Administrator
 */
@Entity
public class PlatnaKartica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifraPlatneKartice;
    @ManyToOne
    private VrstaPlatneKartice vrsta;
    @ManyToOne
    private Klijent klijent;
    @OneToMany(mappedBy = "platnaKartica", cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<KoriscenjePlatneKartice> koriscenja;
    @OneToMany(mappedBy = "platnaKartica", cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<KasnjenjePoPlatnojKartici> kasnjenja;
    
    public PlatnaKartica() {
        koriscenja = new LinkedList<>();
        kasnjenja = new LinkedList<>();
    }

    public PlatnaKartica(int sifraPlatneKartice, VrstaPlatneKartice vrsta, Klijent klijent) {
        this.sifraPlatneKartice = sifraPlatneKartice;
        this.vrsta = vrsta;
        this.klijent = klijent;
    }

    public int getSifraPlatneKartice() {
        return sifraPlatneKartice;
    }

    public void setSifraPlatneKartice(int sifraPlatneKartice) {
        this.sifraPlatneKartice = sifraPlatneKartice;
    }

    public VrstaPlatneKartice getVrsta() {
        return vrsta;
    }

    public void setVrsta(VrstaPlatneKartice vrsta) {
        this.vrsta = vrsta;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public List<KoriscenjePlatneKartice> getKoriscenja() {
        return koriscenja;
    }

    public void setKoriscenja(List<KoriscenjePlatneKartice> koriscenja) {
        this.koriscenja = koriscenja;
    }

    public List<KasnjenjePoPlatnojKartici> getKasnjenja() {
        return kasnjenja;
    }

    public void setKasnjenja(List<KasnjenjePoPlatnojKartici> kasnjenja) {
        this.kasnjenja = kasnjenja;
    }

    @Override
    public String toString() {
        return "PlatnaKartica{" + "sifraPlatneKartice=" + sifraPlatneKartice + ", vrsta=" + vrsta + ", klijent=" + klijent + ", koriscenja=" + koriscenja + ", kasnjenja=" + kasnjenja + '}';
    }
    
    
    
}
