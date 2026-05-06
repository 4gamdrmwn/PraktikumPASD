package Jobsheet11;

import java.util.Scanner;

public class QueueAssignmentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAssignment queue = new QueueAssignment(10);

        int choose;
        do{
            System.out.println("1. Enqueue Student");
            System.out.println("2. Process KRS (2 Students)");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. Display Rear");
            System.out.println("7. Display First Two");
            System.out.println("8. Clear Queue");
            System.out.println("9. Processed Students");
            System.out.println("10. Remaining Students");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choose = sc.nextInt();
            sc.nextLine();

            switch(choose){
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class : ");
                    String className = sc.nextLine();

                    Student s = new Student(nim, name, studyProgram, className);
                    queue.enqueue(s);
                    break;

                case 2:
                    queue.dequeue2();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.print();
                    break;

                case 5:
                    queue.size();
                    break;

                case 6:
                    queue.viewRear();
                    break;

                case 7:
                    queue.peek2();
                    break;

                case 8:
                    queue.clear();
                    break;

                case 9:
                    queue.printProcessed();
                    break;

                case 10:
                    queue.printRemaining();
                    break;

            }
        }while(choose != 0);
    }
}