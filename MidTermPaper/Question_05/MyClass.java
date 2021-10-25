package mcs_3E.DSA.MidTermPaper.Question_05;

public class MyClass {
    Car head;

    // a)
    public void insert(Car c){
        if(head==null){
            head=c;
            c.prev=null;
        }else{
            Car temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=c;
            c.prev=temp;
        }
    }
    // b)
    public void search(){
        if(head==null){
            System.out.println("List is Empty");
        }else{
            Car temp=head;
            while(temp!=null){
                if(temp.model>1990 && temp.model<2021){
                    System.out.print("Model= "+temp.model);
                    System.out.print("Company= "+temp.company);
                    System.out.print("Price=  "+temp.price);
                    System.out.print("Color= "+temp.color);
                }
                temp=temp.next;
            }
        }
    }

    // c)
    public void DeleteFromStart(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Car temp=head;
            temp=temp.next;
            temp.prev=null;
        }
    }

    // d)
    public void DeleteThirdNode(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else {
            Car temp=head;
            Car temp1=head;
            int i=1;
            while (temp!=null){
                if(i==3){
                    temp=temp.next;
                    temp.prev=temp1.prev;
                }
                temp1=temp1.next;
                temp=temp.next;
            }
        }
    }
//
//    //display() will print out the nodes of the list
//    public void display() {
//        //Node current will point to head
//        Car current = head;
//        if(head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//        while(current != null) {
//            //Prints each node by incrementing the pointer.
//            System.out.print(current.model + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }

}
