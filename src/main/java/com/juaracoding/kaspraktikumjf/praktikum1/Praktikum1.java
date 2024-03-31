package com.juaracoding.kaspraktikumjf.praktikum1;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 30/03/2024 23:43
@Last Modified 30/03/2024 23:43
Version 1.0
*/

public class Praktikum1 {
    public static void main(String[] args) {
        // Deklarasi variabel dengan nama informatif dan nilai maksimal
        int bilanganBulat1 = Integer.MAX_VALUE; // 2147483647
        int bilanganBulat2 = 5;
        byte bilanganByte = Byte.MAX_VALUE; // 127
        short bilanganShort = Short.MAX_VALUE; // 32767
        long bilanganLong = Long.MAX_VALUE; // 9223372036854775807
        float bilanganFloat = Float.MAX_VALUE; // 3.4028235E38
        double bilanganDouble = Double.MAX_VALUE; // 1.7976931348623157E308

        // Perhitungan dengan operator %
        int sisaBagi = bilanganBulat1 % bilanganBulat2;

        // Perhitungan dengan operator /
        double hasilBagi = bilanganDouble / bilanganFloat;

        // Perhitungan dengan operator *
        long hasilKali = bilanganLong * bilanganShort;

        // Perhitungan dengan operator +
        int hasilJumlah = bilanganBulat1 + bilanganByte;

        // Perhitungan dengan operator -
        float hasilKurang = bilanganFloat - bilanganBulat2;

        // Menghitung total hasil
        double totalHasil = sisaBagi + hasilBagi + hasilKali + hasilJumlah + hasilKurang;

        // Menampilkan hasil perhitungan
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Hasil bagi: " + hasilBagi);
        System.out.println("Hasil kali: " + hasilKali);
        System.out.println("Hasil jumlah: " + hasilJumlah);
        System.out.println("Hasil kurang: " + hasilKurang);
        System.out.println("Total hasil: " + totalHasil);
    }
}
