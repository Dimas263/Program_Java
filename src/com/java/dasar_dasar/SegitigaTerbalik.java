package com.java.dasar_dasar;

public class SegitigaTerbalik {
    public static void main(String[] args) {

        int a,b,c;

        //Segitiga Terbalik Bintang
        for ( a = 4; a >= 1; a--) {
            //outer loop

            for ( b = 4; b > a; b--) {
                //inner loop no 1

                System.out.print(" ");
                //Memberikan spasi samping ke kiri
            }
            for ( c = 1; c < (a * 2); c++) {
                //inner loop no 2
                System.out.print("*");
                //Menampilkan barisan angka segitiga sama kaki atau piramida

            }

            System.out.println();
            //Memberikan garis baru atau enter
        }

        //Segitiga Terbalik Angka
        for ( a = 4; a >= 1; a--) {
            //outer loop

            for ( b = 4; b > a; b--) {
                //inner loop no 1

                System.out.print(" ");
                //Memberikan spasi samping ke kiri
            }
            for ( c = 1; c < (a * 2); c++) {
                //inner loop no 2
                System.out.print(c);
                //Menampilkan barisan angka segitiga sama kaki atau piramida

            }

            System.out.println();
            //Memberikan garis baru atau enter
        }
    }
}
