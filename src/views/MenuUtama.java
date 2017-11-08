

package views;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;


public class MenuUtama extends javax.swing.JFrame {

  
    public MenuUtama() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        label3 = new usu.widget.Label();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKelas = new javax.swing.JMenuItem();
        menuSiswa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuNilai = new javax.swing.JMenuItem();
        menuCluster = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenuItem();
        menuPassword = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI PENILAIAN KEDISIPLINAN SISWA");

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setFocusCycleRoot(true);

        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/header.jpg"))); // NOI18N
        label3.setText("Aplikasi Penilaian");
        label3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.setOpaque(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        menuKelas.setText("Data Kelas");
        menuKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKelasActionPerformed(evt);
            }
        });
        jMenu1.add(menuKelas);

        menuSiswa.setText("Data Siswa");
        menuSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSiswaActionPerformed(evt);
            }
        });
        jMenu1.add(menuSiswa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Peniliaian");

        menuNilai.setText("Nilai Kedisiplinan");
        menuNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(menuNilai);

        menuCluster.setText("Clustering Kedisiplinan");
        menuCluster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClusterActionPerformed(evt);
            }
        });
        jMenu2.add(menuCluster);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Pengaturan");

        menuUser.setText("Kelola User");
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenu4.add(menuUser);

        menuPassword.setText("Ubah Password");
        menuPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasswordActionPerformed(evt);
            }
        });
        jMenu4.add(menuPassword);

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu4.add(menuLogout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(856, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKelasActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormKelas fp = new FormKelas();
        fp.setTitle("Data Kelas");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuKelasActionPerformed

    private void menuSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSiswaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormSiswa fp = new FormSiswa();
        fp.setTitle("Data Siswa");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuSiswaActionPerformed

    private void menuNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNilaiActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormNilai fp = new FormNilai();
        fp.setTitle("Data Nilai Kedisiplinan Siswa");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuNilaiActionPerformed

    private void menuClusterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClusterActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormPerhitungan fp = new FormPerhitungan();
        fp.setTitle("Pengelompokan Kedisiplinan Siswa");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuClusterActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        dispose();
        FormLogin Log = new FormLogin();
        Log.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasswordActionPerformed
       jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        UbahPassword fp = new UbahPassword();
        fp.setTitle("Form Ubah Password");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuPasswordActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        FormUser fp = new FormUser();
        fp.setTitle("Kelola User");
        fp.setVisible(true);
        jDesktopPane1.add(fp);
    }//GEN-LAST:event_menuUserActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               MenuUtama mn = new MenuUtama();
                mn.setExtendedState(MAXIMIZED_BOTH);
                mn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private usu.widget.Label label3;
    private javax.swing.JMenuItem menuCluster;
    private javax.swing.JMenuItem menuKelas;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuNilai;
    private javax.swing.JMenuItem menuPassword;
    private javax.swing.JMenuItem menuSiswa;
    private javax.swing.JMenuItem menuUser;
    // End of variables declaration//GEN-END:variables
}
