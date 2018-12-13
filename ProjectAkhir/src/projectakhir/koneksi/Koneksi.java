/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sin
 */
public class Koneksi {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public Connection Class(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/potretkekinian","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return con;
    }
}
