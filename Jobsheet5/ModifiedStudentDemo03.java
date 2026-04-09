package Jobsheet5;
import java.util.Scanner;

public class ModifiedStudentDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define the capacity of the list
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        
        TopStudents03 topStudents = new TopStudents03(numStudents);

        // Dynamic Input Loop
        for (int i = 0; i < numStudents; i++) {
            System.out.println("--- Input Data for Student " + (i + 1) + " ---");
            System.out.print("NIM          : ");
            String nim = sc.nextLine();
            System.out.print("Name         : ");
            String name = sc.nextLine();
            System.out.print("Student Class: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA          : ");
            double gpa = sc.nextDouble();
            sc.nextLine(); // Clear the buffer after reading double

            // Adding the dynamic data to the object array
            topStudents.add(new Student03(nim, name, studentClass, gpa));
        }

        System.out.println("\nOriginal student list:");
        topStudents.print();

        // Sorting by GPA using Bubble Sort (Descending)
        topStudents.bubbleSort();
        System.out.println("\nSorted student list (by GPA, descending):");
        topStudents.print();
        
        sc.close();
    }
}