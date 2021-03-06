/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.lt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectakhir.DAO.IMotorMasuk;
import projectakhir.DAO.ITransaksi;
import projectakhir.DAO.MotorMasukDAO;
import projectakhir.DAO.TransaksiDAO;
import projectakhir.class1.Motor;
import projectakhir.class1.Transaksi;
import projectakhir.koneksi.Koneksi;
import projectakhir.model.TabelModelMotor;
import projectakhir.model.TabelModelTraksaksi;
/**
 *
 * @author sin
 */
public class DataTransaksi extends javax.swing.JFrame {

    TransaksiDAO dao;
    public DataTransaksi() {
        initComponents();
        dao= new TransaksiDAO() {};
        isiTahun();
        isiTanggal();
        isiTable();
        isiTabel();
    }
    
     private void isiTable(){
        ITransaksi iTransaksi = new TransaksiDAO() {};
        List<Transaksi> lm = iTransaksi.getAll();
        TabelModelTraksaksi tbModel = new TabelModelTraksaksi(lm);
        this.datatransaksiTableTRAN.setModel(tbModel);
     }
     
      private void isiTabel(){
        IMotorMasuk iMotor = new MotorMasukDAO() {};
        List<Motor> lm = iMotor.getAll();
        TabelModelMotor tbModel = new TabelModelMotor(lm);
        this.datatransaksiTableTRAN.setModel(tbModel);
     }
    public String getTgl(){
        int dd = Integer.parseInt(tglComboBox.getSelectedItem().toString());
        int mm = bulanComboBox.getSelectedIndex()+1;
        int yy = Integer.parseInt(tahunComboBox.getSelectedItem().toString());
        String tgl = yy+"/"+mm+"/"+dd;
        return tgl;
    }
  
    private void isiTahun(){
        Calendar cal = Calendar.getInstance();
        int awal = cal.get(cal.YEAR);
        Integer[] isi = new Integer[60];
        for (int i = 0; i < isi.length; i++) {
            isi[i]=awal-i;
        }
        DefaultComboBoxModel cbtahunModel = new DefaultComboBoxModel(isi);
        tahunComboBox.setModel(cbtahunModel);
    }
    
    private void isiTanggal(){
        int tgl=1;
        Integer[] isi = new Integer[31];
        for (int i = 0; i < 31; i++) {
            isi[i]=tgl;
            tgl++;
        }
        DefaultComboBoxModel cbtglModel = new DefaultComboBoxModel(isi);
        tglComboBox.setModel(cbtglModel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nopolTRANField = new javax.swing.JTextField();
        okTRANButton = new javax.swing.JButton();
        warnaTRANField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtTRANField = new javax.swing.JTextField();
        tipeTRANField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hargaTRANField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pilihanTRANComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datatransaksiTableTRAN = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        namaTRANField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        alamatTRANField = new javax.swing.JTextField();
        nohpTRANField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nikTRANField = new javax.swing.JTextField();
        kembaliTRANButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tglComboBox = new javax.swing.JComboBox<>();
        bulanComboBox = new javax.swing.JComboBox<>();
        tahunComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Harga Beli");

        jLabel8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel8.setText("Transaksi Showroom PotretKekinian");
        jLabel8.setAlignmentX(25.0F);
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel1.setText("Merk");

        nopolTRANField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolTRANFieldActionPerformed(evt);
            }
        });

        okTRANButton.setText("OK");
        okTRANButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okTRANButtonActionPerformed(evt);
            }
        });

        warnaTRANField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warnaTRANFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipe");

        jLabel3.setText("NOPOL");

        jLabel4.setText("Warna");

        pilihanTRANComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Yamaha", "Kawasaki", "Suzuki" }));
        pilihanTRANComboBox.setSelectedIndex(-1);

        jLabel5.setText("Jenis Transmisi");

        datatransaksiTableTRAN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "No Hp", "NIK", "Tanggal Beli", "Merk", "Tipe", "NOPOL", "Warna", "Jenis Transmisi", "Harga", "Jumlah", "Total", "Bayar", "Kembali"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(datatransaksiTableTRAN);
        if (datatransaksiTableTRAN.getColumnModel().getColumnCount() > 0) {
            datatransaksiTableTRAN.getColumnModel().getColumn(1).setResizable(false);
            datatransaksiTableTRAN.getColumnModel().getColumn(2).setResizable(false);
            datatransaksiTableTRAN.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel12.setText("Nama");

        jLabel13.setText("Alamat");

        jLabel14.setText("No Hp");

        nohpTRANField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohpTRANFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("NIK");

        kembaliTRANButton.setText("Kembali");
        kembaliTRANButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliTRANButtonActionPerformed(evt);
            }
        });

        jLabel16.setText("Tanggal Beli");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sin\\Documents\\NetBeansProjects\\ProjectAkhir\\ProjectAkhir\\src\\images\\transaksi.png")); // NOI18N

        tglComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "Oktober", "November", "Desember" }));

        tahunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nikTRANField)
                                    .addComponent(nohpTRANField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alamatTRANField)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(48, 48, 48)
                                    .addComponent(namaTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jtTRANField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tipeTRANField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                        .addComponent(nopolTRANField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pilihanTRANComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(warnaTRANField))
                                    .addComponent(hargaTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(456, 456, 456))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(okTRANButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kembaliTRANButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(2, 2, 2))
                            .addComponent(namaTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(alamatTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nohpTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(nikTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pilihanTRANComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipeTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(nopolTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(warnaTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaTRANField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliTRANButton)
                    .addComponent(okTRANButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nopolTRANFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolTRANFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nopolTRANFieldActionPerformed

    private void nohpTRANFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohpTRANFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohpTRANFieldActionPerformed

    private void kembaliTRANButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliTRANButtonActionPerformed
        Data dt=new Data();
        dt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliTRANButtonActionPerformed

    private void warnaTRANFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warnaTRANFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warnaTRANFieldActionPerformed

    private void okTRANButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okTRANButtonActionPerformed
        Transaksi ts = new Transaksi();
        ts.setNama(namaTRANField.getText());
        ts.setAlamat(alamatTRANField.getText());
        ts.setNoHp(Integer.parseInt(nohpTRANField.getText()));
        ts.setNik(Integer.parseInt(nikTRANField.getText()));
        ts.setTglklr(getTgl());
        dao.insert(ts);
        isiTable();
    }//GEN-LAST:event_okTRANButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTRANField;
    private javax.swing.JComboBox<String> bulanComboBox;
    private javax.swing.JTable datatransaksiTableTRAN;
    private javax.swing.JTextField hargaTRANField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtTRANField;
    private javax.swing.JButton kembaliTRANButton;
    private javax.swing.JTextField namaTRANField;
    private javax.swing.JTextField nikTRANField;
    private javax.swing.JTextField nohpTRANField;
    private javax.swing.JTextField nopolTRANField;
    private javax.swing.JButton okTRANButton;
    private javax.swing.JComboBox<String> pilihanTRANComboBox;
    private javax.swing.JComboBox<String> tahunComboBox;
    private javax.swing.JComboBox<String> tglComboBox;
    private javax.swing.JTextField tipeTRANField;
    private javax.swing.JTextField warnaTRANField;
    // End of variables declaration//GEN-END:variables
}
