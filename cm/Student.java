package cm;

public class Student {
    String nim;
    String name;
    String study_program;
    String phone;

    public Student(String nim, String name, String study_program, String phone) { // inisialisasi data mahasiswa
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
        this.phone = phone;
    }

    public void printStudent() { // display data mahasiswa sesuai format output
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + study_program + " | Phone Number: " + phone);
    }
}