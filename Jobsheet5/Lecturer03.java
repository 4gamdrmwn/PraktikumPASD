package Jobsheet5;

public class Lecturer03 {
    String id;
    String name;
    boolean gender; // true = Male, false = Female
    int age;

    // konstruktor untuk menginisialisasi data dosen saat object dibuat
    public Lecturer03(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    // method untuk menampilkan data dosen
    public void print() {
        // Mengubah boolean gender menjadi teks yang lebih mudah dibaca
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + genderStr + ", Age: " + age);
    }
}