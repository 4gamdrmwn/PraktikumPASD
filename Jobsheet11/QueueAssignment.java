package Jobsheet11;

public class QueueAssignment {
    Student[] data;
    int front, rear, size, max;
    int processed = 0;
    int totalInput = 0;

    public QueueAssignment(int n){
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

    void clear(){
        front = rear = -1;
        size = 0;
        System.out.println("Queue cleared");
    }

    void enqueue(Student dt){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
            totalInput++;
        }
    }

    void dequeue2(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        if(processed >= 30){
            System.out.println("DPA quota is full (30 students)");
            return;
        }

        int count = 0;

        while(!isEmpty() && count < 2 && processed < 30){
            Student dt = data[front];
            System.out.print("Approved: ");
            dt.print();

            front = (front + 1) % max;
            size--;
            processed++;
            count++;
        }

        if(size == 0){
            front = rear = -1;
        }
    }

    void peek(){
        if(!isEmpty()){
            data[front].print();
        }else{
            System.out.println("Queue is empty");
        }
    }

    void peek2(){
        if(size == 0){
            System.out.println("Queue is empty");
        }else if(size == 1){
            data[front].print();
        }else{
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    void print(){
        if(!isEmpty()){
            int i = front;
            while(true){
                data[i].print();
                if(i == rear) break;
                i = (i + 1) % max;
            }
        }else{
            System.out.println("Queue is empty");
        }
    }

    void size(){
        System.out.println("Queue size: " + size);
    }

    void viewRear(){
        if(!isEmpty()){
            data[rear].print();
        }else{
            System.out.println("Queue is empty");
        }
    }

    void printProcessed(){
        System.out.println("Processed students: " + processed);
    }

    void printRemaining(){
        System.out.println("Not yet approved: " + (totalInput - processed));
    }
}