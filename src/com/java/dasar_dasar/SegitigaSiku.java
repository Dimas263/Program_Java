package com.java.dasar_dasar;
import java.util.Scanner;

public class SegitigaSiku {
    public static void main(String[] args) {
        //Segitiga Siku Bintang
        int x,y;
        for (x = 0; x <=7; x++) {
            //outer loop
            System.out.println();
            //Memberi garis baru atau enter

            for (y = 0; y < x; y++) {
                //inner loop
                System.out.print(" * ");
                //menampilkan bintang pada output
            }
        }
        //Segitiga Siku Angka
        int a,b;
        for (a = 7; a >=0; a--) {
            //outer loop
            System.out.println();
            //Memberi garis baru atau enter

            for (b = 7; b > a; b--) {
                //inner loop
                System.out.print(b + " ");
                //menampilkan bintang pada output
            }
        }
    }
}
