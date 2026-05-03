package cm;

public class Book {
    String code;
    String title;
    int year;
    String publisher;
    String status; 

    public Book(String code, String title, int year, String publisher) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.publisher = publisher;

        this.status = "Tersedia";
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year + " | Publisher: " + publisher);
    }
}