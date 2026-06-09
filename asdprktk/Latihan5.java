package asdprktk;

public class Latihan5 {
    public static void main(String[] args) {

        Queue Q = new Queue(5);
        Stack S = new Stack(5);

        Q.Enqueue(1);
        Q.Enqueue(2);
        Q.Enqueue(3);

        while (!Q.IsEmpty()) {
            int data = Q.Dequeue();
            S.push(data);
        }

        System.out.println("Top Stack = " + S.peek());
    }
}