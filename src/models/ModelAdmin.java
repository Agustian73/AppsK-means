

package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;


public class ModelAdmin extends Koneksi{
    public ResultSet read(String user){
        ResultSet r = null;
        String sql = "SELECT * FROM siswa, kelas, user WHERE kelas.kd_kelas = siswa.kd_kelas"
                + " AND kelas.kd_kelas = user.kd_kelas AND username = '"+user+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    } 
    public ResultSet login(String pass, String user) {
        ResultSet  r = null;        
        String sql = "SELECT * FROM admin where password= '"+pass+"' AND username= '"+user+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);                    
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public ResultSet login_user(String pass, String user, String kode) {
        ResultSet  r = null;        
        String sql = "SELECT * FROM user where password= '"+pass+"' AND username= '"+user+"' AND kd_kelas='"+kode+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);                    
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public ResultSet terpilih(String nama) {
        ResultSet  r = null;        
        String sql = "SELECT * FROM kelas where nama_kelas= '"+nama+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);                    
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public ResultSet tampilcbb() {
        ResultSet  r = null;        
        String sql = "SELECT * FROM kelas";
        try {
            PreparedStatement p = con.prepareStatement(sql);                    
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     
     public ResultSet ambilPass(String pass) {
        ResultSet  r = null;        
        String sql = "SELECT * FROM admin where password= '"+pass+"'";
        try {
            PreparedStatement p = con.prepareStatement(sql);                    
            r = p.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
     public int update(String [] param){
        int i = 0;
        String sql = "UPDATE admin SET username=?, password=? WHERE id_admin=?";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);
            p.setString(2, param[1]);
            p.setString(3, param[2]);           
            i = p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ModelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }     
      
}
