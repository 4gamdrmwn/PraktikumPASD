package Jobsheet11;

import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(5);

        int choose;
        do{
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("6. Check rear of the queue");
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
                    Student data = queue.dequeue();
                    if(data != null){
                        data.print();
                    }
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

            }
        }while(choose != 0);
    }
}