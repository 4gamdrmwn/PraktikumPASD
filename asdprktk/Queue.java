package asdprktk;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear++;
            }

            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;

        if (IsEmpty()) {
            System.out.println("Queue kosong");
        } else {
            dt = data[front];
            size--;

            if (IsEmpty()) {
                front = rear = -1;
            } else {
                front++;
            }
        }

        return dt;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue kosong");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }

            System.out.println();
            System.out.println("Jumlah elemen = " + size);
        }
    }
}