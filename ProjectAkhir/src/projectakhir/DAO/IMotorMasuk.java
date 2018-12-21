/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;
import java.util.*;
import projectakhir.class1.Motor;

/**
 *
 * @author sin
 */

public interface IMotorMasuk {
    public void insert (Motor m);
    public void delete (int id);
    public List<Motor> getAll();
}
