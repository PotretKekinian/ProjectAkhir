/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhirclass;
import java.util.*;
/**
 *
 * @author sin
 */
public class InputMotor {
    ArrayList<Motor> ListMotor;
    
    
    public InputMotor(){
        ListMotor = new ArrayList();
    }
    
    public void isiMotor(String merk, String tipe, int nopol, String warna, String jt, Date tglmsk, Date tglklr, int harga){
        Motor mtr = new Motor(merk, tipe, nopol, warna, jt, tglmsk, tglklr, harga);
        ListMotor.add(mtr);
    }
    
    public ArrayList<Motor> getData(){
        return ListMotor;
    }

    public void isiData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
