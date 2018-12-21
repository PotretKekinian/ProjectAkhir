/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectakhir.class1.Transaksi;
import projectakhir.koneksi.Koneksi;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class TransaksiDAO implements ITransaksi{
    
      public Connection con;
    
    String insert ="Insert Into transaksi (nama, alamat, noHp, nik, tglklr) VALUES (?,?,?,?,?);";
    String update ="UPDATE transaksi set nama=?, alamat=?, noHp=?, nik=?, tglklr=?";
    String delete ="Delete From transaksi where id=? ;";
    String select ="Select * From transaksi;";
    
    public TransaksiDAO(){
        con=Koneksi.Connection();
    }
    
    @Override
    public void insert(Transaksi ts) {
        PreparedStatement st = null;
        try {
            st=con.prepareStatement(insert);
            st.setString(1, ts.getNama());
            st.setString(2, ts.getAlamat());
            st.setInt(3, ts.getNoHp());
            st.setInt(4, ts.getNik());
            st.setString(5, ts.getTglklr());
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
    public void update(Transaksi ts){
        PreparedStatement st = null;
    try {
        st=con.prepareStatement(update);
        st.setString(1, ts.getNama());
        st.setString(2, ts.getAlamat());
        st.setInt(3, ts.getNoHp());
        st.setInt(4, ts.getNik());
        st.setString(5, ts.getTglklr());
        st.executeUpdate();
    } catch (SQLException e){
        e.printStackTrace();
    }finally{
        try{
            st.close();
        }catch (SQLException e){
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
    public List<Transaksi> getAll() {
        List<Transaksi> ls = null;
        try {
            ls = new ArrayList<Transaksi>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Transaksi ts = new Transaksi();
                ts.setNama(rs.getString("nama"));
                ts.setAlamat(rs.getString("alamat"));
                ts.setNoHp(rs.getInt("noHp"));
                ts.setNik(rs.getInt("nik"));
                ts.setTglklr(rs.getString("tglklr"));
                ls.add(ts);
            }
        } catch (SQLException e) {
            Logger.getLogger(MotorMasukDAO.class.getName()).log(Level.SEVERE,null,e);
        }
        return ls;
    }
}
