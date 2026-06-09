package cmcm;

public class Buyer {
    String Name;
    String MobileNumber;

    public Buyer(String b, String c) {
        this.Name = b;
        this.MobileNumber = c;
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