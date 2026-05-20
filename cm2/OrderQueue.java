package cm2;

public class OrderQueue {
    QueueNode head;
    QueueNode tail;
    OrderNode orderHead;
    OrderNode orderTail;
    int size = 0;

    public void enqueue(int queueNumber, Buyer buyer) {
        QueueNode newNode = new QueueNode(queueNumber, buyer);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public QueueNode dequeue() {
        if (head == null) {
            return null;
        }
        QueueNode temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return temp;
    }

    public void printQueue() {
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=");
        System.out.println("No Antrian\tNama\tNo HP");

        QueueNode current = head;
        while (current != null) {
            System.out.println(current.queueNumber + "\t" + current.buyer.Name + "\t" + current.buyer.MobileNumber);
            current = current.next;
        }
        System.out.println();
    }

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);
        if (orderHead == null) {
            orderHead = orderTail = newNode;
        } else {
            orderTail.next = newNode;
            newNode.prev = orderTail;
            orderTail = newNode;
        }
    }

    private void sortByName() {
        if (orderHead == null || orderHead.next == null) {
            return;
        }

        OrderNode current = orderHead.next;
        while (current != null) {
            OrderNode nextNode = current.next;
            Order key = current.order;
            OrderNode search = current.prev;

            while (search != null && search.order.OrderName.compareToIgnoreCase(key.OrderName) > 0) {
                search.next.order = search.order;
                search = search.prev;
            }

            if (search == null) {
                orderHead.order = key;
            } else {
                search.next.order = key;
            }
            current = nextNode;
        }
    }

    public void printReport() {
        sortByName();

        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s\t%-20s\t%-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        OrderNode current = orderHead;
        while (current != null) {
            System.out.printf("%-15d\t%-20s\t%-15d\n", 
                current.order.OrderCode, 
                current.order.OrderName, 
                current.order.price);
            current = current.next;
        }
        System.out.println();
    }
}

class QueueNode {
    int queueNumber;
    Buyer buyer;
    QueueNode prev;
    QueueNode next;

    public QueueNode(int queueNumber, Buyer buyer) {
        this.queueNumber = queueNumber;
        this.buyer = buyer;
    }
}

class OrderNode {
    Order order;
    OrderNode prev;
    OrderNode next;

    public OrderNode(Order order) {
        this.order = order;
    }
}
