package views;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ModelNilai;
import models.ModelSiswa;

public class FormNilai extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model1 = new DefaultTableModel();

    public FormNilai() {
        initComponents();
        tblNilai.setModel(model);
        model.addColumn("No");
        model.addColumn("NIS");
        model.addColumn("Nama Siswa");
        model.addColumn("Nama Kelas");
        model.addColumn("Tanggal");
        model.addColumn("Nilai DTW");
        model.addColumn("Nilai DMT");
        model.addColumn("Nilai DTT");
        model.addColumn("Nilai DDB");
        model.addColumn("Nilai DPK");
        loadNilai();

        tblSiswa.setModel(model1);
        model1.addColumn("NIS");
        model1.addColumn("Nama Siswa");
        model1.addColumn("Jenis Kelamin");
        model1.addColumn("Nama Kelas");
        loadSiswa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmSiswa = new javax.swing.JDialog();
        xxx = new javax.swing.JScrollPane();
        tblSiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNilai1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNilai2 = new javax.swing.JTextField();
        txtNilai3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNilai4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNilai5 = new javax.swing.JTextField();
        btnPilih = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNilai = new javax.swing.JTable();
        btnBersih = new javax.swing.JButton();

        tblSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSiswaMouseClicked(evt);
            }
        });
        xxx.setViewportView(tblSiswa);

        javax.swing.GroupLayout FrmSiswaLayout = new javax.swing.GroupLayout(FrmSiswa.getContentPane());
        FrmSiswa.getContentPane().setLayout(FrmSiswaLayout);
        FrmSiswaLayout.setHorizontalGroup(
            FrmSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xxx)
                .addContainerGap())
        );
        FrmSiswaLayout.setVerticalGroup(
            FrmSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xxx, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel1.setText("NIS");

        txtNIS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNIS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNISKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel3.setText("Disiplin Waktu");

        txtNilai1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNilai1.setToolTipText("Nilai disiplin terhadap waktu (DTW)");
        txtNilai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNilai1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel4.setText("Mengerjakan Tugas");

        txtNilai2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNilai2.setToolTipText("Nilai disiplin  mengerjakan tugas (DMT)");

        txtNilai3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNilai3.setToolTipText("Nilai disiplin terhadap tata tertib (DTT)");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel5.setText("Tata Tertib");

        txtNilai4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNilai4.setToolTipText("Nilai disiplin dalam berpakain (DDB)");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("Disiplin Berpakaian");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel7.setText("Disiplin Pembayaran");

        txtNilai5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNilai5.setToolTipText("Nilai disiplin dalam pembayaran kewajiban (DPK)");

        btnPilih.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPilih.setText("...");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel8.setText("Tanggal");

        txtTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTanggalPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNilai1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNIS, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPilih))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(txtNilai2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(txtNilai3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNilai4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtNilai5)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNilai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPilih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNilai4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNilai5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblNilai.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNilai);

        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnBersih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd");
    String tanggal;

    private void loadNilai() {
        ModelNilai mu = new ModelNilai();
        model.getDataVector().removeAllElements();
        ResultSet r = mu.read();
        try {
            while (r.next()) {
                Object[] obj = new Object[10];
                obj[1] = r.getString("nis");
                obj[2] = r.getString("nama");
                obj[3] = r.getString("nama_kelas");
                obj[4] = r.getString("tanggal");
                obj[5] = r.getString("nilai1");
                obj[6] = r.getString("nilaI2");
                obj[7] = r.getString("nilaI3");
                obj[8] = r.getString("nilaI4");
                obj[9] = r.getString("nilaI5");
                model.addRow(obj);
                noTable();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void noTable() {
        int baris = model.getRowCount();
        for (int a = 0; a < baris; a++) {
            String nomor = String.valueOf(a + 1);
            model.setValueAt(nomor, a, 0);
        }
    }
    
    private void loadSiswa() {
        ModelSiswa mu = new ModelSiswa();
        model1.getDataVector().removeAllElements();
        ResultSet r = mu.read();
        try {
            while (r.next()) {
                Object[] obj = new Object[4];
                obj[0] = r.getString("nis");
                obj[1] = r.getString("nama");
                obj[2] = r.getString("jns_kel");
                obj[3] = r.getString("nama_kelas");
                model1.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void bersih(){
            txtNIS.setText("");
            txtNama.setText("");
            txtNilai1.setText("");
            txtNilai2.setText("");
            txtNilai3.setText("");
            txtNilai4.setText("");
            txtNilai5.setText("");
    }

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        ModelNilai mu = new ModelNilai();
        if (txtNIS.getText().equals("") || txtNilai1.getText().equals("") || txtNilai2.getText().equals("")|| 
                txtNilai3.getText().equals("")|| txtNilai4.getText().equals("")|| txtNilai5.getText().equals("")|| txtTanggal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Mohon inputkan semua data");
        } else {
            String[] data = {null, txtNIS.getText(), tanggal, txtNilai1.getText(), txtNilai2.getText(), txtNilai3.getText(),
                txtNilai4.getText(), txtNilai5.getText()
            };
            if (mu.insert(data) > 0) {
                JOptionPane.showMessageDialog(null, "Data tersimpan");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal");
            }
            loadNilai();
            bersih();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ModelNilai mu = new ModelNilai();
         if (txtNIS.getText().equals("") || txtNilai1.getText().equals("") || txtNilai2.getText().equals("")|| 
                txtNilai3.getText().equals("")|| txtNilai4.getText().equals("")|| txtNilai5.getText().equals("")|| txtTanggal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Mohon inputkan semua data");
        } else {
        String[] data = {tanggal, txtNilai1.getText(), txtNilai2.getText(), txtNilai3.getText(),
            txtNilai4.getText(), txtNilai5.getText(), txtNIS.getText()
        };
        if (mu.update(data) > 0) {
            JOptionPane.showMessageDialog(null, "Data terupdate");
        } else {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
        loadNilai();
         bersih();
         }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        ModelNilai mu = new ModelNilai();
        String[] data = {txtNIS.getText()};
        if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data?", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            mu.delete(data);
            JOptionPane.showMessageDialog(null, "Data terhapus");
        } else {
            JOptionPane.showMessageDialog(null, "Batal Menghapus");
        }
        loadNilai();
         bersih();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        FrmSiswa.setBounds(300, 300, 472, 350);
        FrmSiswa.setVisible(true);
    }//GEN-LAST:event_btnPilihActionPerformed

    private void tblSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiswaMouseClicked
        int i = tblSiswa.getSelectedRow();
        String kode = (String) tblSiswa.getValueAt(i, 0);
        txtNIS.setText(kode);
        String nama = (String) tblSiswa.getValueAt(i, 1);
        txtNama.setText(nama);
        FrmSiswa.setVisible(false);
    }//GEN-LAST:event_tblSiswaMouseClicked

    private void tblNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNilaiMouseClicked
        int row = tblNilai.getSelectedRow();
        txtNIS.setText(tblNilai.getValueAt(row, 1).toString());
        txtNama.setText(tblNilai.getValueAt(row, 2).toString());
        java.util.Date dateValue = null;
        try {
            dateValue = Format.parse(tblNilai.getValueAt(row, 4).toString());
        } catch (ParseException ex) {
            Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTanggal.setDate(dateValue);
        txtNilai1.setText(tblNilai.getValueAt(row, 5).toString());
        txtNilai2.setText(tblNilai.getValueAt(row, 6).toString());
        txtNilai3.setText(tblNilai.getValueAt(row, 7).toString());
        txtNilai4.setText(tblNilai.getValueAt(row, 8).toString());
        txtNilai5.setText(tblNilai.getValueAt(row, 9).toString());
    }//GEN-LAST:event_tblNilaiMouseClicked

    private void txtTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTanggalPropertyChange
        if (txtTanggal.getDate() != null) {
            tanggal = Format.format(txtTanggal.getDate());
        }
    }//GEN-LAST:event_txtTanggalPropertyChange

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        bersih();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void txtNISKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNISKeyReleased
        ModelNilai mn = new ModelNilai();
        ResultSet r = mn.read_nis(txtNIS.getText());
        try {
            if(r.next()){                
                txtNama.setText(r.getString("nama"));
            }else{
                 txtNama.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtNISKeyReleased

    private void txtNilai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNilai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNilai1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FrmSiswa;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNilai;
    private javax.swing.JTable tblSiswa;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNilai1;
    private javax.swing.JTextField txtNilai2;
    private javax.swing.JTextField txtNilai3;
    private javax.swing.JTextField txtNilai4;
    private javax.swing.JTextField txtNilai5;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JScrollPane xxx;
    // End of variables declaration//GEN-END:variables
}
