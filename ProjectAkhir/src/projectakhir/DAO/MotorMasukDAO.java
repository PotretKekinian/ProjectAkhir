/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectakhir.koneksi.Koneksi;
import projectakhir.class1.Motor;
/**
 *
 * @author sin
 */
public class MotorMasukDAO implements IMotorMasuk{
 
    public Connection con;
    
    String insert ="Insert Into motormasuk (merk, tipe, nopol, warna, jt, tglmsk, harga) VALUES (?,?,?,?,?,?,?);";
    String delete ="Delete From motormasuk where id=? ;";
    String select ="Select * From motormasuk;";
    
    public MotorMasukDAO() {
        con=Koneksi.Connection();
    }
    
    
    @Override
    public void insert(Motor m) {
        PreparedStatement st = null;
        try {
            st=con.prepareStatement(insert);
            st.setString(1, m.getMerk());
            st.setString(2, m.getTipe());
            st.setString(3, m.getNopol());
            st.setString(4, m.getWarna());
            st.setString(5, m.getJt());
            st.setString(6, m.getTglmsk());
            st.setInt(7, m.getHarga());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Motor m) {
       PreparedStatement st = null;
        try {
            st=con.prepareStatement(insert);
            st.setString(1, m.getMerk());
            st.setString(2, m.getTipe());
            st.setString(3, m.getNopol());
            st.setString(4, m.getWarna());
            st.setString(5, m.getJt());
            st.setString(6, m.getTglmsk());
            st.setInt(7, m.getHarga());
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
       PreparedStatement st = null;
        try {
           st = con.prepareStatement(delete);
           st.setInt(1, id);
           st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Motor> getAll() {
        List<Motor> lm = null;
        try {
            lm = new ArrayList<Motor>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Motor m = new Motor();
                m.setId(rs.getInt("id"));
                m.setMerk(rs.getString("merk"));
                m.setTipe(rs.getString("tipe"));
                m.setNopol(rs.getString("nopol"));
                m.setWarna(rs.getString("warna"));
                m.setJt(rs.getString("jt"));
                m.setTglmsk(rs.getString("tglmsk"));
                m.setHarga(rs.getInt("harga"));
                lm.add(m);
            }
        } catch (SQLException e) {
            Logger.getLogger(MotorMasukDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return lm;
    }
}
