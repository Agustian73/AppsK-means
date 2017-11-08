

package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;


public class ModelKelas extends Koneksi{
    public ResultSet read(){
        ResultSet r = null;
        String sql = "SELECT * FROM kelas";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public int insert(String [] param){
        int i = 0;
        String sql = "INSERT INTO kelas VALUES(?,?,?)";    //queri untuk menginsert data pada tabbel admin 
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);  //mengambil data string untuk disimpan pada variabel param index 0
            p.setString(2, param[1]);          
            p.setString(3, param[2]);          
            i = p.executeUpdate(); //metod utk mengeksekusi query insert, update, delete
        } catch (SQLException ex) {
            Logger.getLogger(ModelKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
     public int update(String [] param){
        int i = 0;
        String sql = "UPDATE kelas SET nama_kelas=?, kuota=? WHERE kd_kelas=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            p.setString(2, param[1]);
            p.setString(3, param[2]);           
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public int delete(String [] param){
        int i = 0;
        String sql = "DELETE kelas, siswa, nilai FROM kelas, siswa, nilai WHERE kelas.kd_kelas=siswa.kd_kelas AND siswa.nis=nilai.nis AND kelas.kd_kelas=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public int delete1(String [] param){
        int i = 0;
        String sql = "DELETE FROM kelas WHERE kd_kelas=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
