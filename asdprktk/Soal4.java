package asdprktk;

class NodeDouble {
    String genre;
    NodeDouble next;
    NodeDouble prev;

    NodeDouble(String genre) {
        this.genre = genre;
        this.next = null;
        this.prev = null;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        NodeDouble rock = new NodeDouble("Rock");
        NodeDouble jazz = new NodeDouble("Jazz");
        NodeDouble pop = new NodeDouble("Pop");

        rock.next = jazz;
        jazz.next = pop;

        jazz.prev = rock;
        pop.prev = jazz;

        NodeDouble tail = pop;

        System.out.print("Riwayat lagu dari terakhir diputar: ");
        NodeDouble current = tail;
        while (current != null) {
            System.out.print(current.genre);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev; 
        }
        System.out.println();
    }
}