/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir.model;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import projectakhirclass.Motor;
/**
 *
 * @author sin
 */
public class TabelModelMotor extends AbstractTableModel{
    List <Motor> lb;
    
    public TabelModelMotor(List<Motor> lb){
        this.lb = lb;
    }
    
    @Override
    public int getRowCount(){
        return lb.size();
    }
    
    @Override
    public int getColumnCount(){
        return 7;
    }
    
    public String getColumnName (int column){
        switch(column){
            case 0: return "Merk";
            case 1: return "Tipe";
            case 2: return "Nopol";
            case 3: return "Warna";
            case 4: return "Jenis Transmisi";
            case 5: return "Tanggal Masuk";
            case 6: return "Harga";
            default: return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0: return lb.get(rowIndex).getMerk();
            case 1: return lb.get(rowIndex).getTipe();
            case 2: return lb.get(rowIndex).getNopol();
            case 3: return lb.get(rowIndex).getWarna();
            case 4: return lb.get(rowIndex).getJt();
            case 5: return lb.get(rowIndex).getTglmsk();
            case 6: return lb.get(rowIndex).getHarga();
            default: return null;
        }
    }
}
