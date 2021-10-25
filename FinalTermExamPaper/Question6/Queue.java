package mcs_3E.DSA.FinalTermExamPaper.Question6;

public class Queue {
    Store front, rear;
    public Queue() {
        this.front = this.rear = null;
    }
    void collect(String name,String dTitle,String uni,int year) {
        Store temp = new Store(name,dTitle,uni,year);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void verified() {
        if (this.front == null)
            return;
        Store temp = this.front;
        this.front = this.front.next;
        System.out.println("//------Verified-----//");
        System.out.println("Name: "+temp.name);
        if (this.front == null)
            this.rear = null;
    }
}
