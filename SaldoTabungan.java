/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saldotabungan;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
public class SaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 6;

        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp. %,d%n", i, (int) saldoAwal);
        }
    }
}