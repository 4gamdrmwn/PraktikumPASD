package cmcm;

public class BuyerQueue {
    QueueNode head;
    QueueNode tail;
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
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.println("No Antrian\tNama\tNo HP");
        
        QueueNode current = head;
        while (current != null) {
            System.out.println(current.queueNumber + "\t" + current.buyer.Name + "\t" + current.buyer.MobileNumber);
            current = current.next;
        }
        System.out.println();
    }
    public QueueNode removeByQueueNumber(int queueNumber) {
        if (head == null) {
        return null;
        }
        QueueNode current = head;
        while (current != null) {
        if (current.queueNumber == queueNumber) {
            // if node pertama
            if (current == head) {
                head = head.next;

                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null;
                }
                }

            // if node terakhir
            else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
                }

            // if di tengah
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                }

            size--;
            return current;
            }

        current = current.next;
    }

    return null;
}
}