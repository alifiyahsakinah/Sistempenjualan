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

import com.Model_penjualan.JenisBarang;
import com.Database_penjualan.Koneksi;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jenis_controller {
    Koneksi kn;
    public static ArrayList<JenisBarang> arrjenis;
    
    public jenis_controller(){
        this.kn = new Koneksi();
        this.arrjenis = new ArrayList<>();
    }
    

  public ArrayList<JenisBarang> getDatajenis() throws SQLException{
      this.arrjenis.clear();
      ResultSet rs = this.kn.GetData("SELECT * FROM DATAJENIS_BARANG");
      
      while(rs.next()){
          JenisBarang jenis = new JenisBarang();
          jenis.setId_jenis(rs.getInt("ID_JENIS"));
          jenis.setJenis_barang(rs.getString("JENIS_BARANG"));
          
          arrjenis.add(jenis);
          
      }return arrjenis;
  }
  
  public void InsertJenis(String Nama_jenis){
      try {
          this.kn.ManipulasiData("INSERT INTO DATAJENIS_BARANG VALUES (ID_JENIS.NEXTVAL,'"+Nama_jenis+"')" );
          System.out.println(this.kn.ManipulasiData("INSERT INTO DATAJENIS_BARANG VALUES (ID_JENIS.NEXTVAL,'"+Nama_jenis+"')" ));
        } catch (Exception e) {
          System.err.println("Error : "+e);
      }
      
  }
  
  public void UpdateJenis(String Id_jenis,String Nama_Jenis){
        try {
            this.kn.ManipulasiData("UPDATE DATAJENIS_BARANG SET JENIS_BARANG= '"+Nama_Jenis+"' WHERE ID_JENIS= "+Id_jenis+"");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }

}