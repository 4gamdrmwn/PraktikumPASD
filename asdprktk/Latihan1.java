package asdprktk;

public class Latihan1 {
    public static void main(String[] args) {

        Queue Q = new Queue(5);

        Q.Enqueue(15);
        Q.Enqueue(30);

        System.out.println("Isi Queue:");
        Q.print();
    }
}