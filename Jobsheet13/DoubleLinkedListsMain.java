package Jobsheet13;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        System.out.println("--- Experiment 1 ---");
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();

        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();

        System.out.println("--- Experiment 2 ---");
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}