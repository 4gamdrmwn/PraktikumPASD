package Jobsheet1;

import java.util.Scanner;

public class schedule {
    
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal; // array 2d
    static int n; 

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine();
        
        // row = n kolom = 4
        jadwal = new String[n][4];

        inputJadwal();

        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal berdasarkan Hari");
            System.out.println("3. Cari Jadwal berdasarkan Nama Matkul");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            if (menu == 1) {
                tampilSeluruhJadwal();
            } else if (menu == 2) {
                tampilJadwalPerHari();
            } else if (menu == 3) {
                tampilJadwalPerSemester();
            } else if (menu == 4) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void inputJadwal() {
        System.out.println("\n--- Input Data Jadwal ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("SKS: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSeluruhJadwal() {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        System.out.printf("%-30s %-10s %-10s %-15s\n", "Mata Kuliah", "SKS", "Hari", "Jam");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-30s %-10s %-10s %-15s\n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilJadwalPerHari() {
        System.out.print("\nMasukkan hari yang ingin dicari (Senin/Selasa/dll): ");
        String cariHari = sc.nextLine();
        
        System.out.println("--- Jadwal Hari " + cariHari + " ---");
        System.out.printf("%-30s %-10s %-10s %-15s\n", "Mata Kuliah", "SKS", "Hari", "Jam");
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-30s %-10s %-10s %-15s\n", 
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada jadwal kuliah di hari " + cariHari);
        }
    }
    static void tampilJadwalPerSemester() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String cariMatkul = sc.nextLine();
        
        System.out.println("--- Hasil Pencarian ---");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(cariMatkul)) {
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("SKS         : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah " + cariMatkul + " tidak ditemukan.");
        }
    }
}