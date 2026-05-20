package cm2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderQueue orderQueue = new OrderQueue();
        
        int currentQueueNum = 1;

        orderQueue.enqueue(currentQueueNum++, new Buyer("Ainra", "08224500000"));
        orderQueue.enqueue(currentQueueNum++, new Buyer("Danra", "08224511111"));
        orderQueue.enqueue(currentQueueNum++, new Buyer("Sanri", "08224522222"));

        while (true) {
            System.out.println("=========================================");
            System.out.println("ROYAL DELISH QUEUE SYSTEM");
            System.out.println("=========================================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Order Report");
            System.out.println("0. Exit");
            System.out.print("Select menu : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Buyer Name : ");
                String name = sc.nextLine();
                System.out.print("No HP      : ");
                String phone = sc.nextLine();
                
                orderQueue.enqueue(currentQueueNum, new Buyer(name, phone));
                System.out.println("Antrian berhasil ditambahkan dengan nomor: " + currentQueueNum);
                currentQueueNum++;
                System.out.println();

            } else if (menu == 2) {
                if (orderQueue.size == 0) {
                    System.out.println("Antrian kosong.\n");
                } else {
                    orderQueue.printQueue();
                }

            } else if (menu == 3) {
                QueueNode served = orderQueue.dequeue();
                if (served == null) {
                    System.out.println("Tidak ada antrian yang bisa diproses.\n");
                } else {
                    System.out.print("Order Code : ");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Order Name : ");
                    String orderName = sc.nextLine();
                    System.out.print("Price      : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    orderQueue.addOrder(new Order(code, orderName, price));
                    System.out.println(served.buyer.Name + " telah memesan " + orderName);
                    System.out.println();
                }

            } else if (menu == 4) {
                if (orderQueue.orderHead == null) {
                    System.out.println("Belum ada data pesanan.\n");
                } else {
                    orderQueue.printReport();
                }

            } else if (menu == 0) {
                break;
            } else {
                System.out.println("Menu tidak valid.\n");
            }
        }
        sc.close();
    }
}