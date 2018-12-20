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
public class Transaksi {
    private String nama;
    private String alamat;
    private int noHp;
    private int nik;
    private String tglklr;

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

    public String getTglklr() {
        return tglklr;
    }

    public void setTglklr(String tglklr) {
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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Transaksi(String nama, String alamat, int noHp, int nik, String tglklr, String merk, String tipe, String nopol, String warna, String jt, String tglmsk, String harga) {
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
        this.tglmsk = tglmsk;
        this.harga = harga;
    }
    private String merk;
    private String tipe;
    private String nopol;
    private String warna;
    private String jt;
    private String tglmsk;
    private String harga;
}
