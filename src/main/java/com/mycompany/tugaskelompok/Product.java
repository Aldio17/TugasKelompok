/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskelompok;

/**
 *
 * @author Aldio
 */
public class Product {
    String kodeBarang;
    String namaBarang;
    String gudang;
    double hargaBeli;
    double hargaJual;
    

    // Constructor
    public Product(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        
    }
    
     public void beli(int jumlahbarang) throws Invalid {
        // Apakah lebih besar dari 0
        if (this.hargaJual <= 0) {
            throw new Invalid ("Harga jual harus lebih besar dari 0");
        }

        // minimal
        if (jumlahbarang < 1) {
            throw new Invalid ("Jumlah pembelian minimal harus 1");
        }

        // Jika proses terpenuhi
        System.out.println("Pembelian berhasil diproses: " + this.namaBarang );
    }
}
