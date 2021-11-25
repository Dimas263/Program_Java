package com.java.dasar_dasar;
import java.util.Scanner;

/**
 do {
 pernyataan;
 } while (kondisi);
 */

public class PerulanganDoWhile {
    public static void main(String[] args) {

        int i, bilangan;

        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        bilangan = masukan.nextInt();

        i = bilangan;

        do{
            System.out.println(bilangan);
            i++;
        }
        while (bilangan >= 5);
    }
}
