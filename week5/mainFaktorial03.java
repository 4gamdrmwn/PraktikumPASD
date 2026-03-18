package week5;

import java.util.Scanner;

public class mainFaktorial03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        faktorial03 fk = new faktorial03();
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan DC: " +fk.faktorialDC(nilai));

        sc.close();
    }

}