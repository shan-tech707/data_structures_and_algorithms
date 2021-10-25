package mcs_3E.DSA.FinalTermExamPaper.Question5;


public class LinkListFun {

    Node head,newNode,temp,sorted;
    void insertRecord(String name,String cNIC,String design,int salary,String pNo){
        newNode=new Node(name,cNIC,design,salary,pNo);
        newNode.next=head;
        head=newNode;
        insertionSort(head);
    }

    void insertionSort(Node headR){
        sorted=null;
        Node current=headR;
        while (current != null) {
            Node next=current.next;
            setSortedInserted(current);
            current=next;
        }
        head=sorted;
    }

    void setSortedInserted(Node newN){
        if((sorted==null) || (sorted.name.compareTo(newN.name)>=0)){
            newN.next=sorted;
            sorted=newN;
        }
        else {
            Node current=sorted;
            while ((current.next!=null) && (current.next.name.compareTo(newN.name)<0)){
                current=current.next;
            }
            newN.next=current.next;
            current.next=newN;

        }
    }

    public void deleteAtLast(){
        if(head==null){
            System.out.println("There is No Record ");
        }else if(head.next==null){
            head=null;
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void removeValue(String name){
        Node p,q,tmp;
        if (head==null)
        {
            System.out.println("Link_List not created");
        }
        else {
            p=head;

            while(p!=null)
            {
                if(head.name.equals(name))
                {
                    head=head.next;
                    break;
                }
                else
                {
                    q=head;
                    tmp=head.next;
                    while(tmp!=null)
                    {
                        if(tmp.name.equals(name))
                        {
                            q.next= tmp.next;
                            tmp=tmp.next;
                        }
                        else
                        {
                            tmp=tmp.next;
                            q=q.next;
                        }
                    }
                }
                p=p.next;
            }
        }
    }

    public void highestSalary(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            boolean check=true;
            System.out.println("Employee who has Highest Salary");
            Node temp=head;
            while(temp!=null){
                if(temp.salary>20000 && temp.salary<40000){
                    System.out.println("Name = "+temp.name);
                    System.out.println("CNIC = "+temp.cNIC);
                    System.out.println("Designation = "+temp.designation);
                    System.out.println("Salary= "+temp.salary);
                    System.out.println("Phone No = "+temp.pNo);
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found!.");
            }
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No record to display ");
        }
        else{
            temp=head;
            System.out.println("Inserted Records Are: ");
            while(temp!=null){
                //temp=temp.next;
                System.out.println("Name = "+temp.name);
//                System.out.println("Salary = "+temp.salary);
//                System.out.println("Designation = "+temp.designation);
                temp=temp.next;
            }
        }
    }
}
