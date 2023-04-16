package impl_queue_using_circularLinkedList;

public class Test {
    public static void main(String[] args) {
        MyQueue myIntQueue = new MyQueue();
        myIntQueue.enQueue(1);
        myIntQueue.enQueue(2);
        myIntQueue.enQueue(3);
        myIntQueue.enQueue(4);
        myIntQueue.enQueue(5);
        myIntQueue.enQueue(6);
        System.out.println("Init display");
        myIntQueue.displayQueue();
        System.out.println("Dequeue 2 times:");
        myIntQueue.deQueue();
        myIntQueue.deQueue();
        myIntQueue.displayQueue();
        System.out.println("Dequeue 5 times");
        myIntQueue.deQueue();
        myIntQueue.deQueue();
        myIntQueue.deQueue();
        myIntQueue.deQueue();
        myIntQueue.deQueue();
    }
}
