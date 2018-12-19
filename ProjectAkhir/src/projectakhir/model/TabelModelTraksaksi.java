/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import projectakhirclass.transaksi;
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
        return 8;
    }
    
    public String getColumnName (int column){
        switch(column){
            case 0: return "alamat";
            case 1: return "noHp";
            case 2: return "ink";
            case 3: return "merk";
            case 4: return "tipe";
            case 5: return "nopol";
            case 6: return "warna";
            case 7: return "jt";
            default: return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0: return lt.get(rowIndex).getAlamat();
            case 1: return lt.get(rowIndex).getNoHp();
            case 2: return lt.get(rowIndex).getInk();
            case 3: return lt.get(rowIndex).getMerk();
            case 4: return lt.get(rowIndex).getTipe();
            case 5: return lt.get(rowIndex).getNopol();
            case 6: return lt.get(rowIndex).getWarna();
            case 7: return lt.get(rowIndex).getJt();
            default: return null;
        }
}
}
    
