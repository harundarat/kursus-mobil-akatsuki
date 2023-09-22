/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myEntityManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import myConnection.Koneksi;

/**
 *
 * @author Harun
 */
public class frmTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form frmTransaksi
     */
    public static frmTransaksi frmInstance;
    public JTextField txtClient, txtJadwal, txtPaket;
    
    public frmTransaksi() {
        initComponents();
        frmInstance = this;
        txtClient = tClient;
        txtJadwal = tJadwal;
        txtPaket = tPaket;
        setLocationRelativeTo(null);
        setResizable(false);
        tIdTransaksi.setEditable(false);
        table();
    }
    
    private void table(){
        DefaultTableModel tbl = new DefaultTableModel(){
        public boolean isCellEditable(int rowIndex, int colIndex){
        return false;
        }
        };
        tbl.addColumn("ID Transaksi");
        tbl.addColumn("Jadwal");
        tbl.addColumn("Pengguna");
        tbl.addColumn("Paket");
        tbl.addColumn("Status");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transaksi");
            
            while (rs.next()) {                
                tbl.addRow(new Object[] {
                    rs.getString("id_transaksi"),
                    rs.getString("id_jadwal"),
                    rs.getString("nik"),
                    rs.getString("id_paket"),
                    rs.getString("status")
                });
                jTable1.setModel(tbl);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi database gagal" + e.getMessage());
        }
    }
    
     void cari(){
       DefaultTableModel tbl = new DefaultTableModel(){
        public boolean isCellEditable(int rowIndex, int colIndex){
        return false;
        }
        };
        tbl.addColumn("ID Transaksi");
        tbl.addColumn("Jadwal");
        tbl.addColumn("Pengguna");
        tbl.addColumn("Paket");
        tbl.addColumn("Status");
        
        try {
            String sql = "SELECT * FROM transaksi WHERE nik = " + tCari.getText();
            Connection con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            
            while (rs.next()) {                
                tbl.addRow(new Object[] {
                    rs.getString("id_transaksi"),
                    rs.getString("id_jadwal"),
                    rs.getString("nik"),
                    rs.getString("id_paket"),
                    rs.getString("status")
                });
                jTable1.setModel(tbl);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
     
     void bersih () {
         tIdTransaksi.setText("");
         tJadwal.setText("");
         tClient.setText("");
         tPaket.setText("");
         buttonGroupStatus.clearSelection();
         
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSimpan = new java.awt.Button();
        btnKembali = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPilihPaket = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        tClient = new javax.swing.JTextField();
        tCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tJadwal = new javax.swing.JTextField();
        btnPilihJadwal = new java.awt.Button();
        btnPilihClient = new java.awt.Button();
        tIdTransaksi = new javax.swing.JTextField();
        rbSelesai = new javax.swing.JRadioButton();
        btnEdit = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHapus = new java.awt.Button();
        rbBerjalan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnCari = new java.awt.Button();
        tPaket = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        btnSimpan.setBackground(new java.awt.Color(243, 156, 18));
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSimpan.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setLabel("Simpan");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(243, 156, 18));
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKembali.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setLabel("Kembali");
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Transaksi :");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*Pencarian berdasarkan nik");

        btnPilihPaket.setBackground(new java.awt.Color(243, 156, 18));
        btnPilihPaket.setForeground(new java.awt.Color(255, 255, 255));
        btnPilihPaket.setLabel("Pilih");
        btnPilihPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihPaketMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client ( NIK ) :");

        tClient.setBackground(new java.awt.Color(255, 255, 255));
        tClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tClientActionPerformed(evt);
            }
        });

        tCari.setBackground(new java.awt.Color(255, 255, 255));
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jadwal ( ID ) :");

        tJadwal.setBackground(new java.awt.Color(255, 255, 255));
        tJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJadwalActionPerformed(evt);
            }
        });

        btnPilihJadwal.setBackground(new java.awt.Color(243, 156, 18));
        btnPilihJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnPilihJadwal.setLabel("Pilih");
        btnPilihJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihJadwalMouseClicked(evt);
            }
        });
        btnPilihJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihJadwalActionPerformed(evt);
            }
        });

        btnPilihClient.setBackground(new java.awt.Color(243, 156, 18));
        btnPilihClient.setForeground(new java.awt.Color(255, 255, 255));
        btnPilihClient.setLabel("Pilih");
        btnPilihClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihClientMouseClicked(evt);
            }
        });

        tIdTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        tIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIdTransaksiActionPerformed(evt);
            }
        });

        buttonGroupStatus.add(rbSelesai);
        rbSelesai.setForeground(new java.awt.Color(255, 255, 255));
        rbSelesai.setText("Selesai");

        btnEdit.setBackground(new java.awt.Color(243, 156, 18));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEdit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setLabel("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pembelian / Transaksi");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status :");

        btnHapus.setBackground(new java.awt.Color(243, 156, 18));
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHapus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setLabel("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        buttonGroupStatus.add(rbBerjalan);
        rbBerjalan.setForeground(new java.awt.Color(255, 255, 255));
        rbBerjalan.setText("Berjalan");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Paket ( ID ) :");

        btnCari.setBackground(new java.awt.Color(243, 156, 18));
        btnCari.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setLabel("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tPaket.setBackground(new java.awt.Color(255, 255, 255));
        tPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPaketActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbBerjalan)
                                .addGap(18, 18, 18)
                                .addComponent(rbSelesai))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tPaket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(tClient, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tJadwal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPilihJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPilihClient, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPilihPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tIdTransaksi)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tCari)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(tJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPilihJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnPilihClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(rbBerjalan)
                                    .addComponent(rbSelesai)))
                            .addComponent(btnPilihPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked

        String status = null;

        if (rbBerjalan.isSelected()) {
            status = "Berjalan";
        } else if (rbSelesai.isSelected()) {
            status = "Selesai";
        }

        try {

            String Query = "INSERT INTO transaksi VALUES (?,?,?,?,?)";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(Query);

            pst.setNull(1, Types.INTEGER);
            pst.setString(2, tJadwal.getText());
            pst.setString(3, tClient.getText());
            pst.setString(4, tPaket.getText());
            pst.setString(5, status);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            bersih();
            table();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan " + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnPilihPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihPaketMouseClicked
        // TODO add your handling code here:
        tblPaket tp = new tblPaket();
        tp.setVisible(true);
    }//GEN-LAST:event_btnPilihPaketMouseClicked

    private void tClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tClientActionPerformed

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariActionPerformed

    private void tJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJadwalActionPerformed

    private void btnPilihJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihJadwalMouseClicked
        // TODO add your handling code here:
        tblJadwal tj = new tblJadwal();
        tj.setVisible(true);
    }//GEN-LAST:event_btnPilihJadwalMouseClicked

    private void btnPilihClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihClientMouseClicked
        // TODO add your handling code here:
        tblClient tc = new tblClient();
        tc.setVisible(true);
    }//GEN-LAST:event_btnPilihClientMouseClicked

    private void tIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIdTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIdTransaksiActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:

        String status = null;

        if (rbBerjalan.isSelected()) {
            status = "Berjalan";
        } else if (rbSelesai.isSelected()) {
            status = "Selesai";
        }

        try {
            String Query = "UPDATE transaksi SET id_transaksi=?, id_jadwal=?, nik=?, id_paket = ?, status = ? WHERE id_transaksi=?";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(Query);

            pst.setString(1, tIdTransaksi.getText());
            pst.setString(2, tJadwal.getText());
            pst.setString(3, tClient.getText());
            pst.setString(4, tPaket.getText());
            pst.setString(5, status);
            pst.setString(6, tIdTransaksi.getText());

            pst.executeUpdate();
            bersih();
            JOptionPane.showMessageDialog(null, "Data " + tIdTransaksi.getText() + " berhasil diupdate !!");
            table();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        try {
            String Query = "DELETE FROM transaksi WHERE id_transaksi=?";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(Query);

            pst.setString(1, tIdTransaksi.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data " + tIdTransaksi.getText() + " berhasil dihapus");
            bersih();
            table();

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void tPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPaketActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String idTransaksi = jTable1.getValueAt(baris, 0).toString();
        tIdTransaksi.setText(idTransaksi);
        String idJadwal = jTable1.getValueAt(baris, 1).toString();
        tJadwal.setText(idJadwal);
        String clientNik = jTable1.getValueAt(baris, 2).toString();
        tClient.setText(clientNik);
        String idPaket= jTable1.getValueAt(baris, 3).toString();
        tPaket.setText(idPaket);
        String status = jTable1.getValueAt(baris, 4).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnPilihJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihJadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihJadwalActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCari;
    private java.awt.Button btnEdit;
    private java.awt.Button btnHapus;
    private java.awt.Button btnKembali;
    private java.awt.Button btnPilihClient;
    private java.awt.Button btnPilihJadwal;
    private java.awt.Button btnPilihPaket;
    private java.awt.Button btnSimpan;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbBerjalan;
    private javax.swing.JRadioButton rbSelesai;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tClient;
    private javax.swing.JTextField tIdTransaksi;
    private javax.swing.JTextField tJadwal;
    private javax.swing.JTextField tPaket;
    // End of variables declaration//GEN-END:variables
}
