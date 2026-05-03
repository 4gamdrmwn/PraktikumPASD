package Jobsheet10;

public class Student03 {
    String nim;
    String name;
    String className;
    int grade;

    public Student03(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1; // Default -1 indicating ungraded assignment
    }

    public void grading(int grade) {
        this.grade = grade;
    }
}