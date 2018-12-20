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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectakhir.DAO.IMotorMasuk;
import projectakhir.DAO.MotorMasukDAO;
import projectakhir.class1.Motor;
import projectakhir.koneksi.Koneksi;
import projectakhir.model.TabelModelMotor;
/**
 *
 * @author sin
 */
public class MotorMasuk extends javax.swing.JFrame {

   MotorMasukDAO dao;
    
    public MotorMasuk(){
        initComponents();
        dao= new MotorMasukDAO() {};
        isiTahun();
        isiTanggal();
        isiTable();
    }
    
     private void isiTable(){
        IMotorMasuk iMotor = new MotorMasukDAO() {};
        List<Motor> lm = iMotor.getAll();
        TabelModelMotor tbModel = new TabelModelMotor(lm);
        this.datamasukTableMM.setModel(tbModel);
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
        kembaliMMButton = new javax.swing.JButton();
        nopolMMField = new javax.swing.JTextField();
        tglComboBox = new javax.swing.JComboBox<>();
        warnaMMField = new javax.swing.JTextField();
        bulanComboBox = new javax.swing.JComboBox<>();
        jtMMField = new javax.swing.JTextField();
        tahunComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        hargaMMField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        merkMMComboBox = new javax.swing.JComboBox<>();
        tipeMMField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        daftarMMButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datamasukTableMM = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Harga Beli");

        kembaliMMButton.setText("Kembali");
        kembaliMMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliMMButtonActionPerformed(evt);
            }
        });

        nopolMMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolMMFieldActionPerformed(evt);
            }
        });

        tglComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        warnaMMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warnaMMFieldActionPerformed(evt);
            }
        });

        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "Oktober", "November", "Desember" }));

        jtMMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMMFieldActionPerformed(evt);
            }
        });

        tahunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Merk");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipe");

        merkMMComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Yamaha", "Kawasaki", "Suzuki" }));
        merkMMComboBox.setSelectedIndex(-1);
        merkMMComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merkMMComboBoxActionPerformed(evt);
            }
        });

        tipeMMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeMMFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Motor Masuk Showroom PotretKekinian");
        jLabel8.setAlignmentX(25.0F);
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel3.setText("NOPOL");

        daftarMMButton.setText("Daftar");
        daftarMMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarMMButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Warna");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Data Motor Masuk");

        jLabel5.setText("Jenis Transmisi");

        datamasukTableMM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Merk", "Tipe", "NOPOL", "Warna", "Jenis Transmisi", "Tanggal Masuk", "Harga Beli"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(datamasukTableMM);

        jLabel6.setText("Tanggal Masuk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hargaMMField)
                    .addComponent(jtMMField)
                    .addComponent(warnaMMField)
                    .addComponent(nopolMMField)
                    .addComponent(tipeMMField)
                    .addComponent(merkMMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tahunComboBox, 0, 1, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(daftarMMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kembaliMMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tglComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaMMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(merkMMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tipeMMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(nopolMMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(warnaMMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtMMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(daftarMMButton)
                            .addComponent(kembaliMMButton)
                            .addComponent(deleteButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliMMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliMMButtonActionPerformed
        Data dt=new Data();
        dt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliMMButtonActionPerformed

    private void nopolMMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolMMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nopolMMFieldActionPerformed

    private void warnaMMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warnaMMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warnaMMFieldActionPerformed

    private void jtMMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMMFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String id = datamasukTableMM.getModel().getValueAt(datamasukTableMM.getSelectedRow(), 0).toString();
        dao.delete(new Integer(id));
        isiTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void merkMMComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merkMMComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merkMMComboBoxActionPerformed

    private void tipeMMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeMMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipeMMFieldActionPerformed

    private void daftarMMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarMMButtonActionPerformed
        Motor mtr = new Motor();
        mtr.setMerk(merkMMComboBox.getSelectedItem().toString());
        mtr.setTipe(tipeMMField.getText());
        mtr.setNopol(nopolMMField.getText());
        mtr.setWarna(warnaMMField.getText());
        mtr.setJt(jtMMField.getText());
        mtr.setTglmsk(getTgl());
        mtr.setHarga(Integer.parseInt(hargaMMField.getText()));
        dao.insert(mtr);
        isiTable();

    }//GEN-LAST:event_daftarMMButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MotorMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bulanComboBox;
    private javax.swing.JButton daftarMMButton;
    private javax.swing.JTable datamasukTableMM;
    private javax.swing.JToggleButton deleteButton;
    private javax.swing.JTextField hargaMMField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtMMField;
    private javax.swing.JButton kembaliMMButton;
    private javax.swing.JComboBox<String> merkMMComboBox;
    private javax.swing.JTextField nopolMMField;
    private javax.swing.JComboBox<String> tahunComboBox;
    private javax.swing.JComboBox<String> tglComboBox;
    private javax.swing.JTextField tipeMMField;
    private javax.swing.JTextField warnaMMField;
    // End of variables declaration//GEN-END:variables
}
