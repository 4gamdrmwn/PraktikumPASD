package cm;

public class Student {
    String nim;
    String name;
    String studyProgram;

    public Student(String nim, String name, String studyProgram) { // constructor untuk inisialisasi data mahasiswa
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void print() { // menampilkan data mahasiswa
        System.out.println(nim + " - " + name + " - " + studyProgram);
    }
}