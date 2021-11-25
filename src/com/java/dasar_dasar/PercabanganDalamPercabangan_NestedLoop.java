package com.java.dasar_dasar;
import java.util.Scanner;

/**
 Apakah anda punya kartu member?
 - ya
     * Apakah belanjaan anda lebih dari 500rb?
         # ya : mendapatkan diskon 50rb
         # tidak : tidak mendapatkan diskon
     * Apakah belanjaan anda lebih dari 100rb?
         # ya : mendapatkan diskon 15rb
         # tidak: tidak mendapatkan diskon
 - tidak
     * Apakah belanjaan anda lebih dari 100rb?
         # ya : mendapatkan diskon 10rb
         # tidak: tidak mendapatkan diskon
 */

public class PercabanganDalamPercabangan_NestedLoop {
    public static void main(String[] args) {
        // deklarasi variabel dan Scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        // proses
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        // total yang harus dibayar
        bayar = belanjaan - diskon;

        // output
        System.out.println("__________________________");
        System.out.println("Diskon" + diskon);
        System.out.println("Total Bayar: Rp " + bayar);
    }
}
