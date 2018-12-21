/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;

import java.util.List;
import projectakhir.class1.Transaksi;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public interface ITransaksi {
    public void insert (Transaksi ts);
    public void update (Transaksi ts);
    public void delete (int id);
    public List<Transaksi> getAll();
}
