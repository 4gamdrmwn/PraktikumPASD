package cm;

public class bookLending {
    Student sdt;
    Book book;
    int loanPeriod;
    int loanLimit = 5; // batas maksimal pinjam 5 hari sesuai ketentuan
    int overdue;
    int fine;

    public bookLending(Student sdt, Book book, int loanPeriod) { // konstruktor sekaligus menghitung denda secara otomatis
        this.sdt = sdt;
        this.book = book;
        this.loanPeriod = loanPeriod;
        calculateFine();
    }

    public void calculateFine() { // kalkulasi denda: Rp 2.000 per hari jika lewat dari 5 hari
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }

    public void printLending() { // display detail peminjaman lengkap dengan denda
        System.out.println(sdt.name + " | " + book.title + " | Loan Period (days): " + loanPeriod + 
                           " | Late return of books: " + overdue + " | fine: " + fine);
    }
}