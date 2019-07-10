/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.eurobank.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class KoriscenjePlatneKarticeID implements Serializable{
    private int sifraPlatneKartice;
    private int redniBroj;

    public KoriscenjePlatneKarticeID() {
    }

    public KoriscenjePlatneKarticeID(int sifraPlatneKartice, int redniBroj) {
        this.sifraPlatneKartice = sifraPlatneKartice;
        this.redniBroj = redniBroj;
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
    
}
