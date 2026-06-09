package cmcm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuyerQueue queueSystem = new BuyerQueue();
        OrderList orderSystem = new OrderList();
        
        int currentQueueNum = 1;

        // Memasukkan data awal langsung via constructor sesuai instruksi note jobsheet
        queueSystem.enqueue(currentQueueNum++, new Buyer("Ainra", "08224500000"));
        queueSystem.enqueue(currentQueueNum++, new Buyer("Danra", "08224511111"));
        queueSystem.enqueue(currentQueueNum++, new Buyer("Sanri", "08224522222"));

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
                
                queueSystem.enqueue(currentQueueNum, new Buyer(name, phone));
                System.out.println("Antrian berhasil ditambahkan dengan nomor: " + currentQueueNum);
                currentQueueNum++;
                System.out.println();

            } else if (menu == 2) {
                if (queueSystem.size == 0) {
                    System.out.println("Antrian kosong.\n");
                } else {
                    queueSystem.printQueue();
                }

            } else if (menu == 3) {
                if (queueSystem.size == 0) {
                    System.out.println("Tidak ada antrian yang bisa diproses.\n");
                } else {
                    System.out.print("Masukkan nomor antrian yang diproses : ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    QueueNode served = queueSystem.removeByQueueNumber(nomor);

                if (served == null) {
                    System.out.println("Nomor antrian tidak ditemukan.\n");
                } else {
                    System.out.print("Order Code : ");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Order Name : ");
                    String orderName = sc.nextLine();
                    System.out.print("Price      : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    orderSystem.addOrder(new Order(code, orderName, price));
                    System.out.println(served.buyer.Name + " telah memesan " + orderName);
                    System.out.println();
                    }
                  }
            } else if (menu == 4) {
                if (orderSystem.head == null) {
                    System.out.println("Belum ada data pesanan.\n");
                } else {
                    orderSystem.printReport();
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