package Jobsheet1;
import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        long nimLengkap = sc.nextLong(); 
        int n = (int) (nimLengkap % 100); 
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);
        System.out.println("==============================");

        for (int i = 1; i <= n; i++) {
        // angka 15 dan 10 agar tidak dicetak
            if (i == 10 || i == 15) {
                continue;
            }
            
            if (i % 3 == 0) {
                System.out.print("#");
            } 

            else if (i % 2 == 0) {
                System.out.print(i + "");
            } 

            else {
                System.out.print("*");
            }
        }
        System.out.println("\n==============================");
    }
}