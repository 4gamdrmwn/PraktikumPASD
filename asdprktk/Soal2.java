package asdprktk;

class NodeKereta {
    String kode;
    NodeKereta next;

    NodeKereta(String kode) {
        this.kode = kode;
        this.next = null;
    }
}

public class Soal2 {
    public static void main(String[] args) {
        NodeKereta head = new NodeKereta("B");
        head.next = new NodeKereta("C");

        NodeKereta gerbongBaru = new NodeKereta("A");
        
        gerbongBaru.next = head; 
        head = gerbongBaru; 
        System.out.print("Isi rangkaian gerbong saat ini: ");
        NodeKereta current = head;
        while (current != null) {
            System.out.print(current.kode);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}