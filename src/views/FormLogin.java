package views;

import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.ModelAdmin;
import models.ModelNilai;

public class FormLogin extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int collIndex) {
            return collIndex != 0 && collIndex != 1 && collIndex != 2;
        }
    };
    JTextField jtf = new JTextField();
    DefaultCellEditor x = new DefaultCellEditor(jtf);

    public FormLogin() {
        initComponents();
        tblPenilaian.setModel(model);
        model.addColumn("No");
        model.addColumn("NIS");
        model.addColumn("Nama Siswa");
        model.addColumn("Nilai DTW");
        model.addColumn("Nilai DMT");
        model.addColumn("Nilai DTT");
        model.addColumn("Nilai DDB");
        model.addColumn("Nilai DPK");
        txtKd.hide();
        loadNilai();
        warna_tabel();
        cbb();
        tanggal();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormPenilaian = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenilaian = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtKd = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbbKelas = new javax.swing.JComboBox();
        cekAktif = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();

        FormPenilaian.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPenilaian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPenilaian.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPenilaian.setRowHeight(24);
        jScrollPane1.setViewportView(tblPenilaian);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("Kelas :");

        txtKelas.setEditable(false);

        txtTanggal.setEditable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Keterangan :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("DTW = Disiplin Terhadap Waktu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("DMT  = Disiplin Mengerjakan Tugas ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("DTT  = Disiplin Tata Tertib");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("DDB  = Disiplin Dalam Berpakaian");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("DPK = Disiplin Pembayaran Kewajiban");

        jLabel12.setText("TIDAK DISIPLIN = 0-59");

        jLabel13.setText("CUKUP DISIPLIN = 60-79");

        jLabel14.setText(" DISIPLIN = 80-100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtKd.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormPenilaianLayout = new javax.swing.GroupLayout(FormPenilaian.getContentPane());
        FormPenilaian.getContentPane().setLayout(FormPenilaianLayout);
        FormPenilaianLayout.setHorizontalGroup(
            FormPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPenilaianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FormPenilaianLayout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FormPenilaianLayout.setVerticalGroup(
            FormPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPenilaianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 250, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204))));

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Password :");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Kelas :");

        cbbKelas.setEnabled(false);

        cekAktif.setText("aktifkan");
        cekAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekAktifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cbbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cekAktif)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekAktif))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed

    }//GEN-LAST:event_txtUsernameKeyPressed
    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void loadNilai() {
        ModelAdmin mu = new ModelAdmin();
        model.getDataVector().removeAllElements();
        ResultSet r = mu.read(txtUsername.getText());
        try {
            while (r.next()) {
                Object[] obj = new Object[8];
                obj[1] = r.getString("nis");
                obj[2] = r.getString("nama");
                obj[3] = "";
                obj[4] = "";
                obj[5] = "";
                obj[6] = "";
                obj[7] = "";
                model.addRow(obj);
                noTable();
                txtKelas.setText(r.getString("nama_kelas"));
                txtKd.setText(r.getString("kd_kelas"));
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

    private void cbb() {
        ModelAdmin m = new ModelAdmin();
        ResultSet r = m.tampilcbb();
        try {
            while (r.next()) {
                cbbKelas.addItem(r.getString("nama_kelas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ModelAdmin m = new ModelAdmin();
        String password, username;
        password = new String(txtPassword.getPassword());
        username = txtUsername.getText();
        ResultSet r = m.login(password, username);
        try {
            int a = 0;
            int b = 0;
            if (txtUsername.getText().equals("")) {
                a++;
            }
            if (password.equals("")) {
                b++;
            }
            if (a > 0 && b > 0) {
                JOptionPane.showMessageDialog(null, "Mohon Masukan Username & Password");
            } else {
                if (akses == 0) {
                    if (r.next()) {
                        MenuUtama mnu = new MenuUtama();
                        mnu.setExtendedState(MAXIMIZED_BOTH);
                        mnu.setVisible(true);
                        dispose();
                        System.out.println("admin");
                    } else {
                        JOptionPane.showMessageDialog(null, "username atau password salah");
                        txtUsername.setText("");
                        txtPassword.setText("");
                        txtUsername.requestFocus();
                    }
                } else {
                    String kelas = cbbKelas.getSelectedItem().toString();
                    ResultSet r1 = m.terpilih(kelas);
                    r1.next();
                    String ambil_kelas = r1.getString("kd_kelas");
                    ResultSet r2 = m.login_user(password, username, ambil_kelas);
                    if (r2.next()) {
                        loadNilai();
                        nilai();
                        tblPenilaian.setEnabled(true);
                        FormPenilaian.setBounds(30, 30, 1000, 600);
                        FormPenilaian.setTitle("Input Nilai");
                        FormPenilaian.setExtendedState(MAXIMIZED_BOTH);
                        FormPenilaian.setVisible(true);
                        dispose();
                        System.out.println("user");
                    } else {
                        JOptionPane.showMessageDialog(null, "data yang anda inputkan salah");
                        txtUsername.setText("");
                        txtPassword.setText("");
                        txtUsername.requestFocus();
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void warna_tabel() {
        tblPenilaian.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tblProses, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(tblProses, value, isSelected, hasFocus, row, column);
                if (row % 2 != 0) {
                    label.setBackground(Color.WHITE);
                    label.setHorizontalAlignment(CENTER);
                } else {
                    label.setBackground(Color.ORANGE);
                }
                if (hasFocus) {
                    label.setBackground(Color.LIGHT_GRAY);
                }
                Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
                label.setBorder(border);
                label.setForeground(Color.BLACK);
                label.setOpaque(true);
                label.setText(String.valueOf(value));
                return label;
            }
        });
        /*     x.setClickCountToStart(1);
         for(int i = 0; i < tblPenilaian.getColumnCount();i++){
         tblPenilaian.setDefaultEditor(tblPenilaian.getColumnClass(i), x);
         } **/
        JTableHeader head = tblPenilaian.getTableHeader();
        head.setBackground(Color.lightGray);
        head.setForeground(Color.BLACK);
        //head.setOpaque(false);

    }
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    int akses = 0;
    private void cekAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekAktifActionPerformed
        if (cekAktif.isSelected()) {
            cbbKelas.setEnabled(true);
            akses = 1;
        } else {
            cbbKelas.setEnabled(false);
            akses = 0;
        }
    }//GEN-LAST:event_cekAktifActionPerformed
    private void tanggal() {
        SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = now.format(Calendar.getInstance().getTime());
        txtTanggal.setText(tanggal);
    }

    SimpleDateFormat bul = new SimpleDateFormat("MM");
    String bulan = bul.format(Calendar.getInstance().getTime());
    SimpleDateFormat hun = new SimpleDateFormat("yyyy");
    String tahun = hun.format(Calendar.getInstance().getTime());
    ModelNilai mu = new ModelNilai();
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            int row = tblPenilaian.getRowCount();
//            ResultSet r = mu.valid(tahun, bulan);
//            if (r.next()) {
//                JOptionPane.showMessageDialog(null, "Untuk penilaian kedisiplinan pada bulan ini sudah diinputkan");
//            } else {
                for (int a = 0; a < row; a++) {
                    ResultSet kelas = mu.read_kelas(txtKd.getText());
                    while (kelas.next()) {
                        ResultSet simpan = mu.read_simpan(kelas.getString("nis"), tahun, bulan);
                        if (simpan.next()) {

                        } else {
                            String nis = (String) tblPenilaian.getValueAt(a, 1);
                            String tgl = txtTanggal.getText();
                            String nilai1 = (String) tblPenilaian.getValueAt(a, 3);
                            String nilai2 = (String) tblPenilaian.getValueAt(a, 4);
                            String nilai3 = (String) tblPenilaian.getValueAt(a, 5);
                            String nilai4 = (String) tblPenilaian.getValueAt(a, 6);
                            String nilai5 = (String) tblPenilaian.getValueAt(a, 7);
                            if (nilai1.equals("") || nilai2.equals("") || nilai3.equals("") || nilai4.equals("") || nilai5.equals("")) {
                                JOptionPane.showMessageDialog(null, "Data nilai yang anda inputkan masih ada yang belum diisi..");
                                break;
                            } else {
                                String[] data = {null, nis, tgl, nilai1, nilai2, nilai3, nilai4, nilai5};
                                mu.insert(data);
                            }
                        }
                    }

//                        tblPenilaian.setValueAt("", a, 3);
//                        tblPenilaian.setValueAt("", a, 4);
//                        tblPenilaian.setValueAt("", a, 5);
//                        tblPenilaian.setValueAt("", a, 6);
//                        tblPenilaian.setValueAt("", a, 7);
                    if (a + 1 == row) {
                        JOptionPane.showMessageDialog(null, "Data Masuk");
                    }
                }
            //}
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void nilai() {
        try {
            ModelAdmin mi = new ModelAdmin();
            tblPenilaian.setEnabled(false);
            ResultSet p = mi.read(txtUsername.getText());
            int a = 0;
            while (p.next()) {
                ResultSet r = mu.tampil_nilai(tahun, bulan, p.getString("nis"));

                if (r.next()) {
                    tblPenilaian.setValueAt(r.getString("nilai1"), a, 3);
                    tblPenilaian.setValueAt(r.getString("nilai2"), a, 4);
                    tblPenilaian.setValueAt(r.getString("nilai3"), a, 5);
                    tblPenilaian.setValueAt(r.getString("nilai4"), a, 6);
                    tblPenilaian.setValueAt(r.getString("nilai5"), a, 7);
                    a++;
                } else {
                    tblPenilaian.setValueAt("", a, 3);
                    tblPenilaian.setValueAt("", a, 4);
                    tblPenilaian.setValueAt("", a, 5);
                    tblPenilaian.setValueAt("", a, 6);
                    tblPenilaian.setValueAt("", a, 7);
                    a++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            Properties props = new Properties();
            props.put("logoString", "");
            LunaLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FormPenilaian;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cbbKelas;
    private javax.swing.JCheckBox cekAktif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPenilaian;
    private javax.swing.JTextField txtKd;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
