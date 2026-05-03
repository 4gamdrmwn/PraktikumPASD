package Jobsheet10;

public class StudentAssignmentStack03 {
    Student03[] stack;
    int top, size;

    public StudentAssignmentStack03(int size) {
        this.size = size;
        top = -1;
        stack = new Student03[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Student03 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    public Student03 pop() {
        if (!isEmpty()) {
            Student03 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    public Student03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }

    // Method tambahan dari Experiment 2
    public String convertToBinary(int grade) {
        ConversionStack03 stackBinary = new ConversionStack03();
        while (grade > 0) {
            int mod = grade % 2;
            stackBinary.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stackBinary.isEmpty()) {
            binary += stackBinary.pop();
        }
        return binary;
    }
}