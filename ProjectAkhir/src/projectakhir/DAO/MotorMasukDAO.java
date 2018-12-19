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
import projectakhirclass.Motor;

/**
 *
 * @author sin
 */
public abstract class MotorMasukDAO implements IMotorMasuk{

    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    String insert ="Insert Into motormasuk (merk, tipe, nopol, warna, jt, tglmsk, harga) VALUES (?,?,?,?,?,?,?);";
    String update ="Update motormasuk set merk=?, tipe=?, nopol=?, warna=?, jt=?, tglmsk=?, harga=?;";
    String delete ="Delete * From motormasuk where id_marang=? ;";
    String select ="Select * From motormasuk;";
    String carinama ="Select * From motormasuk WHERE tipe like ?";

    public MotorMasukDAO(Connection con) {
        this.con=con;
    }
    
    
    @Override
    public void insert(Motor m) {
        PreparedStatement st = null;
        try {
            st=con.prepareStatement(insert);
            st.setString(1, m.getMerk());
            st.setString(2, m.getTipe());
            st.setInt(3, m.getNopol());
            st.setString(4, m.getWarna());
            st.setString(5, m.getJt());
            st.setDate(6, (Date) m.getTglmsk());
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
    public void update(Motor m) {
       PreparedStatement st = null;
        try {
            st=con.prepareStatement(insert);
            st.setString(1, m.getMerk());
            st.setString(2, m.getTipe());
            st.setInt(3, m.getNopol());
            st.setString(4, m.getWarna());
            st.setString(5, m.getJt());
            st.setDate(6, (Date) m.getTglmsk());
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
       Statement st = null;
        try {
           PreparedStatement Statement = con.prepareStatement(delete);
           Statement.setInt(1, id);
           Statement.executeUpdate();
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
                m.setMerk(rs.getString("Merk"));
                m.setTipe(rs.getString("Tipe"));
                m.setNopol(rs.getInt("NOPOL"));
                m.setWarna(rs.getString("Warna"));
                m.setJt(rs.getString("Jenis Transmisi"));
                m.setTglmsk(rs.getDate("Tanggal Masuk"));
                m.setHarga(rs.getInt("Harga"));
                lm.add(m);
            }
        } catch (SQLException e) {
            Logger.getLogger(MotorMasukDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return lm;
    }
}
