package Jobsheet12;

import java.util.Scanner;

public class QueueMainAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueueAssignment sq = new StudentQueueAssignment();
        int menu;

        do {
            System.out.println("\n== Student Service Queue ==");
            System.out.println("1. Enqueue (Register)");
            System.out.println("2. Dequeue (Call)");
            System.out.println("3. Peek Front & Rear");
            System.out.println("4. Check Total Size");
            System.out.println("5. Clear Queue");
            System.out.println("6. Exit");
            System.out.print("Select menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    StudentAssignment std = new StudentAssignment(nim, name);
                    sq.enqueue(std);
                    break;
                case 2:
                    sq.dequeue();
                    break;
                case 3:
                    sq.peek();
                    break;
                case 4:
                    sq.displaySize();
                    break;
                case 5:
                    sq.clear();
                    break;
            }
        } while (menu != 6);
    }
}