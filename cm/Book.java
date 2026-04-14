package cm;

public class Book {
    String code;
    String title;
    int year;

    public Book(String code, String title, int year) { // constructor untuk inisialisasi data buku
        this.code = code;
        this.title = title;
        this.year = year;
    }

    public void print() { // menampilkan data buku
        System.out.println(code + " - " + title + " - " + year);
    }
}