/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskelompok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Aldio
 */
public class MultiCatch {
     public static String bacaFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder content = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            return content.toString();
        } catch (IOException e) {
            // Berfungsi menangani exception jika terjadi kesalahan saat membaca file
            System.err.println("File tidak ditemukan: " + e.getMessage());
        } catch (SecurityException e) {
            // Berfungsi untuk menangani exception jika terjadi kesalahan keamanan
            System.err.println("Terjadi Kesalahan Keamanan: " + e.getMessage());
        } catch (Exception e) {
            // Berfungsi untuk menangani exception umum (jika terjadi kesalahan yang tidak terduga)
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }

        return null;
    }
}
