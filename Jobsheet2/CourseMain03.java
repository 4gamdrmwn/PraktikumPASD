package Jobsheet2;

public class CourseMain03 {
    public static void main(String[] args) {
        // Object 1: default constructor
        Course03 c1 = new Course03();
        c1.kodeCourse = "ASD101";
        c1.name = "Algoritma dan Struktur Data";
        c1.Sks = 3;
        c1.numberOfHours = 4;

        c1.DisplayInformation();
        c1.changeSKS(4);
        c1.addHours(2);
        c1.reduceHours(3);
        System.out.println();

        // Object 2: parameterized constructor
        Course03 c2 = new Course03("BD201", "Basis Data", 3, 4);
        c2.DisplayInformation();
        c2.reduceHours(10); // contoh gagal
    }
}
