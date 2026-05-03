package cm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner untuk input data

        // inisialisasi data mahasiswa
        Student[] students = {
            new Student("22001", "Andi", "Teknik Informatika", "08134566789"),
            new Student("22002", "Budi", "Teknik Informatika", "0821325123"),
            new Student("22003", "Citra", "Sistem Informasi Bisnis", "08241252354")
        };

        // inisialisasi data buku
        Book[] books = {
            new Book("B001", "Algoritma", 2020, "Singkong"),
            new Book("B002", "Basis Data", 2019, "Asik"),
            new Book("B003", "Pemrograman", 2021, "Usang"),
            new Book("B004", "Fisika", 2024, "Nakasdasd")
        };

        // inisialisasi data peminjaman (array of objects)
        BookLending[] loans = {
            new BookLending(students[0], books[0], 7),
            new BookLending(students[1], books[1], 3),
            new BookLending(students[2], books[2], 10),
            new BookLending(students[2], books[3], 6),
            new BookLending(students[0], books[1], 4)
        };

        int choice;

        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ==="); // looping menu utama
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // display data mahasiswa
                    System.out.println("\nStudent List:");
                    for (Student s : students) s.printStudent();
                    break;
                case 2: // display data buku
                    System.out.println("\nBook List:");
                    for (Book b : books) b.printBook();
                    break;
                case 3: // display data
                    System.out.println("\nLoan Data:");
                    for (BookLending l : loans) l.printLending();
                    break;
                case 4: // sorting denda terbesar menggunakan Insertion Sort
                    for (int i = 1; i < loans.length; i++) {
                        BookLending key = loans[i];
                        int j = i - 1;
                        while (j >= 0 && loans[j].fine < key.fine) {
                            loans[j + 1] = loans[j];
                            j = j - 1;
                        }
                        loans[j + 1] = key;
                    }
                    System.out.println("\nAfter sorting (Largest fine):");
                    for (BookLending l : loans) l.printLending();
                    // add
                    boolean[] hasOverdue = new boolean[students.length];
                    for (BookLending l : loans) {
                        if (l.overdue > 0) {
                            for (int i = 0; i < students.length; i++) {
                                if (students[i].nim.equals(l.sdt.nim)) {
                                    hasOverdue[i] = true;
                                    break;
                                }
                            }
                        }
                    }
                    int count = 1;
                    for (boolean b : hasOverdue) {
                        if (b) count++;
                    }
                    System.out.println("Number of students whose loan term exceeds 5 days: " + count);
                    break;
                    case 5: // searching NIM menggunakan binary search
                    System.out.print("\nEnter NIM: ");
                    String searchNim = sc.nextLine();

                    BookLending[] sortedForSearch = loans.clone(); // COPY ARRAY AGAR DATA ASLI (Menu 3) TIDAK BERUBAH URUTANNYA

                    for (int i = 1; i < sortedForSearch.length; i++) { // sorting ascending data copy-an berdasarkan NIM dengan Insertion Sort
                        BookLending key = sortedForSearch[i];
                        int j = i - 1;
                        while (j >= 0 && sortedForSearch[j].sdt.nim.compareTo(key.sdt.nim) > 0) {
                            sortedForSearch[j + 1] = sortedForSearch[j];
                            j = j - 1;
                        }
                        sortedForSearch[j + 1] = key;
                    }

                    // binary search pada array yang sudah diurutkan
                    int left = 0, right = sortedForSearch.length - 1, foundIndex = -1;
                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        int cmp = sortedForSearch[mid].sdt.nim.compareTo(searchNim);
                        if (cmp == 0) {
                            foundIndex = mid;
                            break;
                        } else if (cmp < 0) left = mid + 1;
                        else right = mid - 1;
                    }

                    // print hasil pencarian
                    if (foundIndex != -1) {
                        int start = foundIndex, end = foundIndex;
                        while (start > 0 && sortedForSearch[start - 1].sdt.nim.equals(searchNim)) start--;
                        while (end < sortedForSearch.length - 1 && sortedForSearch[end + 1].sdt.nim.equals(searchNim)) end++;
                        System.out.println();
                        for (int i = start; i <= end; i++) sortedForSearch[i].printLending();
                    } else {
                        System.out.println("Data not found!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}