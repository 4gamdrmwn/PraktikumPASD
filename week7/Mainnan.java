package week7;


import java.util.Scanner;

import cm.Book;
import cm.BookLending;
import cm.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Mainnan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MENGGUNAKAN ARRAYLIST UNTUK SEMUA DATA AGAR BISA DITAMBAH (DINAMIS)
        
        // Inisialisasi awal data Mahasiswa
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("22001", "Andi", "Teknik Informatika", "08134566789"),
            new Student("22002", "Budi", "Teknik Informatika", "0821325123"),
            new Student("22003", "Citra", "Sistem Informasi Bisnis", "08241252354")
        ));

        // Inisialisasi awal data Buku
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
            new Book("B001", "Algoritma", 2020, "Singkong"),
            new Book("B002", "Basis Data", 2019, "Asik"),
            new Book("B003", "Pemrograman", 2021, "Usang"),
            new Book("B004", "Fisika", 2024, "Nakasdasd")
        ));

        // Inisialisasi awal data Peminjaman
        ArrayList<BookLending> loans = new ArrayList<>(Arrays.asList(
            new BookLending(students.get(0), books.get(0), 7),
            new BookLending(students.get(1), books.get(1), 3),
            new BookLending(students.get(2), books.get(2), 10),
            new BookLending(students.get(2), books.get(3), 6),
            new BookLending(students.get(0), books.get(1), 4)
        ));

        int choice;

        // Looping menu utama sistem perpustakaan
        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Add Book");
            System.out.println("4. Display Books");
            System.out.println("5. Add Borrowing");
            System.out.println("6. Display Borrowings");
            System.out.println("7. Sort by Fines (Insertion Sort)");
            System.out.println("8. Search by Student ID (Binary Search)");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            choice = sc.nextInt();
            sc.nextLine(); // Membersihkan sisa enter (newline) dari nextInt()

            switch (choice) {
                case 1: // Menambah Mahasiswa Baru
                    System.out.println("\n--- Add New Student ---");
                    System.out.print("Enter NIM: ");
                    String newNim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter Study Program: ");
                    String newProdi = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String newPhone = sc.nextLine();
                    
                    students.add(new Student(newNim, newName, newProdi, newPhone));
                    System.out.println("Success: Student added!");
                    break;

                case 2: // Menampilkan Data Mahasiswa
                    System.out.println("\nStudent List (Total: " + students.size() + "):");
                    for (Student s : students) s.printStudent();
                    break;

                case 3: // Menambah Buku Baru
                    System.out.println("\n--- Add New Book ---");
                    System.out.print("Enter Code: ");
                    String newCode = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int newYear = sc.nextInt();
                    sc.nextLine(); // Membersihkan sisa enter
                    System.out.print("Enter Publisher: ");
                    String newPublisher = sc.nextLine();
                    
                    books.add(new Book(newCode, newTitle, newYear, newPublisher));
                    System.out.println("Success: Book added!");
                    break;

                case 4: // Menampilkan Data Buku
                    System.out.println("\nBook List (Total: " + books.size() + "):");
                    for (Book b : books) b.printBook();
                    break;

                case 5: // Menambah Peminjaman Baru
                    System.out.println("\n--- Add New Borrowing ---");
                    System.out.print("Enter Student NIM: ");
                    String targetNim = sc.nextLine();
                    System.out.print("Enter Book Code: ");
                    String targetBookCode = sc.nextLine();
                    System.out.print("Enter Loan Period (days): ");
                    int period = sc.nextInt();
                    sc.nextLine();

                    // Proses mencari referensi objek asli di list Mahasiswa
                    Student selectedSdt = null;
                    for (Student s : students) {
                        if (s.nim.equals(targetNim)) {
                            selectedSdt = s;
                            break;
                        }
                    }

                    // Proses mencari referensi objek asli di list Buku
                    Book selectedBook = null;
                    for (Book b : books) {
                        if (b.code.equals(targetBookCode)) {
                            selectedBook = b;
                            break;
                        }
                    }

                    // Validasi: Jika buku dan mahasiswa ketemu, simpan ke list peminjaman
                    if (selectedSdt != null && selectedBook != null) {
                        loans.add(new BookLending(selectedSdt, selectedBook, period));
                        System.out.println("Success: Loan transaction added!");
                    } else {
                        System.out.println("Failed: Student NIM or Book Code not found!");
                    }
                    break;

                case 6: // Menampilkan Data Peminjaman
                    System.out.println("\nLoan Data (Total: " + loans.size() + "):");
                    for (BookLending l : loans) l.printLending();
                    break;

                case 7: // Sorting denda terbesar menggunakan Insertion Sort (ArrayList version)
                    for (int i = 1; i < loans.size(); i++) {
                        BookLending key = loans.get(i);
                        int j = i - 1;
                        // Membandingkan denda (Descending/Terbesar ke terkecil)
                        while (j >= 0 && loans.get(j).fine < key.fine) {
                            loans.set(j + 1, loans.get(j));
                            j = j - 1;
                        }
                        loans.set(j + 1, key);
                    }
                    System.out.println("\nAfter sorting (Largest fine):");
                    for (BookLending l : loans) l.printLending();
                    break;

                case 8: // Pencarian menggunakan Binary Search (ArrayList version)
                    System.out.print("\nEnter NIM to search: ");
                    String searchNim = sc.nextLine();

                    // Clone data ke ArrayList baru agar urutan di Menu 6 tidak berantakan
                    ArrayList<BookLending> sortedForSearch = new ArrayList<>(loans);

                    // Sorting NIM secara ASC dengan Insertion Sort (Syarat wajib Binary Search)
                    for (int i = 1; i < sortedForSearch.size(); i++) {
                        BookLending key = sortedForSearch.get(i);
                        int j = i - 1;
                        while (j >= 0 && sortedForSearch.get(j).sdt.nim.compareTo(key.sdt.nim) > 0) {
                            sortedForSearch.set(j + 1, sortedForSearch.get(j));
                            j = j - 1;
                        }
                        sortedForSearch.set(j + 1, key);
                    }

                    // Logika inti Binary Search
                    int left = 0, right = sortedForSearch.size() - 1, foundIndex = -1;
                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        int cmp = sortedForSearch.get(mid).sdt.nim.compareTo(searchNim);
                        if (cmp == 0) {
                            foundIndex = mid;
                            break;
                        } else if (cmp < 0) left = mid + 1;
                        else right = mid - 1;
                    }

                    // Print hasil pencarian (mengecek kiri-kanan jika ada peminjaman ganda)
                    if (foundIndex != -1) {
                        int start = foundIndex, end = foundIndex;
                        while (start > 0 && sortedForSearch.get(start - 1).sdt.nim.equals(searchNim)) start--;
                        while (end < sortedForSearch.size() - 1 && sortedForSearch.get(end + 1).sdt.nim.equals(searchNim)) end++;
                        System.out.println();
                        for (int i = start; i <= end; i++) sortedForSearch.get(i).printLending();
                    } else {
                        System.out.println("Data not found!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 0-8.");
            }
        } while (choice != 0);
        sc.close();
    }
}