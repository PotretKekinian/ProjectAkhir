/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;

import java.util.ArrayList;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class Transaksi {
    private String nama;
    private String alamat;
    private int noHp;
    private int nik;
    private int tglklr;
    private String merk;
    private String tipe;
    private int nopol;
    private String warna;
    private String jt;
    private int harga;

    public Transaksi(String nama, String alamat, int noHp, int nik, int tglklr, String merk, String tipe, int nopol, String warna, String jt, int harga) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.nik = nik;
        this.tglklr = tglklr;
        this.merk = merk;
        this.tipe = tipe;
        this.nopol = nopol;
        this.warna = warna;
        this.jt = jt;
        this.harga = harga;
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

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public int getTglklr() {
        return tglklr;
    }

    public void setTglklr(int tglklr) {
        this.tglklr = tglklr;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    
    
}
