/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119906.rizqyanandarusmana.no2;

import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Program  : UTS-no2.
 */
public class UTSIF10K10119906RizqyAnandaRusmanaNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo, jumlah;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal\t\t: ");
        saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil\t: ");
        jumlah = scanner.nextInt();
        Tabungan tabung = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang\t\t: "+tabung.ambilUang(jumlah));
    }
    
}
