package mcs_3E.DSA.QueueUsingLinkedList;

public class MyMain {
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue q1=new Queue();
        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(17);
        q.enqueue(19);
        q.enqueue(21);
        q.dequeued();

        q1.enqueue(10);
        q1.enqueue(14);
        q1.enqueue(18);
        q1.enqueue(22);
        q1.dequeued();
        q.display();
        q1.display();
    }
}