package mcs_3E.DSA.FinalTermExamPaper.Question2;

import java.util.Scanner;

public class LinkedList {
    Node head;
    Scanner input=new Scanner(System.in);

    String p="Professor";
    String AP="Assistant Professor";
    String Lec="Lecturer";

    public void insertAtEnd(){
        // memory
        Node newNode=new Node();
        // store
        System.out.print("Enter the Id= ");
        newNode.id=input.nextInt();
        System.out.print("Enter the Name= ");
        newNode.designation=input.next();
        System.out.print("Enter the Salary= ");
        newNode.salary=input.nextInt();
        // Next to u
        newNode.next=null;

        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void insertAtStart(){
        Node newNode=new Node();
        System.out.print("Enter the Id= ");
        newNode.id=input.nextInt();
        System.out.print("Enter the Name= ");
        newNode.designation=input.next();
        System.out.print("Enter the Salary= ");
        newNode.salary=input.nextInt();
        // for start
        newNode.next=head;
        head=newNode;
    }

    public void insertAfter(){
        Node newNode=new Node();
        System.out.print("Enter the Id = ");
        newNode.id=input.nextInt();
        System.out.print("Enter the Name = ");
        newNode.designation=input.next();
        System.out.print("Enter the Salary = ");
        newNode.salary=input.nextInt();
        // Old note
        Node temp1;
        Node temp2;
        // Enter the Id after which you wanna insert data
        if(head==null){
            System.out.println("No Record Entered Yet,");
        }
        else{
            boolean check=true;
            System.out.print("Enter the Id After Which You wanna insert Data= ");
            int idd=input.nextInt();
            Node temp=head;
            while(temp!=null){
                if(temp.id==idd){
                    System.out.println("Id= "+temp.id);
                    System.out.println("Name = "+temp.designation);
                    System.out.println("Salary= "+temp.salary);
                    temp1=temp;
                    temp2=temp1.next;
                    temp1.next=newNode;
                    newNode.next=temp2;

                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found!.");
            }
        }
    }

    public void insertRecord(int id,String dsg,int salary,String gender){
        String before;
        Node newNode=new Node();
        newNode.id=id;
        newNode.designation=dsg;
        newNode.salary=salary;
        newNode.gender=gender;
        // Old note
        Node temp1;
        Node temp2;
        // Enter the Id after which you wanna insert data
        if(head==null){
            head=newNode;
        }
        else{
            boolean check=true;
            if(newNode.designation.equals(p))
            {
                before=AP;
                Node temp=head;
                if(temp.designation.equals(before))
                {
                    temp1=temp;
                    temp=newNode;
                    temp.next=temp1;
                }
                else if(temp.next.designation.equals(before)){
                    temp1=temp.next;
                    temp.next=newNode;
                    temp.next.next=temp1;
                }
                else {
                    while(!temp.next.next.designation.equals(before)) {
                        temp=temp.next;
                    }
                    temp1=temp.next.next;
                    temp.next.next=newNode;
                    temp.next.next.next=temp1;
                    check=false;
                }
                if(check){
                    System.out.println("No Record Found!.");
                }
            }
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No record to display ");
        }
        else{
            Node temp=head;
            System.out.println("Inserted Records Are: ");
            while(temp!=null){
                //temp=temp.next;
                System.out.println("Id= "+temp.id);
                System.out.println("Name = "+temp.designation);
                System.out.println("Salary= "+temp.salary);
                temp=temp.next;
            }
        }
    }

    public void search(){
        if(head==null){
            System.out.println("No Record Entered Yet,");
        }
        else{
            boolean check=true;
            System.out.print("Enter Emp id you want to search:");
            int idd=input.nextInt();
            Node temp=head;
            while(temp!=null){
                if(temp.id==idd){
                    System.out.println("Id= "+temp.id);
                    System.out.println("Name = "+temp.designation);
                    System.out.println("Salary= "+temp.salary);
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found!.");
            }
        }
    }

    public void update(){
        if(head==null){
            System.out.println("There is No Record ");
        }else{
            Node temp=head;
            System.out.print("Enter the id of the Employee to Update= ");
            int eid=input.nextInt();
            boolean check=true;
            while(temp!=null){
                if(temp.id==eid){
                    System.out.print("Enter id = ");
                    temp.id=input.nextInt();
                    System.out.print("Enter name = ");
                    temp.designation=input.next();
                    System.out.print("Enter salary = ");
                    temp.salary=input.nextInt();
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record match to update.");
            }
        }
    }

    public void deleteAtStart(){
        if(head==null){
            System.out.println("There is No Record!");
        }else{
            Node temp=head;
            head=head.next;
            temp.next=null;
            System.out.println(" Id = "+temp.id);
            System.out.println(" Name = "+temp.designation);
            System.out.println(" Salary = "+temp.salary);
        }
    }

    public void deleteAtLast(){
        if(head==null){
            System.out.println("There is No Record ");
        }else if(head.next==null){
//            Node temp=head;
            head=null;
//            temp.next=null;
        }else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void removeValue(){
        Node p,q,tmp;
        if (head==null)
        {
            System.out.println("Link_List not created");
        }
        else {
            p=head;
            System.out.println("Enter the id to delete the record");
            int eid=input.nextInt();
            while(p!=null)
            {
                if(head.id==eid)
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
                        if(tmp.id==eid)
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

}
