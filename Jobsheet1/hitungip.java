package Jobsheet1;
import java.util.Scanner;

public class hitungip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double quiz = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");
        if (tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");
            return;
        }
        double nilaiAkhir = (0.2 * tugas) + (0.2 * quiz) + (0.3 * uts) + (0.3 * uas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.print("Nilai Huruf: ");
        if (nilaiAkhir >= 80) {
            System.out.println("A");
        } else if (nilaiAkhir >= 70) {
            System.out.println("B");
        } else if (nilaiAkhir >= 60) {
            System.out.println("C");
        } else if (nilaiAkhir >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        System.out.println("===============================");
        System.out.println("===============================");
        if (nilaiAkhir >= 60) {
            System.out.println("Selamat, Anda Lulus.");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus.");
        }

    }
}
