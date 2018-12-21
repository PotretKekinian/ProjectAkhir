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
    private int id;
    private String nama;
    private String alamat;
    private int noHp;
    private int nik;
    private String tglklr;

    public Transaksi(int id, String nama, String alamat, int noHp, int nik, String tglklr) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.nik = nik;
        this.tglklr = tglklr;
    }
    
    public Transaksi() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTglklr() {
        return tglklr;
    }

    public void setTglklr(String tglklr) {
        this.tglklr = tglklr;
    }

}
