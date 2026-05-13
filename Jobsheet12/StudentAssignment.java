package Jobsheet12;

public class StudentAssignment {
    String nim, name;

    public StudentAssignment() {
    }

    public StudentAssignment(String nm, String nama) {
        nim = nm;
        name = nama;
    }

    void print() {
        System.out.println("NIM: " + nim + " - Name: " + name);
    }
}