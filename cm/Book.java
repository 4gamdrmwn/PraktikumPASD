package cm;

public class Book {
    String code;
    String title;
    int year;
    String status; 

    public Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Tersedia";
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year);
    }
}