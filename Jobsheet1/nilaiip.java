package Jobsheet1;
import java.util.Scanner;

public class nilaiip {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("===============================");
    System.out.println("Program Menghitung IP Semester");
    System.out.println("===============================");
    System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
    double pancasila = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
    double kti = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
    double ctps = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Matematika Dasar: ");
    double matematika = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris: ");
    double bing = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman: ");
    double dp = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
    double prakdp = input.nextDouble();

    System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
    double ksk = input.nextDouble();
    input.close();

    // Function to convert score to letter grade
    String[] nilaiHuruf = new String[8];
    double[] bobotNilai = new double[8];
    
    nilaiHuruf[0] = getNilaiHuruf(pancasila);
    nilaiHuruf[1] = getNilaiHuruf(kti);
    nilaiHuruf[2] = getNilaiHuruf(ctps);
    nilaiHuruf[3] = getNilaiHuruf(matematika);
    nilaiHuruf[4] = getNilaiHuruf(bing);
    nilaiHuruf[5] = getNilaiHuruf(dp);
    nilaiHuruf[6] = getNilaiHuruf(prakdp);
    nilaiHuruf[7] = getNilaiHuruf(ksk);
    
    bobotNilai[0] = getBobotNilai(pancasila);
    bobotNilai[1] = getBobotNilai(kti);
    bobotNilai[2] = getBobotNilai(ctps);
    bobotNilai[3] = getBobotNilai(matematika);
    bobotNilai[4] = getBobotNilai(bing);
    bobotNilai[5] = getBobotNilai(dp);
    bobotNilai[6] = getBobotNilai(prakdp);
    bobotNilai[7] = getBobotNilai(ksk);

    // output
    System.out.println("\nhasil Konversi Nilai");
    System.out.println("=======================");
    System.out.printf("%-45s %15s %15s %15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
    System.out.println("Pancasila " + " ".repeat(35) + String.format("%15.2f", pancasila) + " ".repeat(8) + nilaiHuruf[0] + " ".repeat(15) + String.format("%15.2f", bobotNilai[0]));
    System.out.println("Konsep Teknologi Informasi " + " ".repeat(17) + String.format("%15.2f", kti) + " ".repeat(8) + nilaiHuruf[1] + " ".repeat(15) + String.format("%15.2f", bobotNilai[1]));
    System.out.println("Critical Thinking dan Problem Solving " + " ".repeat(7) + String.format("%15.2f", ctps) + " ".repeat(8) + nilaiHuruf[2] + " ".repeat(15) + String.format("%15.2f", bobotNilai[2]));
    System.out.println("Matematika Dasar " + " ".repeat(28) + String.format("%15.2f", matematika) + " ".repeat(8) + nilaiHuruf[3] + " ".repeat(15) + String.format("%15.2f", bobotNilai[3]));
    System.out.println("Bahasa Inggris " + " ".repeat(30) + String.format("%15.2f", bing) + " ".repeat(8) + nilaiHuruf[4] + " ".repeat(15) + String.format("%15.2f", bobotNilai[4]));
    System.out.println("Dasar Pemrograman " + " ".repeat(27) + String.format("%15.2f", dp) + " ".repeat(8) + nilaiHuruf[5] + " ".repeat(15) + String.format("%15.2f", bobotNilai[5]));
    System.out.println("Praktikum Dasar Pemrograman " + " ".repeat(17) + String.format("%15.2f", prakdp) + " ".repeat(8) + nilaiHuruf[6] + " ".repeat(15) + String.format("%15.2f", bobotNilai[6]));
    System.out.println("Keselamatan dan Kesehatan Kerja " + " ".repeat(12) + String.format("%15.2f", ksk) + " ".repeat(8) + nilaiHuruf[7] + " ".repeat(15) + String.format("%15.2f", bobotNilai[7]));
    System.out.println("=======================");
    
    double totalBobot = bobotNilai[0] + bobotNilai[1] + bobotNilai[2] + bobotNilai[3] + bobotNilai[4] + bobotNilai[5] + bobotNilai[6] + bobotNilai[7];
    double ip = totalBobot / 8;
    
    System.out.printf("IP : %.2f\n", ip);
  }

  public static String getNilaiHuruf(double nilai) {
    if (nilai >= 81 && nilai <= 100) {
      return "A";
    } else if (nilai >= 73 && nilai < 81) {
      return "B+";
    } else if (nilai >= 65 && nilai < 73) {
      return "B";
    } else if (nilai >= 60 && nilai < 65) {
      return "C+";
    } else if (nilai >= 50 && nilai < 60) {
      return "C";
    } else if (nilai >= 39 && nilai < 50) {
      return "D";
    } else {
      return "E";
    }
  }

  public static double getBobotNilai(double nilai) {
    if (nilai >= 81 && nilai <= 100) {
      return 4.0;
    } else if (nilai >= 73 && nilai < 81) {
      return 3.5;
    } else if (nilai >= 65 && nilai < 73) {
      return 3.0;
    } else if (nilai >= 60 && nilai < 65) {
      return 2.5;
    } else if (nilai >= 50 && nilai < 60) {
      return 2.0;
    } else if (nilai >= 39 && nilai < 50) {
      return 1.0;
    } else {
      return 0.0;
    }
  }
}
