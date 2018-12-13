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
}
