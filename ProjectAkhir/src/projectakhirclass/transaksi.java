/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhirclass;

import java.util.ArrayList;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class transaksi {
    private String nama;
    private String alamat;
    private int noHp;
    private int ink; 
    private ArrayList<Merk> merk = new ArrayList<>();
    private String tipe;
    private int nopol;
    private String warna;
    private String jt;

    public transaksi(String nama, String alamat, int noHp, int ink, String tipe, int nopol, String warna, String jt) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.ink = ink;
        this.tipe = tipe;
        this.nopol = nopol;
        this.warna = warna;
        this.jt = jt;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }

    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
    }

    public ArrayList<Merk> getMerk() {
        return merk;
    }

    public void setMerk(ArrayList<Merk> merk) {
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
    
    
}
