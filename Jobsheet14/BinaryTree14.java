package Jobsheet14;

public class BinaryTree14 {
    Node14 root;

    public BinaryTree14() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student14 data) {
        if (isEmpty()) {
            root = new Node14(data);
        } else {
            Node14 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node14(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node14(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    // Assignment 1: recursive add
    public void addRekursif(Student14 data) {
        root = addRekursif(root, data);
    }

    private Node14 addRekursif(Node14 current, Student14 data) {
        if (current == null) {
            return new Node14(data);
        }
        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    // Assignment 2: lowest IPK (leftmost node)
    public void getMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node14 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Student with lowest IPK: ");
        current.data.print();
    }

    // Assignment 2: highest IPK (rightmost node)
    public void getMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node14 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Student with highest IPK: ");
        current.data.print();
    }

    // Assignment 3: display students with IPK above a threshold
    public void displayStudentsWithIPKAbove(double threshold) {
        System.out.println("Students with IPK above " + threshold + ":");
        displayStudentsWithIPKAbove(root, threshold);
    }

    private void displayStudentsWithIPKAbove(Node14 node, double threshold) {
        if (node != null) {
            displayStudentsWithIPKAbove(node.left, threshold);
            if (node.data.ipk > threshold) {
                node.data.print();
            }
            displayStudentsWithIPKAbove(node.right, threshold);
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node14 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node14 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node14 getSuccessor(Node14 del) {
        Node14 successor = del.right;
        Node14 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }
        // delete node with no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) { // delete node with a left child
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) { // delete node with a right child
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else { // delete node with 2 children
            Node14 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
}