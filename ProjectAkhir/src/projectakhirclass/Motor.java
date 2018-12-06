/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhirclass;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author sin
 */
public class Motor {
   private String merk;
   private String tipe;
   private int nopol;
   private String warna;
   private String jt;
   private Date tglmsk;
   private Date tglklr;
   private int harga;

    public Motor(String merk, String tipe, int nopol, String warna, String jt, Date tglmsk, Date tglklr, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.nopol = nopol;
        this.warna = warna;
        this.jt = jt;
        this.tglmsk = tglmsk;
        this.tglklr = tglklr;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getNopol() {
        return nopol;
    }

    public void setNopol(int nopol) {
        this.nopol = nopol;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJt() {
        return jt;
    }

    public void setJt(String jt) {
        this.jt = jt;
    }

    public Date getTglmsk() {
        return tglmsk;
    }

    public void setTglmsk(Date tglmsk) {
        this.tglmsk = tglmsk;
    }

    public Date getTglklr() {
        return tglklr;
    }

    public void setTglklr(Date tglklr) {
        this.tglklr = tglklr;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
   
   
   
}
