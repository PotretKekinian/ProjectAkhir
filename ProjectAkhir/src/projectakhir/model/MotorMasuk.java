/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;

import java.util.Date;

/**
 *
 * @author sin
 */
public class MotorMasuk {
    private String merk;
   private String tipe;
   private int nopol;
   private String warna;
   private String jt;
   private Date tglmsk;
   private int harga;

    public MotorMasuk(String merk, String tipe, int nopol, String warna, String jt, Date tglmsk, Date tglklr, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.nopol = nopol;
        this.warna = warna;
        this.jt = jt;
        this.tglmsk = tglmsk;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }  
    
    public String toString(){
        return this.merk;
    }
}
