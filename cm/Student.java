package cm;

public class Student {
    String nim;
    String name;
    String study_program;

    public Student(String nim, String name, String study_program) { // inisialisasi data mahasiswa
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
    }

    public void printStudent() { // display data mahasiswa sesuai format output
        System.out.println("NIM: " + nim + " | Name: " + name + " | Study program: " + study_program);
    }
}