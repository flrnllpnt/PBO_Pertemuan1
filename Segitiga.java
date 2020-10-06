package com.pboreg;

public class Segitiga {
    /**
     * Program Menghitung Luas Segitiga dengan:
     * alas dan tinggi diinput melalui kode program
     * tampilan output:
     * Program Luas Segitiga
     * alas = 10
     * tinggi = 20
     * Luas = 100
     */
    public static void main(String[] args) {
        int alas = 10;
        int tinggi = 20;
        double luas;
        luas = 0.5 * alas * tinggi;

        System.out.println("Program Luas Segitiga");
        System.out.println("alas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("Luas = " + luas);
    }
}
