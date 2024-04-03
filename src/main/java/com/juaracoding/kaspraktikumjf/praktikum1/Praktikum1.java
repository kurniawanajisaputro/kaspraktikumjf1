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
        // Deklarasi variabel dengan tipe data numerik
        byte byteVarMax = Byte.MAX_VALUE; //127
        short shortVarMax = Short.MAX_VALUE; //32767
        int intVarMax = Integer.MAX_VALUE; //2147483647
        long longVarMax = Long.MAX_VALUE; //9223372036854775807L
        float floatVarMax = Float.MAX_VALUE; //3.4028235E38f
        double doubleVarMax = Double.MAX_VALUE; //3.4028235E38f

        // Perhitungan aritmatika
        double hasilPerhitungan = (doubleVarMax / floatVarMax) * intVarMax - longVarMax % shortVarMax + byteVarMax;

        // Cetak hasil perhitungan
        System.out.println("Hasil perhitungan: " + hasilPerhitungan);
    }
}
