package impl_queue_using_circularLinkedList;

public class MyQueue implements Solution{
    Node front;
    Node rear;

    @Override
    public void enQueue(int data) {
        if (front == null){
            front = rear = new Node(data);
        }else {
            rear.link = new Node(data);
            rear = rear.link;
            rear.link = front;
        }
    }

    @Override
    public void deQueue() {
        if (front == null){
            System.out.println("Queue is empty!");
        } else if (front == rear) {
            front = rear = null;
        }else {
        front= front.link;
        rear.link = front;
        }
    }

    @Override
    public void displayQueue() {
        if (front == null){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(front.data);
        Node temp = front.link;
        while (temp != front){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
