package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;

public class ModelPerhitungan extends Koneksi {

    public ResultSet read(String tahun, String kelas, String thn, String bln) {
        ResultSet r = null;
        String sql = "SELECT * FROM kelas, siswa, nilai WHERE nilai.nis = siswa.nis AND kelas.kd_kelas = siswa.kd_kelas AND thn_ajaran like '%" + tahun + "%' AND nama_kelas like '%" + kelas + "%' AND YEAR(tanggal) like '%" + thn + "%' AND MONTH(tanggal) like '%" + bln + "%'";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public ResultSet read() {
        ResultSet r = null;
        String sql = "SELECT * FROM kelas, siswa, cluster WHERE kelas.kd_kelas = siswa.kd_kelas AND siswa.nis = cluster.nis Order By nilai ASC";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public int deleteALL(){
        int i = 0;
        String sql = "truncate cluster";    //queri untuk menginsert data pada tabbel admin 
        try {
            PreparedStatement p = con.prepareStatement(sql);           
            i = p.executeUpdate(); //metod utk mengeksekusi query insert, update, delete
        } catch (SQLException ex) {
            Logger.getLogger(ModelPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    public ResultSet readCbbTahun() {
        ResultSet r = null;
        String sql = "SELECT * FROM siswa group by thn_ajaran";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ResultSet readCbbKelas() {
        ResultSet r = null;
        String sql = "SELECT * FROM kelas group by nama_kelas";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    public ResultSet readCbbTanggal() {
        ResultSet r = null;
        //String sql = "SELECT CONCAT(MONTH(tanggal),'-',YEAR(tanggal)) AS tgl FROM nilai GROUP BY MONTH(tanggal), YEAR(tanggal)";
        String sql = "SELECT DATE_FORMAT(tanggal,'%m-%Y') AS tgl FROM nilai GROUP BY MONTH(tanggal), YEAR(tanggal)";
        //DATE_FORMAT(tbl_peramalan.tgl_peramalan,'%d-%m-%Y') AS tgl
        try {
            PreparedStatement p = con.prepareStatement(sql);
            r = p.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ModelSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public int insert(String[] param) {
        int i = 0;
        String sql = "INSERT INTO cluster VALUES(?,?,?,?,?)";    //queri untuk menginsert data pada tabbel admin 
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, param[0]);  //mengambil data string untuk disimpan pada variabel param index 0
            p.setString(2, param[1]);
            p.setString(3, param[2]);
            p.setString(4, param[3]);
            p.setString(5, param[4]);
            i = p.executeUpdate(); //metod utk mengeksekusi query insert, update, delete
        } catch (SQLException ex) {
            Logger.getLogger(ModelPerhitungan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

}
