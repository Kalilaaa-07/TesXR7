package Perulangan;

import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {
        int NilaiAwal, NilaiAkhir;
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Nilai Awal: ");
        NilaiAwal =  s.nextInt();
        System.out.println("Masukkan Nilai Akhir: ");
        NilaiAkhir = s.nextInt();

        for (int angka = 1; angka >=100; angka--) { //bisa dibalik sesuai variabelnyaee
            System.out.println(angka);
           

        }
    }
}
