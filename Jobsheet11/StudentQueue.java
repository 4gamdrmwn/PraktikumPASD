package Jobsheet11;

public class StudentQueue {
    Student[] data;
    int front, rear, size, max;

    public StudentQueue(int n){
        max = n;
        data = new Student[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == max;
    }

    void enqueue(Student dt){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    Student dequeue(){
        Student dt = null;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            dt = data[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }

    void peek(){
        if(!isEmpty()){
            data[front].print();
        }else{
            System.out.println("Queue is empty");
        }
    }

    void print(){
        if(!isEmpty()){
            int i = front;
            while(i != rear){
                data[i].print();
                i = (i+1)%max;
            }
            data[i].print();
        }else{
            System.out.println("Queue is empty");
        }
    }

    void size(){
        System.out.println(size);
    }
    void viewRear(){
    if(!isEmpty()){
        data[rear].print();
    }else{
        System.out.println("Queue is empty");
    }
    }
}