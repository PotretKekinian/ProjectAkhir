/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sin
 */
public class Koneksi {
    Connection con;
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/potretkekinian","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return con;
    }
}
