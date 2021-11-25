package com.java.dasar_dasar;
import java.util.Scanner;

/**
 for (nilai_awal;kondisi;modifier){
 pernyataan_yang_diulang;
 }
 */

public class PerulanganFor {
    public static void main(String args[]){

        int i;

        System.out.println("Kalimat Pengulangan");
        System.out.println("-------------------");
        for (i = 1; i < 5; i++) {
            System.out.println("Hello World ");
        }
        System.out.println("");

        System.out.println("Kalimat Berurutan Awal");
        System.out.println("----------------------");
        for (i = 1; i <= 5; i++) {
            System.out.println("Hello World "+i);
        }
        System.out.println("");

        System.out.println("Kalimat Berurutan Akhir");
        System.out.println("-----------------------");
        for (i = 5; i >= 1; i--) {
            System.out.println("Hello World "+i);
        }
        System.out.println("");

        System.out.println("Angka Bilangan Berurutan");
        System.out.println("------------------------");
        for (i=1;i<=10;i++){
            System.out.print(i+", ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Angka Bilangan Ganjil");
        System.out.println("---------------------");
        for (i=1;i<=10;i=i+2){
            System.out.print(i+", ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Angka Bilangan 3");
        System.out.println("----------------");
        for (i = 1; i <= 10; i++) {
            System.out.print(i*3 + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Angka Bilangan 3 V2");
        System.out.println("-------------------");
        for (i = 3; i <= 30; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println("");

    }
}
