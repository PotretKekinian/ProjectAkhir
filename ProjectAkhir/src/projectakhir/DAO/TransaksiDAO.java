/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.DAO;

import java.sql.Connection;
import java.util.List;
import projectakhir.class1.Motor;
import projectakhir.koneksi.Koneksi;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class TransaksiDAO implements ITransaksi{
    
    public Connection con;
    
    public TransaksiDAO(){
        con=Koneksi.Connection();
    }
    
    @Override
    public void insert(){
    try {
        st=con.prepareStatement(insert);
        st.setString(1, m.getAlamat());
        st.setInt(2, m.getnoHp());
        st.setInt(3, m.getNik());
        st.setInt(4, m.gettglklr());
        st.setString(5, m.getTipe());
        st.setInt(6, m.getNopol());
        st.setString(7, m.getWarna());
        st.setString(8, m.getJt());
        st.setInt(9, m.getHarga());
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
    public void update{
        PreparedStatement st = null;
    try {
        st=con.prepareStatement(insert);
        st.setString(1, m.getAlamat());
        st.setInt(2, m.getnoHp());
        st.setInt(3, m.getNik());
        st.setInt(4, m.gettglklr());
        st.setString(5, m.getTipe());
        st.setInt(6, m.getNopol());
        st.setString(7, m.getWarna());
        st.setString(8, m.getJt());
        st.setInt(9, m.getHarga());
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
    public void delete(){
        PreparedStatement st = null;
            try {
                st = con.prepareStatement}}

    @Override
    public void insert(Motor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Motor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Motor> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
