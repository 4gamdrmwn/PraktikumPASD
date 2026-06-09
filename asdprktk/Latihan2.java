package asdprktk;

public class Latihan2 {
    public static void main(String[] args) {

        Queue Q = new Queue(5);

        Q.Enqueue(100);
        Q.Enqueue(200);
        Q.Enqueue(300);

        System.out.println("Isi Queue:");
        Q.print();
    }
}