/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;

import java.util.List;
import projectakhir.class1.Motor;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public interface ITransaksi {
     public void insert (Motor m);
    public void update (Motor m);
    public void delete (int id);
    public List<Motor> getAll();
}
