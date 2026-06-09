package asdprktk;

class NodeLagu {
    String judul;
    NodeLagu next;

    NodeLagu(String judul) {
        this.judul = judul;
        this.next = null;
    }
}

public class Soal3 {
    public static void main(String[] args) {
        NodeLagu head = new NodeLagu("LaguA");
        head.next = new NodeLagu("LaguB");
        head.next.next = new NodeLagu("LaguC");

        NodeLagu current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        current.next = null;

        System.out.print("Isi playlist yang tersisa: ");
        NodeLagu temp = head;
        while (temp != null) {
            System.out.print(temp.judul);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}