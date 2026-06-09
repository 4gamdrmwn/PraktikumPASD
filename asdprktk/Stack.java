package asdprktk;

public class Stack {
    int[] data;
    int top;
    int max;

    public Stack(int n) {
        max = n;
        data = new int[max];
        top = -1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == max - 1;
    }

    public void push(int dt) {
        if (IsFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            data[top] = dt;
        }
    }

    public int peek() {
        return data[top];
    }
}