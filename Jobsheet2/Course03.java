package Jobsheet2;

public class Course03 {
    String kodeCourse;
    String name;
    int Sks;
    int numberOfHours;

    public Course03() {
    }

    public Course03(String kodeCourse, String name, int Sks, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.Sks = Sks;
        this.numberOfHours = numberOfHours;
    }

    void DisplayInformation() {
        System.out.println("Kode: " + kodeCourse);
        System.out.println("Nama MK: " + name);
        System.out.println("SKS: " + Sks);
        System.out.println("Jam/minggu: " + numberOfHours);
    }

    void changeSKS(int sksNew) {
        Sks = sksNew;
        System.out.println("SKS telah diubah menjadi: " + Sks);
    }

    void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Jam bertambah, sekarang: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Jam berkurang, sekarang: " + numberOfHours);
        } else {
            System.out.println("Pengurangan tidak bisa, jam tidak mencukupi.");
        }
    }
}
