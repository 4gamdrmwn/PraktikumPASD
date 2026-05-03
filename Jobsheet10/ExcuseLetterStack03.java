package Jobsheet10;

public class ExcuseLetterStack03 {
    ExcuseLetter03[] stack;
    int size;
    int top;

    public ExcuseLetterStack03(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter03[size];
    }

    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == size - 1; }

    public void push(ExcuseLetter03 letter) {
        if (!isFull()) {
            stack[++top] = letter;
            System.out.println("Excuse letter from " + letter.name + " submitted.");
        } else {
            System.out.println("Stack capacity reached!");
        }
    }

    public ExcuseLetter03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        System.out.println("No excuse letter found.");
        return null;
    }

    public ExcuseLetter03 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        System.out.println("Stack is empty.");
        return null;
    }

    // Penambahan fungsionalitas menu no 4
    public void search(String searchName) {
        boolean isFound = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(searchName)) {
                System.out.println("Letter found at position " + (top - i + 1) + " from top.");
                System.out.println("ID: " + stack[i].id + " | Name: " + stack[i].name + " | Type: " + stack[i].typeOfExcuse);
                isFound = true;
                break; // Stop at first match from top
            }
        }
        if (!isFound) {
            System.out.println("No letter found under the name: " + searchName);
        }
    }
}