package Jobsheet14;

public class BinaryTreeArray14 {
    Student14[] data;
    int idxLast;

    public BinaryTreeArray14() {
        data = new Student14[10];
        idxLast = -1;
    }

    void populateData(Student14[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    // Assignment 4: insert data into array-based BST
    void add(Student14 data) {
        idxLast++;
        if (idxLast >= this.data.length) {
            System.out.println("Array is full!");
            idxLast--;
            return;
        }
        this.data[idxLast] = data;
    }

    // Assignment 4: pre-order traversal
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                data[idxStart].print();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}