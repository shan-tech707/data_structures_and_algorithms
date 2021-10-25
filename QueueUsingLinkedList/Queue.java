package mcs_3E.DSA.QueueUsingLinkedList;

public class Queue {
    QNode front,rear;

    public Queue() {
        // TODO Auto-generated constructor stub
        front=null;
        rear = null;
    }

    void enqueue(int k){
        QNode temp = new QNode(k);
        if(rear==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        rear=temp;
    }

    void dequeued(){
        if(this.front==null){
            return;
        }
        this.front=this.front.next;
        if(this.front==null){
            this.rear=null;
        }
    }

    void display(){
        QNode temp=front;
        while(temp!=null){
            System.out.print(""+temp.key+"   ");
            temp=temp.next;
        }
        System.out.println("\n");
    }

}
