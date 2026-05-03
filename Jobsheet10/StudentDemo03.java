package Jobsheet10;

import java.util.Scanner;

public class StudentDemo03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentAssignmentStack03 stack = new StudentAssignmentStack03(5);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    
                    Student03 std = new Student03(nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", std.name);
                    break;

                case 2:
                    Student03 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                        
                        // Eksekusi fungsi convertToBinary (Experiment 2)
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student03 view = stack.peek();
                    if (view != null) {
                        System.out.println("The last assignment comes from " + view.name);
                    }
                    break;

                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("NIM\tName\tClass Name");
                    stack.print();
                    break;

                default:
                    if (choice != 0) { // Memberikan opsi exit tersembunyi dengan angka 0
                        System.out.println("Invalid choice.");
                    }
            }
        } while (choice >= 1 && choice <= 4);
        
        scan.close();
    }
}