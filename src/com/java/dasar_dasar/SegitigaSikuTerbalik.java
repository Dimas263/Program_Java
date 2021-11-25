package com.java.dasar_dasar;

public class SegitigaSikuTerbalik {
    public static void main(String[] args) {
        //Segitiga Siku Terbalik Bintang
        int a = 5;
        for (int b = 1; b <= a; b++){
            for (int c = 1; c <= b; c++) {
                System.out.print('*');
            }
            System.out.println();
        }

        //Segitiga Siku Terbalik Angka
        for (int b = 1; b <= a; b++){
            for (int c = 1; c <= b; c++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
