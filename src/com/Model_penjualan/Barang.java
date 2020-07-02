/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model_penjualan;

import java.util.ArrayList;

/**
 *
 * @author Alifiyah
 */
public class Barang {
    private Integer Id_barang;
    private String jenis;
    private String Nama_barang;
    private Integer Harga;
    private Integer Satuan;
   

    public Integer getId_barang() {
        return Id_barang;
    }

    public void setId_barang(Integer Id_barang) {
        this.Id_barang = Id_barang;
    }

    public String getjenis() {
        return jenis;
    }

    public void setJenisbarang(String jenis) {
        this.jenis = jenis;
    }

    public String getNama_barang() {
        return Nama_barang;
    }

    public void setNama_barang(String Nama_barang) {
        this.Nama_barang = Nama_barang;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }

    public Integer getSatuan() {
        return Satuan;
    }

    public void setSatuan(Integer Satuan) {
        this.Satuan = Satuan;
    }
    
    
}
