package asdprktk;
class GerbongNode {
    String kode;
    GerbongNode next;

    GerbongNode(String kode) {
        this.kode = kode;
        this.next = null;
    }
}

public class Soal1 {
    public static void main(String[] args) {
        
        GerbongNode head = new GerbongNode("A");
        head.next = new GerbongNode("B");
        head.next.next = new GerbongNode("C");

        int totalGerbong = 0;
        GerbongNode current = head;
        
        while (current != null) {
            totalGerbong++;
            current = current.next; 
        }
        System.out.println("Total jumlah gerbong dalam rangkaian: " + totalGerbong);
    }
}