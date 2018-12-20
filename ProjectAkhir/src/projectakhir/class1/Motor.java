/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.class1;

/**
 *
 * @author sin
 */
public class Motor {
    private int id;
    private String merk;
    private String tipe;
    private String nopol;
    private String warna;
    private String jt;
    private String tglmsk;
    private int harga;

    public Motor(String merk, String tipe, String nopol, String warna, String jt, String tglmsk, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.nopol = nopol;
        this.warna = warna;
        this.jt = jt;
        this.tglmsk = tglmsk;
        this.harga = harga;
    }

    public Motor() {
    }

    public String getMerk() {
        return merk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
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

    public String getTglmsk() {
        return tglmsk;
    }

    public void setTglmsk(String tglmsk) {
        this.tglmsk = tglmsk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    
}
