package Jobsheet3;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data Dosen : ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        System.out.println("==========================================");

        Dosen03[] arrayOfDosen03 = new Dosen03[jumlahDosen];

        String  kode, nama, dummy;
        Boolean jenisKelamin;
        int     usia;

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode                : ");
            kode = sc.nextLine();

            System.out.print("Nama                : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            dummy        = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("L");

            System.out.print("Usia                : ");
            usia = Integer.parseInt(sc.nextLine());

            System.out.println("------------------------------------------");

            arrayOfDosen03[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        // BUAT OBJECT DataDosen03 
        DataDosen03 dataDosen03 = new DataDosen03();


        dataDosen03.dataSemuaDosen(arrayOfDosen03);

        dataDosen03.jumlahDosenPerJenisKelamin(arrayOfDosen03);

        dataDosen03.rerataUsiaDosenPerJenisKelamin(arrayOfDosen03);

        dataDosen03.infoDosenPalingTua(arrayOfDosen03);

        dataDosen03.infoDosenPalingMuda(arrayOfDosen03);

        sc.close();
    }
}