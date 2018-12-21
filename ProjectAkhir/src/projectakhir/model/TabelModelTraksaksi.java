/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import projectakhir.class1.Transaksi;
import java.util.*;

/**
 *
 * @author Bahrudin<bahrudinrizky313@gmai.com>
 */
public class TabelModelTraksaksi extends AbstractTableModel {
    List <Transaksi> lt;
    
    public TabelModelTraksaksi(List<Transaksi> lt){
        this.lt = lt;
    }
    
    @Override
    public int getRowCount(){
        return lt.size();
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    public String getColumnName (int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Nama";
            case 2: return "Alamat";
            case 3: return "NoHp";
            case 4: return "NIK";
            case 5: return "Tanggal Keluar";
            default: return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0: return lt.get(rowIndex).getId();
            case 1: return lt.get(rowIndex).getNama();
            case 2: return lt.get(rowIndex).getAlamat();
            case 3: return lt.get(rowIndex).getNoHp();
            case 4: return lt.get(rowIndex).getNik();
            case 5: return lt.get(rowIndex).getTglklr();
            default: return null;
        }
}
}
    
