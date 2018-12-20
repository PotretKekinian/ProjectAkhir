/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.koneksi;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sin
 */
public class Koneksi {
    static Connection con;

    
    public static Connection Connection(){

        if (con==null){
        MysqlDataSource data = new MysqlConnectionPoolDataSource();
            data.setDatabaseName("potretkekinian");
            data.setUser("root");
            data.setPassword("");
            try {
                con=data.getConnection();
            } catch (SQLException e) {
            }
        }   
        return con;
    }
}
