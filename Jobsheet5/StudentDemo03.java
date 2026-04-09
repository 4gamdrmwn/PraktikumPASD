package Jobsheet5;

public class StudentDemo03 {
    public static void main(String[] args) {
        TopStudents03 topStudents = new TopStudents03(5);
        
        topStudents.add(new Student03("2201", "Alice", "A", 3.9));
        topStudents.add(new Student03("2202", "Bob", "B", 3.7));
        topStudents.add(new Student03("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student03("2204", "David", "D", 3.6));
        topStudents.add(new Student03("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        System.out.println("\nSorted (Bubble Sort - Descending GPA):");
        topStudents.bubbleSort();
        topStudents.print();

        System.out.println("\nSorted (Selection Sort - Ascending GPA):");
        topStudents.selectionSort();
        topStudents.print();

        System.out.println("\nSorted (Insertion Sort - Ascending GPA):");
        topStudents.insertionSort();
        topStudents.print();
    }
}