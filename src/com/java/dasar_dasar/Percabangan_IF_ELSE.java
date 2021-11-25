package com.java.dasar_dasar;
import java.util.Scanner;

/**
 if (suatu kondisi) {
 // maka kerjakan ini
 // kerjakan perintah ini juga
 // …
 } else if (kondisi lain) {
 // kerjakan ini
 // kerjakan ini juga
 // …
 } else if (kondisi yang lain lagi) {
 // kerjakan perintah ini
 // kerjakan ini juga
 // …
 } esle {
 // kerjakan ini kalau
 // semua kondisi di atas
 // tidak ada yang benar
 // …
 }
 */

public class Percabangan_IF_ELSE {
    public static void main (String[] args){
        String nama,npm;
        int nilai_uts, nilai_uas;
        double nilai;

        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukan Nama : ");
        nama = masukan.nextLine();
        System.out.print("Masukan NPM : ");
        npm = masukan.nextLine();
        System.out.print("Masukan nilai UTS anda : ");
        nilai_uts = masukan.nextInt();
        System.out.print("Masukan nilai UAS anda : ");
        nilai_uas = masukan.nextInt();

        nilai = (nilai_uts*0.7) + (nilai_uas*0.3);
        if (nilai > 80 && nilai <= 100){
            System.out.print("\n Nilai : " + nilai);
            System.out.print("\n Anda mendapat grade A");
        }
        else if (nilai > 60 && nilai <= 80){
            System.out.print("\n Nilai : " + nilai);
            System.out.print("\n Anda mendapat grade B");
        }
        else if (nilai > 50 && nilai <= 65){
            System.out.print("\n Nilai : " + nilai);
            System.out.print("\n Anda mendapat grade C");
        }
        else if (nilai > 40 && nilai <= 50){
            System.out.print("\n Nilai : " + nilai);
            System.out.print("\n Anda mendapat grade D");
        }
        else if (nilai <= 40){
            System.out.print("\n Nilai : " + nilai);
            System.out.print("\n Anda mendapat grade E");
        }
    }
}
