package Jobsheet10;

import java.util.Scanner;

public class ExcuseMain03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack03 stack = new ExcuseLetterStack03(10);
        int choice;

        do {
            System.out.println("\n--- Excuse Letter System ---");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit");
            System.out.print("Select menu: ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("ID: "); String id = scan.nextLine();
                    System.out.print("Name: "); String name = scan.nextLine();
                    System.out.print("Class: "); String className = scan.nextLine();
                    System.out.print("Type (S/I): "); char type = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Duration (days): "); int duration = scan.nextInt();
                    stack.push(new ExcuseLetter03(id, name, className, type, duration));
                    break;
                case 2:
                    ExcuseLetter03 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter for: " + processed.name + " (" + processed.typeOfExcuse + ")");
                    }
                    break;
                case 3:
                    ExcuseLetter03 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest letter is from: " + latest.name);
                    }
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scan.nextLine();
                    stack.search(searchName);
                    break;
            }
        } while (choice != 0);
        scan.close();
    }
}