package Jobsheet5;

import java.util.Scanner;

public class LecturerMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk input data
        LecturerData03 data = new LecturerData03();
        int choice;

        // looping menu utama
        do {
            System.out.println("\n=== Lecturer Data Menu ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Bubble Sort - Age)");
            System.out.println("4. Sort DSC (Selection Sort - Age)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // input data secara manual
                    System.out.println("\n--- Input Lecturer Data ---");
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Gender (true for Male, false for Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    data.add(new Lecturer03(id, name, gender, age));
                    break;
                case 2: // display data yang sudah diinput
                    System.out.println("\nAll Lecturer Data:");
                    data.print();
                    break;
                case 3: // sorting data dari muda ke tua pake bubblesort
                    data.sortingASC();
                    System.out.println("\nSorted by age (Ascending):");
                    data.print();
                    break;
                case 4: // sorting data dari tua ke muda pake selection sort
                    data.sortingDSC();
                    System.out.println("\nSorted by age (Descending):");
                    data.print();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close(); // menutup scanner
    }
}