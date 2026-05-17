package Jobsheet13;

public class Node {
    Student data;
    Node prev;
    Node next;

    Node() {
    }

    Node(Student data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node(Node prev, Student data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}