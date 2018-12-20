/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import projectakhir.class1.Motor;
/**
 *
 * @author sin
 */
public class TabelModelMotor extends AbstractTableModel{
    List <Motor> lm;
    
    public TabelModelMotor(List<Motor> lm){
        this.lm = lm;
    }
    
    @Override
    public int getRowCount(){
        return lm.size();
    }
    
    @Override
    public int getColumnCount(){
        return 8;
    }
    
    public String getColumnName (int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Merk";
            case 2: return "Tipe";
            case 3: return "Nopol";
            case 4: return "Warna";
            case 5: return "Jenis Transmisi";
            case 6: return "Tanggal Masuk";
            case 7: return "Harga";
            default: return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0: return lm.get(rowIndex).getId();
            case 1: return lm.get(rowIndex).getMerk();
            case 2: return lm.get(rowIndex).getTipe();
            case 3: return lm.get(rowIndex).getNopol();
            case 4: return lm.get(rowIndex).getWarna();
            case 5: return lm.get(rowIndex).getJt();
            case 6: return lm.get(rowIndex).getTglmsk();
            case 7: return lm.get(rowIndex).getHarga();
            default: return null;
        }
    }
}
