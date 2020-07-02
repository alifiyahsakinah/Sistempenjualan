/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

/**
 *
 * @author Alifiyah
 */
import com.Database_penjualan.Koneksi;
import com.Model_penjualan.Barang;
import com.Model_penjualan.Transaksi;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Transaksi_controller {
    Koneksi kn;
    static ArrayList<Transaksi> arrtransaksi;
    public static ArrayList<Barang> arrBarang;

    public Transaksi_controller() {
        this.kn = new Koneksi();
        this.arrtransaksi = new ArrayList<>();  
        this.arrBarang = new ArrayList<>();
    }
    
    public Integer GetId_transaksi(Integer Idtransaksi)throws SQLException{
        ResultSet rs = this.kn.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
        boolean CekId = CekId(Idtransaksi);
        if (rs==null || CekId==true) {
            rs = this.kn.GetData("SELECT ID_TRANSAKSI.NEXTVAL FROM DUAL");
            rs = this.kn.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
        }
        rs.first();
        Integer id = rs.getInt("CURRVAL");
        return id;
    }
    
    public boolean CekId(Integer Idtransaksi) throws SQLException{
        ResultSet rs = this.kn.GetData("SELECT ID_TRANSAKSI FROM DATA_TRANSAKSI WHERE ID_TRANSAKSI = "+Idtransaksi+"");
        rs.first();
        if (rs.first()) {
            return true;
        } return false;
    }
    
     public ArrayList<Barang> getDatabarang() throws SQLException{
        this.arrBarang.clear();
        ResultSet rs = this.kn.GetData("SELECT * FROM DATA_BARANG");
        
        while(rs.next()){
            Barang barang = new Barang();
            barang.setId_barang(rs.getInt("ID_BARANG"));
            barang.setNama_barang(rs.getString("Nama_barang"));
            barang.setSatuan(rs.getInt("SATUAN"));
            barang.setHarga(rs.getInt("HARGA"));
            //barang.setJenisbarang(rs.getString("JENIS_BARANG"));
            arrBarang.add(barang);
     }return arrBarang;
    }
     
    public void Insertdatatransaksi(Integer Id ,String Tanggal,float Totalharga,Integer Totalsatuan){
        try {
             this.kn.ManipulasiData("INSERT INTO DATA_TRANSAKSI VALUES ("+Id+",to_date('"+Tanggal+"','dd/mm/yyyy'),"
                     +Totalharga+","+Totalsatuan+")");
        } catch (Exception e) {
            System.err.println("error insert :"+e);
        }
    }
    
    public void Insertdetailtransaksi(String Id_barang,Integer Id_transaksi){
         try {
             this.kn.ManipulasiData("INSERT INTO DETAIL_TRANSAKSI VALUES ("+Id_barang+","+Id_transaksi+")");
        } catch (Exception e) {
            System.err.println("error insert :"+e);
        }
    }
    
    public ArrayList<Transaksi> getDataTransaksi() throws SQLException{
        this.arrtransaksi.clear();
        ResultSet rs = this.kn.GetData("SELECT * FROM DATA_TRANSAKSI");
        
        while(rs.next()){
            Transaksi transaksi = new Transaksi();
            transaksi.setId_transaksi(rs.getInt("ID_TRANSAKSI"));
            transaksi.setTgl_transaksi(rs.getDate("TGL_TRANSAKSI"));
            transaksi.setTotal_harga(rs.getInt("TOTAL_HARGA"));
            transaksi.setTotal_satuan(rs.getInt("TOTAL_SATUAN"));
            arrtransaksi.add(transaksi);
     }return arrtransaksi;
    }
    
     public ArrayList<Barang> getListBarang(String Idtransaksi) throws SQLException{
        this.arrBarang.clear();
        ResultSet rs = this.kn.GetData("SELECT * FROM LISTBARANG WHERE ID_TRANSAKSI = "+Idtransaksi);
        
        while(rs.next()){
            Barang barang = new Barang();
            barang.setId_barang(rs.getInt("ID_BARANG"));
            barang.setNama_barang(rs.getString("NAMA_BARANG"));
            barang.setJenisbarang(rs.getString("JENIS_BARANG"));
            barang.setHarga(rs.getInt("HARGA"));
            
            arrBarang.add(barang);
     }return arrBarang;
    }
}
