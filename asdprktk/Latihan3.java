package asdprktk;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();

        Queue Q = new Queue(kapasitas);

        System.out.println("Is Queue Full? " + Q.IsFull());

        Q.Enqueue(101);

        Q.peek();
    }
}