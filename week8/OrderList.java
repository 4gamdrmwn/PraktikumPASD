package week8;

class Order {
    int OrderCode;
    String OrderName;
    int price;

    public Order(int a, String b, int d) {
        this.OrderCode = a;
        this.OrderName = b;
        this.price = d;
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

public class OrderList {
    OrderNode head;
    OrderNode tail;

    public void addOrder(Order order) {
        OrderNode newNode = new OrderNode(order);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByName() {
        if (head == null || head.next == null) {
            return;
        }

        OrderNode current = head.next;
        while (current != null) {
            OrderNode nextNode = current.next;
            Order key = current.order;
            OrderNode search = current.prev;

            while (search != null && search.order.OrderName.compareToIgnoreCase(key.OrderName) > 0) {
                search.next.order = search.order;
                search = search.prev;
            }

            if (search == null) {
                head.order = key;
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

        OrderNode current = head;
        while (current != null) {
            System.out.printf("%-15d\t%-20s\t%-15d\n", 
                current.order.OrderCode, 
                current.order.OrderName, 
                current.order.price);
            current = current.next;
        }
            System.out.println("========================================");
            System.out.println("Total Price : " + getTotalPrice());
            System.out.println();
    }
        public int getTotalPrice() {
            int total = 0;
            OrderNode current = head;
            while (current != null) {
                total += current.order.price;
                current = current.next;
            }
            return total;
        }
}