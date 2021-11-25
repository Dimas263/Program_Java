package com.java.dasar_dasar;
import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        int x = 5;
        //Segitiga Bintang
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
        //Segitiga Angka
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
