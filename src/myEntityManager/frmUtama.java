/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myEntityManager;

import javax.swing.JOptionPane;
import myConnection.Koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Harun
 */
public class frmUtama extends javax.swing.JFrame {

    /**
     * Creates new form frmUtama
     */
    public frmUtama() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btnKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        btnClient = new java.awt.Button();
        btnInstrukur = new java.awt.Button();
        btnPaket = new java.awt.Button();
        btnTransaksi = new java.awt.Button();
        btnJadwal = new java.awt.Button();
        btnAbout = new java.awt.Button();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kursus Mobil Akatsuki");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cetak ...", "Instruktur", "Client", "Paket", "Transaksi", "Jadwal" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        btnClient.setBackground(new java.awt.Color(243, 156, 18));
        btnClient.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClient.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnClient.setForeground(new java.awt.Color(255, 255, 255));
        btnClient.setLabel("Client");
        btnClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientMouseClicked(evt);
            }
        });
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnInstrukur.setBackground(new java.awt.Color(243, 156, 18));
        btnInstrukur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInstrukur.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnInstrukur.setForeground(new java.awt.Color(255, 255, 255));
        btnInstrukur.setLabel("Instruktur");
        btnInstrukur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstrukurMouseClicked(evt);
            }
        });
        btnInstrukur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrukurActionPerformed(evt);
            }
        });

        btnPaket.setBackground(new java.awt.Color(243, 156, 18));
        btnPaket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPaket.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPaket.setForeground(new java.awt.Color(255, 255, 255));
        btnPaket.setLabel("Paket");
        btnPaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaketMouseClicked(evt);
            }
        });
        btnPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaketActionPerformed(evt);
            }
        });

        btnTransaksi.setBackground(new java.awt.Color(243, 156, 18));
        btnTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTransaksi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setLabel("Transaksi");
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
        });
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        btnJadwal.setBackground(new java.awt.Color(243, 156, 18));
        btnJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJadwal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnJadwal.setLabel("Jadwal\n");
        btnJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJadwalMouseClicked(evt);
            }
        });
        btnJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(243, 156, 18));
        btnAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbout.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setLabel("About");
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInstrukur, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKeluar)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaket, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstrukur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int pilihan = JOptionPane.showConfirmDialog(null,"Apakah yakin untuk keluar?",
            "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilihan == JOptionPane.OK_OPTION){
            System.exit(0);
        }else{
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedIndex() == 1){
           try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportInstruktur.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        } else if (jComboBox3.getSelectedIndex() == 2) {
            try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportClient.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        } else if (jComboBox3.getSelectedIndex() == 3) {
            try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportPaket.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        } else if (jComboBox3.getSelectedIndex() == 4) {
            try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportTransaksi.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        } else if (jComboBox3.getSelectedIndex() == 5) {
            try {
        JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportJadwal.jasper"), null, Koneksi.getConnection());
        JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientMouseClicked

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        // TODO add your handling code here:
        frmClient fcli = new frmClient();
        fcli.setVisible(true);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnInstrukurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstrukurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstrukurMouseClicked

    private void btnInstrukurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrukurActionPerformed
        frmInstruktur fi= new frmInstruktur();
        fi.setVisible(true);
    }//GEN-LAST:event_btnInstrukurActionPerformed

    private void btnPaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaketMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaketMouseClicked

    private void btnPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaketActionPerformed
        frmPaket fp = new frmPaket();
        fp.setVisible(true);
    }//GEN-LAST:event_btnPaketActionPerformed

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        // TODO add your handling code here:
        frmTransaksi ftrans = new frmTransaksi();
        ftrans.setVisible(true);
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJadwalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJadwalMouseClicked

    private void btnJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalActionPerformed
        // TODO add your handling code here:
        frmJadwal fjad = new frmJadwal();
        fjad.setVisible(true);
    }//GEN-LAST:event_btnJadwalActionPerformed

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        About A = new About();
        A.setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAbout;
    private java.awt.Button btnClient;
    private java.awt.Button btnInstrukur;
    private java.awt.Button btnJadwal;
    private javax.swing.JButton btnKeluar;
    private java.awt.Button btnPaket;
    private java.awt.Button btnTransaksi;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
