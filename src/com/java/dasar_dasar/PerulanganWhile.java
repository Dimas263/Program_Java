package com.java.dasar_dasar;
import java.util.Scanner;

/**
 while (kondisi){
 pernyataan;
 }
 */
public class PerulanganWhile {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int bilangan=1;

        while (bilangan!=0){
            System.out.print("Masukkan Bilangan 0 : ");
            bilangan=input.nextInt();
        }
        System.out.println("Bilangan Benar");
    }
}
