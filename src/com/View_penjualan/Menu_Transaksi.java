/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.View_penjualan;

import com.Controller.Transaksi_controller;
import com.Model_penjualan.Barang;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alifiyah
 */
public class Menu_Transaksi extends javax.swing.JFrame {
    DefaultTableModel mdlkeranjang = new DefaultTableModel(new String[]{"ID","Nama Barang","Satuan","Harga"},0);
    Transaksi_controller tc;
    Integer Total = 0;
    Integer TotalSatuan = 0;
    Integer idtransaksi = 0;
    Integer Kembalian = 0;
    
    public Menu_Transaksi() throws SQLException {
        this.tc = new Transaksi_controller();
        initComponents();
        this.setLocationRelativeTo(null);
//        AmbilDataId();
        showComboBoxBarang();
        inittable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        teks_harga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        teks_satuan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        box_barang = new javax.swing.JComboBox<>();
        buttoninsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_transaksi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        kuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Buttonkeranjang = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Teks_bayar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Teks_kembalian = new javax.swing.JTextField();
        Button_bayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Total Harga :");

        teks_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teks_hargaActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Satuan :");

        jLabel1.setText("Barang :");

        box_barang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttoninsert.setText("Insert");
        buttoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninsertActionPerformed(evt);
            }
        });

        table_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_transaksi);

        jLabel2.setText("Keranjang belanja :");

        jLabel5.setText("gr");

        Buttonkeranjang.setText("Tambah ke keranjang");
        Buttonkeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonkeranjangActionPerformed(evt);
            }
        });

        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Uang :");

        jLabel7.setText("kembalian :");

        Teks_kembalian.setEditable(false);

        Button_bayar.setText("Bayar");
        Button_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_bayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(box_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(Buttonkeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ButtonBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(teks_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(165, 165, 165)
                                            .addComponent(buttoninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(66, 66, 66))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Button_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(teks_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(Teks_bayar)
                                            .addComponent(Teks_kembalian))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(Buttonkeranjang)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(teks_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(teks_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Teks_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addComponent(Button_bayar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Teks_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonBack)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttoninsert)
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonkeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonkeranjangActionPerformed
        Integer Indexbarang = box_barang.getSelectedIndex();
        String Id = tc.arrBarang.get(Indexbarang).getId_barang().toString();
        String nama = tc.arrBarang.get(Indexbarang).getNama_barang();
        String Harga = tc.arrBarang.get(Indexbarang).getHarga().toString();
        String Kuantity = kuantity.getText();
        Integer satuan = tc.arrBarang.get(Indexbarang).getSatuan();
        mdlkeranjang.addRow(new String[] {Id,nama,Kuantity,Harga});
        Integer cKuantity = Integer.parseInt(Kuantity);
        Integer cHarga = Integer.parseInt(Harga);
        //Integer Boxtotal = Integer.parseInt(teks_harga);
        Total = Total+cKuantity/satuan*cHarga;
        teks_harga.setText(Total.toString());
        TotalSatuan = TotalSatuan+cKuantity;
        teks_satuan.setText(TotalSatuan.toString());
        kuantity.setText("");
    }//GEN-LAST:event_ButtonkeranjangActionPerformed

    private void buttoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninsertActionPerformed
        try {
            idtransaksi = tc.GetId_transaksi(idtransaksi);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        String Tanggaltransaksi = formatter.format(date);
        float Totalharga =Float.parseFloat(teks_harga.getText()) ;
        Integer Totalsatuan = Integer.parseInt(teks_satuan.getText());
        try {
            tc.Insertdatatransaksi(idtransaksi, Tanggaltransaksi, Totalharga, Totalsatuan);
            
            for(int row = 0;row < mdlkeranjang.getRowCount();row++) {
                String Id = mdlkeranjang.getValueAt(row, 0).toString();
                tc.Insertdetailtransaksi(Id, idtransaksi);
            }
            JOptionPane.showMessageDialog(this,"Berhasil Input Data Transaksi");
            clear();
        } catch (Exception e) {
            System.err.println(e);
        }
       
    }//GEN-LAST:event_buttoninsertActionPerformed

    private void teks_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teks_hargaActionPerformed
        
    }//GEN-LAST:event_teks_hargaActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void Button_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_bayarActionPerformed
       Integer cBayar = Integer.parseInt(Teks_bayar.getText());
       Kembalian = cBayar-Total;
       Teks_kembalian.setText(Kembalian.toString());
    }//GEN-LAST:event_Button_bayarActionPerformed

    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton Button_bayar;
    private javax.swing.JButton Buttonkeranjang;
    private javax.swing.JTextField Teks_bayar;
    private javax.swing.JTextField Teks_kembalian;
    private javax.swing.JComboBox<String> box_barang;
    private javax.swing.JButton buttoninsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kuantity;
    private javax.swing.JTable table_transaksi;
    private javax.swing.JTextField teks_harga;
    private javax.swing.JTextField teks_satuan;
    // End of variables declaration//GEN-END:variables

    //private void AmbilDataId() throws SQLException{
      //String Id_Transaksi = tc.GetId_transaksi();
      
    //}
    private void AmbildataBarang()throws SQLException{
      tc.getDatabarang();
    }
    public void showComboBoxBarang() throws SQLException{
        DefaultComboBoxModel dcbmBarang = new DefaultComboBoxModel();
        for (Barang p : this.tc.getDatabarang()){
            dcbmBarang.addElement(p.getNama_barang()+" Rp."+p.getHarga()+ "/" +p.getSatuan()+" gr");  
        }
        this.box_barang.setModel(dcbmBarang);
    }
    public void inittable(){
       table_transaksi.setModel(mdlkeranjang);  
    }
    
    public void clear() throws SQLException{
        kuantity.setText("");
        teks_harga.setText("");
        teks_satuan.setText("");
        mdlkeranjang.setRowCount(0);
        TotalSatuan=0;
        Total=0;
        //AmbilDataId();
    }
}
