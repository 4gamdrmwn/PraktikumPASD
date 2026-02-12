package Jobsheet1;

import java.util.Scanner;

public class licenseplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
            // array 2d 
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Masukkan kode plat nomor (A/B/D/dll): ");
        char inputKode = sc.next().charAt(0);
        
        int indexFound = -1;
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == Character.toUpperCase(inputKode)) {
                indexFound = i;
                break;
            }
        }

        if (indexFound != -1) {
            System.out.print("Kota: ");
            for (int j = 0; j < KOTA[indexFound].length; j++) {
                if (KOTA[indexFound][j] != '\0') { 
                    System.out.print(KOTA[indexFound][j]);
                }
            }
            System.out.println();
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}