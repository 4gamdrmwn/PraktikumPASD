package asdprktk;
class NodeSkor {
    int nilai;
    NodeSkor next;

    NodeSkor(int nilai) {
        this.nilai = nilai;
        this.next = null;
    }
}

public class Soal5 {
    public static void main(String[] args) {
        NodeSkor head = new NodeSkor(80);
        head.next = new NodeSkor(95);
        head.next.next = new NodeSkor(75);

        int skorMaksimum = head.nilai;
        
        NodeSkor current = head.next; 

        while (current != null) {
            if (current.nilai > skorMaksimum) {
                skorMaksimum = current.nilai; 
            }
            current = current.next; 
        }
        System.out.println("Skor paling tinggi (Maksimum) adalah: " + skorMaksimum);
    }
}