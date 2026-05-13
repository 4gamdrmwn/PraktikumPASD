package Jobsheet12;

public class StudentQueueAssignment {
    NodeAssignment head;
    NodeAssignment tail;
    int size = 0;

    boolean isEmpty() {
        return (head == null);
    }

    void enqueue(StudentAssignment std) {
        NodeAssignment newNode = new NodeAssignment(std, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
        } else if (head == tail) {
            System.out.println("Calling: " + head.data.name);
            head = tail = null;
            size--;
        } else {
            System.out.println("Calling: " + head.data.name);
            head = head.next;
            size--;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.print("Front Student: ");
            head.data.print();
            System.out.print("Rear Student: ");
            tail.data.print();
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void displaySize() {
        System.out.println("Total students in queue: " + size);
    }

    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Queue cleared!!");
    }
}