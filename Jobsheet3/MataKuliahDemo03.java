package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data Mata Kuliah: ");
        int jumlahData = Integer.parseInt(sc.nextLine());

        MataKuliah03[] arrayOfMataKuliah = new MataKuliah03[jumlahData];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            sks = Integer.parseInt(sc.nextLine());
            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah03(); // pakai constructor default
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }


        System.out.println("\n========== DATA MATA KULIAH ==========");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));

            arrayOfMataKuliah[i].cetakInfo();
        }

        sc.close();
    }
}