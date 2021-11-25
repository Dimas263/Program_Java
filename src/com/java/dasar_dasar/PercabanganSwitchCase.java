package com.java.dasar_dasar;
import java.util.Scanner;

/*
switch(variabel){
    case 1:
        // kerjakan kode ini
        // kode ini juga
        break;
    case 2:
        // kerjakan kode ini
        // kode ini juga
        break;
    case 3:
        // kerjakan kode ini
        // kode ini juga
        break;
    default:
        // kerjakan kode ini
        // kode ini juga
        break;
}
 */

public class PercabanganSwitchCase {
    public static void main(String[] args) {

        String lampu;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lampu Merah");
        System.out.println("___________");
        System.out.print("warna lampu: ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
