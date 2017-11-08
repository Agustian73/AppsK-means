

package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;


public class ModelNilai extends Koneksi{
     public ResultSet read(){
        ResultSet r = null;
        String sql = "SELECT * FROM nilai, siswa, kelas WHERE nilai.nis = siswa.nis AND kelas.kd_kelas = siswa.kd_kelas";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public ResultSet read_nis(String nis){
        ResultSet r = null;
        String sql = "SELECT * from siswa where nis = '"+nis+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public int insert(String [] param){
        int i = 0;
        String sql = "INSERT INTO nilai VALUES(?,?,?,?,?,?,?,?)";    //queri untuk menginsert data pada tabbel admin 
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
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
     public int update(String [] param){
        int i = 0;
        String sql = "UPDATE nilai SET tanggal=?, nilai1=?, nilai2=?, nilai3=?, nilai4=?, nilai5=? WHERE nis=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            p.setString(2, param[1]);
            p.setString(3, param[2]);           
            p.setString(4, param[3]);           
            p.setString(5, param[4]);           
            p.setString(6, param[5]);                                   
            p.setString(7, param[6]);                                   
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public int delete(String [] param){
        int i = 0;
        String sql = "DELETE FROM nilai WHERE nis=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public ResultSet valid(String tahun, String bulan) {
        ResultSet r = null;
        String sql = "SELECT * FROM nilai WHERE YEAR(tanggal)='" + tahun + "' AND MONTH(tanggal)='" + bulan + "'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }   
    public ResultSet tampil_nilai(String tahun, String bulan, String kelas) {
        ResultSet r = null;
        String sql = "SELECT * FROM nilai, siswa, kelas WHERE nilai.nis = siswa.nis AND siswa.kd_kelas = kelas.kd_kelas AND YEAR(nilai.tanggal)='" + tahun + "' AND MONTH(nilai.tanggal)='" + bulan + "' AND siswa.nis ='" + kelas + "'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }   
     public ResultSet read_kelas(String kelas){
        ResultSet r = null;
        String sql = "SELECT * from siswa where kd_kelas = '"+kelas+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public ResultSet read_simpan(String nis, String tahun, String bulan){
        ResultSet r = null;
        String sql = "SELECT * from nilai where nis = '"+nis+"'AND YEAR(tanggal)='" + tahun + "' AND MONTH(tanggal)='" + bulan + "'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
}
