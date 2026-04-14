package cm;

public class Loan {
    Student student;
    Book book;
    int loanDays;
    int fine;

    public Loan(Student student, Book book, int loanDays) { // constructor untuk membuat data peminjaman
        this.student = student;
        this.book = book;
        this.loanDays = loanDays;
        this.fine = calculateFine(); // menghitung denda saat object dibuat
    }

    public int calculateFine() { // method untuk menghitung denda keterlambatan
        int maxDays = 5;
        int finePerDay = 2000;

        if (loanDays > maxDays) { // jika terlambat
            return (loanDays - maxDays) * finePerDay;
        } else { // jika tidak terlambat
            return 0;
        }
    }

    public void print() { // menampilkan data peminjaman
        System.out.println(student.nim + " - " + student.name + " - "
                + book.title + " - " + loanDays + " days - Fine: Rp " + fine);
    }
}