
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;


public class ModelSiswa  extends Koneksi{
    public ResultSet read(){
        ResultSet r = null;
        String sql = "SELECT * FROM kelas, siswa WHERE kelas.kd_kelas = siswa.kd_kelas ORDER BY nis ASC";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public int insert(String [] param){
        int i = 0;
        String sql = "INSERT INTO siswa VALUES(?,?,?,?,?,?,?,?)";    //queri untuk menginsert data pada tabbel admin 
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);  //mengambil data string untuk disimpan pada variabel param index 0
            p.setString(2, param[1]);          
            p.setString(3, param[2]);          
            p.setString(4, param[3]);          
            p.setString(5, param[4]);          
            p.setString(6, param[5]);          
            p.setString(7, param[6]);          
            p.setString(8, param[7]);          
            i = p.executeUpdate(); //metod utk mengeksekusi query insert, update, delete
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
     public int update(String [] param){
        int i = 0;
        String sql = "UPDATE siswa SET kd_kelas=?, nama=?, jns_kel=?, tempat_lahir=?, tgl_lahir=?, alamat=?, thn_ajaran=? WHERE nis=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            p.setString(2, param[1]);
            p.setString(3, param[2]);           
            p.setString(4, param[3]);           
            p.setString(5, param[4]);           
            p.setString(6, param[5]);           
            p.setString(7, param[6]);           
            p.setString(8, param[7]);           
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public int delete(String [] param){
        int i = 0;
        String sql = "DELETE siswa, nilai FROM siswa, nilai WHERE siswa.nis=nilai.nis AND siswa.nis=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public int delete1(String [] param){
        int i = 0;
        String sql = "DELETE FROM siswa WHERE nis=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
