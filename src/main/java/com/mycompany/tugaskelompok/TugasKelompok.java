/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaskelompok;

import static com.mycompany.tugaskelompok.Bacafile.bacafile;
import static com.mycompany.tugaskelompok.MultiCatch.bacaFile;

/**
 *
 * @author Aldio
 */
public class TugasKelompok {
    public static void main(String[] args) {
        // Contoh Produk
        Product product1 = new Product("123", "Product A", "Gudang A", 50.0, 100.0);

        // Proses Pembelian
        try {
            product1.beli (1); 
        } catch (Invalid e) {
            System.err.println("Error: " + e.getMessage());
        }
//    
    
//     String fileName = "Isi Data.txt"; // Ganti dengan nama file yang ingin dibaca
//
//        try {
//            String fileContent = bacafile(fileName);
//
//            if (fileContent != null) {
//                System.out.println("Isi file:\n" + fileContent);
//            } else {
//                System.out.println("File tidak ditemukan atau terjadi kesalahan saat membaca file.");
//            }
//        } catch (Exception e) {
//            // Menangani exception umum (jika terjadi kesalahan yang tidak terduga)
//            System.err.println("Terjadi kesalahan: " + e.getMessage());
//        }
        
//        
//         String fileName = "Data barang.txt"; // Ganti dengan nama file yang ingin dibaca
//
//        try {
//            String fileContent = bacaFile(fileName);
//
//            if (fileContent != null) {
//                System.out.println("Isi file \n" + fileContent);
//            } else {
//                System.out.println("File tidak ditemukan atau terjadi kesalahan saat membaca file.");
//            }
//        } catch (Exception e) {
//            System.err.println("Terjadi kesalahan: " + e.getMessage());
//        }
//        
    }   
        
    
}