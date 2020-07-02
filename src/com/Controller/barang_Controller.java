package com.Controller;

import com.Model_penjualan.Barang;
import com.Database_penjualan.Koneksi;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alifiyah
 */
public class barang_Controller {
    Koneksi kn ;
    ArrayList<Barang> arrBarang;
   

    public barang_Controller() {
        this.kn = new Koneksi();
        this.arrBarang = new ArrayList<>();
       
    }
   
    public ArrayList<Barang> getDatabarang() throws SQLException{
        this.arrBarang.clear();
        ResultSet rs = this.kn.GetData("SELECT * FROM DATA_BARANG JOIN DATAJENIS_BARANG ON DATAJENIS_BARANG.ID_JENIS = DATA_BARANG.ID_JENIS");
        
        while(rs.next()){
            Barang barang = new Barang();
            barang.setId_barang(rs.getInt("ID_BARANG"));
            barang.setNama_barang(rs.getString("Nama_barang"));
            barang.setSatuan(rs.getInt("SATUAN"));
            barang.setHarga(rs.getInt("HARGA"));
            barang.setJenisbarang(rs.getString("JENIS_BARANG"));
            arrBarang.add(barang);
        }return arrBarang;
    }
    public void InsertBarang (String Id_jenis,String Nama_barang,String Harga,String Satuan ){
        try{
            this.kn.ManipulasiData("INSERT INTO DATA_BARANG VALUES (ID_BARANG.NEXTVAL,"+Id_jenis+",'"
                    +Nama_barang+"',"+Harga+","+Satuan+")");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void UpdateBarang(String Id_barang,String Id_jenis,String Nama_barang,String Harga, String Satuan){
        try {
            this.kn.ManipulasiData("UPDATE DATA_BARANG SET ID_JENIS= "+Id_jenis+", NAMA_BARANG= '"
                    +Nama_barang+"', HARGA= "+Harga+", SATUAN= "+Satuan+" WHERE ID_BARANG= "+Id_barang+"");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void DeleteBarang(String Id_barang){
        try {
            this.kn.ManipulasiData("DELETE FROM DATA_BARANG WHERE ID_BARANG = "+Id_barang+"" );
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
