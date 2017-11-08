package views;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import models.ModelPerhitungan;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class FormPerhitungan extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();

    public FormPerhitungan() {
        initComponents();
        tblData.setModel(model);
        model.addColumn("No");
        model.addColumn("NIS");
        model.addColumn("Nama Siswa");
        model.addColumn("Nama Kelas");
        model.addColumn("Nilai DTW");
        model.addColumn("Nilai DMT");
        model.addColumn("Nilai DTT");
        model.addColumn("Nilai DDB");
        model.addColumn("Nilai DPK");

        tblHasil.setModel(model2);
         model2.addColumn("No");
         model2.addColumn("NIS");
         model2.addColumn("Nama");
         model2.addColumn("Nama Kelas");
         model2.addColumn("Keterangan");
        loadCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbTahun = new javax.swing.JComboBox();
        cbbKelas = new javax.swing.JComboBox();
        btnTampil = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbbTanggal = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHasil = new javax.swing.JTable();
        txtTampil = new javax.swing.JButton();

        tblData.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblData);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel1.setText("Tahun Ajaran");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel5.setText("Kelas");

        cbbTahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));

        cbbKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));

        btnTampil.setText("Proses");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal");

        cbbTanggal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(cbbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTampil)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTampil)
                    .addComponent(jLabel6)
                    .addComponent(cbbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHasil.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblHasil);

        txtTampil.setText("Cetak Laporan");
        txtTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTampil)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTampil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadCombobox() {
        ModelPerhitungan mu = new ModelPerhitungan();
        ResultSet r = mu.readCbbTahun();
        ResultSet x = mu.readCbbKelas();
        ResultSet y = mu.readCbbTanggal();
        try {
            while (r.next()) {
                cbbTahun.addItem(r.getString("thn_ajaran"));
            }
            while (x.next()) {
                cbbKelas.addItem(x.getString("nama_kelas"));
            }
            while (y.next()) {
                cbbTanggal.addItem(y.getString("tgl"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadHasil(){
         ModelPerhitungan mu = new ModelPerhitungan();
        ResultSet r = mu.read();
        model2.setRowCount(0);
        model2.getDataVector().removeAllElements();        
        try {
            while(r.next()){
                Object[] obj = new Object[5];
                obj[1] = r.getString("nis");
                obj[2] = r.getString("nama");
                obj[3] = r.getString("nama_kelas");
                obj[4] = r.getString("keterangan");             
                 model2.addRow(obj);
                noTable2();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadNilai() {
        ModelPerhitungan mu = new ModelPerhitungan();
        model.setRowCount(0);
        model.getDataVector().removeAllElements();
        String tahun, kelas, thn, kls;
        thn = cbbTahun.getSelectedItem().toString();
        kls = cbbKelas.getSelectedItem().toString();
        if (thn.equals("All") && kls.equals("All")) {
            tahun = "";
            kelas = "";
        } else if (kls.equals("All")) {
            kelas = "";
            tahun = thn;
        } else if (thn.equals("All")) {
            tahun = "";
            kelas = kls;
        } else {
            tahun = thn;
            kelas = kls;
        }
        String a_bulan, a_tahun, tanggal;
        tanggal = cbbTanggal.getSelectedItem().toString();
        String[] tg = cbbTanggal.getSelectedItem().toString().split("-");
        if (tanggal.equals("All")){
            a_bulan = "";
            a_tahun = "";
        }else{
            a_bulan = tg[0].replace("0", "");
            a_tahun = tg[1];
            System.out.println(a_bulan);
        }
        ResultSet r = mu.read(tahun, kelas,a_tahun, a_bulan);
        try {
            while (r.next()) {
                Object[] obj = new Object[9];
                obj[1] = r.getString("nis");
                obj[2] = r.getString("nama");
                obj[3] = r.getString("nama_kelas");
                obj[4] = (r.getInt("nilai1") < 60) ? 1 : (r.getInt("nilai1") < 80) ? 2 : 3;
                obj[5] = (r.getInt("nilai2") < 60) ? 1 : (r.getInt("nilai2") < 80) ? 2 : 3;
                obj[6] = (r.getInt("nilai3") < 60) ? 1 : (r.getInt("nilai3") < 80) ? 2 : 3;
                obj[7] = (r.getInt("nilai4") < 60) ? 1 : (r.getInt("nilai4") < 80) ? 2 : 3;
                obj[8] = (r.getInt("nilai5") < 60) ? 1 : (r.getInt("nilai5") < 80) ? 2 : 3;
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
    public void noTable2() {
        int baris = model2.getRowCount();
        for (int a = 0; a < baris; a++) {
            String nomor = String.valueOf(a + 1);
            model2.setValueAt(nomor, a, 0);
        }
    }

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        loadNilai();
        hitung();
        loadSimpan();
        loadHasil();        
    }//GEN-LAST:event_btnTampilActionPerformed

    private void txtTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTampilActionPerformed
        try {
            Koneksi sr = new Koneksi();
            JasperReport jasperReport = JasperCompileManager.compileReport("laporan/lap_penilaian.jrxml");
            HashMap<String, Object> p = new HashMap<String, Object>();                  
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, sr.con);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(FormPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtTampilActionPerformed
   
    
    double[] cent1 = {1, 1, 1, 1, 1};
    double[] cent2 = {2, 2, 2, 2, 2};
    double[] cent3 = {3, 3, 3, 3, 3};
    ArrayList tidak = new ArrayList();
    ArrayList cukup = new ArrayList();
    ArrayList disiplin = new ArrayList();
    ArrayList grup1 = null;
    ArrayList grup2 = null;
    ArrayList grup3;    
        
    private void hitung(){
        ModelPerhitungan mu = new ModelPerhitungan();
         mu.deleteALL();
        int jml_row = tblData.getRowCount();
        double t1, t2, t3;
        ArrayList sama = new ArrayList();
        ArrayList dtw1; ArrayList dtw2; ArrayList dtw3;
        ArrayList dmt1; ArrayList dmt2; ArrayList dmt3;
        ArrayList dtt1; ArrayList dtt2; ArrayList dtt3;
        ArrayList ddb1; ArrayList ddb2; ArrayList ddb3;
        ArrayList dpk1; ArrayList dpk2; ArrayList dpk3;          
          
            for (int a = 0; a < a+1; a++) {
                dtw1 = new ArrayList(); dtw2 = new ArrayList(); dtw3 = new ArrayList();
                dmt1 = new ArrayList(); dmt2 = new ArrayList(); dmt3 = new ArrayList();
                dtt1 = new ArrayList(); dtt2 = new ArrayList(); dtt3 = new ArrayList();
                ddb1 = new ArrayList(); ddb2 = new ArrayList(); ddb3 = new ArrayList();
                dpk1 = new ArrayList(); dpk2 = new ArrayList(); dpk3 = new ArrayList();  
                grup1 = new ArrayList(); grup2 = new ArrayList(); grup3 = new ArrayList(); 
                
                for (int b = 0; b < jml_row; b++) {                   
                    double objek1 = Double.valueOf(tblData.getValueAt(b, 4).toString());
                    double objek2 = Double.valueOf(tblData.getValueAt(b, 5).toString());
                    double objek3 = Double.valueOf(tblData.getValueAt(b, 6).toString());
                    double objek4 = Double.valueOf(tblData.getValueAt(b, 7).toString());
                    double objek5 = Double.valueOf(tblData.getValueAt(b, 8).toString());
                    t1 = Math.sqrt(Math.pow((objek1 - cent1[0]), 2) + Math.pow((objek2 - cent1[1]), 2)
                            + Math.pow((objek3 - cent1[2]), 2) + Math.pow((objek4 - cent1[3]), 2) + Math.pow((objek5 - cent1[4]), 2));
                    t2 = Math.sqrt(Math.pow((objek1 - cent2[0]), 2) + Math.pow((objek2 - cent2[1]), 2)
                            + Math.pow((objek3 - cent2[2]), 2) + Math.pow((objek4 - cent2[3]), 2) + Math.pow((objek5 - cent2[4]), 2));
                    t3 = Math.sqrt(Math.pow((objek1 - cent3[0]), 2) + Math.pow((objek2 - cent3[1]), 2)
                            + Math.pow((objek3 - cent3[2]), 2) + Math.pow((objek4 - cent3[3]), 2) + Math.pow((objek5 - cent3[4]), 2));
                    if (t1 < t2 && t1 < t3) {                      
                        grup1.add("1");
                        grup2.add("0");
                        grup3.add("0");
                        dtw1.add(objek1);
                        dmt1.add(objek2);
                        dtt1.add(objek3);
                        ddb1.add(objek4);
                        dpk1.add(objek5);
                    } else if (t2 < t1 && t2 < t3) {
                        grup1.add("0");
                        grup2.add("1");
                        grup3.add("0");
                        dtw2.add(objek1);
                        dmt2.add(objek2);
                        dtt2.add(objek3);
                        ddb2.add(objek4);
                        dpk2.add(objek5);
                    } else {
                        grup1.add("0");
                        grup2.add("0");
                        grup3.add("1");
                        dtw3.add(objek1);
                        dmt3.add(objek2);
                        dtt3.add(objek3);
                        ddb3.add(objek4);
                        dpk3.add(objek5);
                    }                   
                }
                //menentukan centroid baru
                double DTW1 = 0.0, DMT1 = 0.0, DTT1 = 0.0, DDB1 = 0.0, DPK1 = 0.0;
                double DTW2 = 0.0, DMT2 = 0.0, DTT2 = 0.0, DDB2 = 0.0, DPK2 = 0.0;
                double DTW3 = 0.0, DMT3 = 0.0, DTT3 = 0.0, DDB3 = 0.0, DPK3 = 0.0;
                for (int c1 = 0; c1 < dtw1.size(); c1++) {
                    DTW1 += Double.parseDouble(dtw1.get(c1).toString());
                    DMT1 += Double.parseDouble(dmt1.get(c1).toString());
                    DTT1 += Double.parseDouble(dtt1.get(c1).toString());
                    DDB1 += Double.parseDouble(ddb1.get(c1).toString());
                    DPK1 += Double.parseDouble(dpk1.get(c1).toString());
                }
                for (int c2 = 0; c2 < dtw2.size(); c2++) {
                    DTW2 += Double.parseDouble(dtw2.get(c2).toString());
                    DMT2 += Double.parseDouble(dmt2.get(c2).toString());
                    DTT2 += Double.parseDouble(dtt2.get(c2).toString());
                    DDB2 += Double.parseDouble(ddb2.get(c2).toString());
                    DPK2 += Double.parseDouble(dpk2.get(c2).toString());
                }
                for (int c3 = 0; c3 < dtw3.size(); c3++) {
                    DTW3 += Double.parseDouble(dtw3.get(c3).toString());
                    DMT3 += Double.parseDouble(dmt3.get(c3).toString());
                    DTT3 += Double.parseDouble(dtt3.get(c3).toString());
                    DDB3 += Double.parseDouble(ddb3.get(c3).toString());
                    DPK3 += Double.parseDouble(dpk3.get(c3).toString());
                }
                cent1[0] = ((DTW1 / ((dtw1.isEmpty()) ?1: dtw1.size())) == 0)?1: DTW1/dtw1.size();
                cent1[1] = ((DMT1 / ((dmt1.isEmpty()) ?1: dmt1.size())) == 0)?1: DMT1/dmt1.size();
                cent1[2] = ((DTT1 / ((dtt1.isEmpty()) ?1: dtt1.size())) == 0)?1: DTT1/dtt1.size();
                cent1[3] = ((DDB1 / ((ddb1.isEmpty()) ?1: ddb1.size())) == 0)?1: DDB1/ddb1.size();
                cent1[4] = ((DPK1 / ((dpk1.isEmpty()) ?1: dpk1.size())) == 0)?1: DPK1/dpk1.size();             
                           
                cent2[0] = ((DTW2 / ((dtw2.isEmpty()) ?1: dtw2.size())) == 0)?2: DTW2/dtw2.size();
                cent2[1] = ((DMT2 / ((dmt2.isEmpty()) ?1: dmt2.size())) == 0)?2: DMT2/dmt2.size();
                cent2[2] = ((DTT2 / ((dtt2.isEmpty()) ?1: dtt2.size())) == 0)?2: DTT2/dtt2.size();
                cent2[3] = ((DDB2 / ((ddb2.isEmpty()) ?1: ddb2.size())) == 0)?2: DDB2/ddb2.size();
                cent2[4] = ((DPK2 / ((dpk2.isEmpty()) ?1: dpk2.size())) == 0)?2: DPK2/dpk2.size();             
                           
                cent3[0] = ((DTW3 / ((dtw3.isEmpty()) ?1: dtw3.size())) == 0)?3: DTW3/dtw3.size();
                cent3[1] = ((DMT3 / ((dmt3.isEmpty()) ?1: dmt3.size())) == 0)?3: DMT3/dmt3.size();
                cent3[2] = ((DTT3 / ((dtt3.isEmpty()) ?1: dtt3.size())) == 0)?3: DTT3/dtt3.size();
                cent3[3] = ((DDB3 / ((ddb3.isEmpty()) ?1: ddb3.size())) == 0)?3: DDB3/ddb3.size();
                cent3[4] = ((DPK3 / ((dpk3.isEmpty()) ?1: dpk3.size())) == 0)?3: DPK3/dpk3.size();       
                                                                    
                String compare = String.valueOf(grup1);
                sama.add(compare);
                if(sama.get(a).equals((a == 0)?"coba lagi":sama.get(a-1))){
                    break;
                    }                     
                }      
             }
    
    public void loadSimpan() {
        String nis,  ket, nil;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = df.format(Calendar.getInstance().getTime());
        for (int a = 0; a < tblData.getRowCount(); a++) {
            if (grup1.get(a).equals("1")) {
                nis = (String) tblData.getValueAt(a, 1);                
                ket = "Tidak Disiplin";
                nil ="1";
            } else if (grup2.get(a).equals("1")) {
                nis = (String) tblData.getValueAt(a, 1);                
                ket = "Cukup Disiplin";
                nil ="2";
            } else {
                nis = (String) tblData.getValueAt(a, 1);               
                ket = "Disiplin";
                nil ="3";
            }
            models.ModelPerhitungan mp = new models.ModelPerhitungan();
            String data[] = {null, nis, tgl, nil, ket
            };
            mp.insert(data);
        }        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTampil;
    private javax.swing.JComboBox cbbKelas;
    private javax.swing.JComboBox cbbTahun;
    private javax.swing.JComboBox cbbTanggal;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblHasil;
    private javax.swing.JButton txtTampil;
    // End of variables declaration//GEN-END:variables
}
