package cm;

import java.util.Scanner;

public class MainLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk input menu
        int choice;

        // inisialisasi data mahasiswa
        Student s1 = new Student("22001", "Andi", "Informatics Engineering");
        Student s2 = new Student("22002", "Budi", "Informatics Engineering");
        Student s3 = new Student("22003", "Image", "Business Information Systems");

        // inisialisasi data buku
        Book b1 = new Book("B001", "Algorithm", 2020);
        Book b2 = new Book("B002", "Database", 2019);
        Book b3 = new Book("B003", "Programming", 2021);
        Book b4 = new Book("B004", "Physics", 2024);

        LoanData data = new LoanData(); // object untuk mengelola data peminjaman

        // menambahkan data peminjaman awal
        data.add(new Loan(s1, b1, 7));
        data.add(new Loan(s2, b2, 3));
        data.add(new Loan(s3, b3, 10));
        data.add(new Loan(s3, b4, 6));
        data.add(new Loan(s1, b2, 4));

        // looping menu utama
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Loans");
            System.out.println("4. Sort by Fine (DESC)");
            System.out.println("5. Search by NIM");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // menampilkan data mahasiswa
                    System.out.println("\nStudent Data:");
                    s1.print();
                    s2.print();
                    s3.print();
                    break;

                case 2: // menampilkan data buku
                    System.out.println("\nBook Data:");
                    b1.print();
                    b2.print();
                    b3.print();
                    b4.print();
                    break;

                case 3: // menampilkan data peminjaman
                    System.out.println("\nLoan Data:");
                    data.print();
                    break;

                case 4: // sorting berdasarkan denda terbesar
                    data.sortByFineDesc();
                    System.out.println("\nSorted by Fine:");
                    data.print();
                    break;

                case 5: // searching berdasarkan NIM
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();

                    data.sortByFineDesc(); // memastikan data sudah terurut sebelum binary search

                    int result = data.binarySearch(nim);

                    if (result != -1) {
                        System.out.println("Data found:");
                        data.loans[result].print();
                    } else {
                        System.out.println("Data not found!");
                    }
                    break;

                case 6: // keluar dari program
                    System.out.println("Exit...");
                    break;

                default: // jika input salah
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close(); // menutup scanner
    }
}