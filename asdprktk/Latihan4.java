package asdprktk;

public class Latihan4 {
    public static void main(String[] args) {

        Queue Q = new Queue(5);

        Q.Enqueue(101);
        Q.Enqueue(102);
        Q.Enqueue(103);

        Q.Dequeue();
        Q.Dequeue();
        Q.Dequeue();

        System.out.println("Nilai front = " + Q.front);
        System.out.println("Nilai rear = " + Q.rear);
    }
}