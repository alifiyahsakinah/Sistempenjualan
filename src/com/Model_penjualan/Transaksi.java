/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model_penjualan;

import java.util.Date;

/**
 *
 * @author Alifiyah
 */
public class Transaksi {
    private Integer Id_transaksi;
    private Date Tgl_transaksi;
    private Integer Total_harga;
    private Integer Total_satuan;

    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }

    public Date getTgl_transaksi() {
        return Tgl_transaksi;
    }

    public void setTgl_transaksi(Date Tgl_transaksi) {
        this.Tgl_transaksi = Tgl_transaksi;
    }

    public Integer getTotal_harga() {
        return Total_harga;
    }

    public void setTotal_harga(Integer Total_harga) {
        this.Total_harga = Total_harga;
    }

    public Integer getTotal_satuan() {
        return Total_satuan;
    }

    public void setTotal_satuan(Integer Total_satuan) {
        this.Total_satuan = Total_satuan;
    }
    
    
}
