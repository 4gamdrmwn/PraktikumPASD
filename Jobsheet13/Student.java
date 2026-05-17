package Jobsheet13;

public class Student {
    String nim, name, className;
    double gpa;

    public Student() {
    }

    public Student(String nm, String nama, String kls, double ip) {
        this.nim = nm;
        this.name = nama;
        this.className = kls;
        this.gpa = ip;
    }

    void print() {
        System.out.println(nim + " " + name + " " + className + " " + gpa);
    }
}