package mcs_3E.DSA.TasksDSAClass;

import java.util.Scanner;

public class LinkedList {
    Node head;
    int Pos=1;
    Scanner input=new Scanner(System.in);

    public void insertAtEnd(int id,String name,int salary,int age){
        Node newNode=new Node();
        newNode.id=id;
        newNode.name=name;
        newNode.price=salary;
        newNode.position=+Pos;
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
        Pos++;
    }

    public void insertBeforeLastNode(int id,String name,int salary,int age){
        Node newNode=new Node();
        Node temp,t;
        newNode.id=id;
        newNode.name=name;
        newNode.price=salary;
        newNode.position=+Pos;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }
        else{
            temp=head;
            if(temp.next==null){
                t=temp;
                head=newNode;
            }else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                t = temp.next;
                newNode.position=temp.next.position;
                temp.next = newNode;
            }
            newNode.next=t;
            newNode.next.position++;
        }
        Pos++;
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
                if(temp.price>20000){
                    System.out.println("Id= "+temp.id);
                    System.out.println("Name = "+temp.name);
                    System.out.println("Salary= "+temp.price);
                    System.out.println("Salary= "+temp.qty);
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found!.");
            }
        }
    }

    public void getPrice(String name){
        if(head==null){
            System.out.println("There is No Record ");
        }else{
            Node temp=head;
            boolean check=true;
            while(temp!=null){
                if(temp.name.equals(name)){
                    System.out.print("Price of the item = "+temp.price);
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record match to update.");
            }
        }
    }

    public void deleteNodeAtPosition(int position) {
        Node temp;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            temp=head;
            while (true){
                if(temp.position==position){
                    head = temp.next;
                    break;
                }
                else if(temp.next.position==position)
                {
                    temp.next = temp.next.next;
                    break;
                }
                temp=temp.next;
            }
            temp=head;
            int i=1;
            while (temp!=null){
                temp.position=i;
                temp=temp.next;
                i++;
            }
            Pos--;
        }
    }

    public void updateSalary(int id){
        if(head==null){
            System.out.println("There is No Record ");
        }else{
            Node temp=head;
            boolean check=true;
            while(temp!=null){
                if(temp.id==id){
                    System.out.print("Update the Salary = ");
                    temp.price=input.nextInt();
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record match to update.");
            }
        }
    }

    public void display(){
        int i=1;
        if(head==null){
            System.out.println("No record to display ");
        }
        else{
            Node temp=head;
            System.out.println("Inserted Records Are: ");
            while(temp!=null){
                System.out.println("Record= "+ i );
                System.out.print(" Id= "+temp.id);
                System.out.print("\t|| Name = "+temp.name);
                System.out.print("\t|| Salary= "+temp.price);
                System.out.println("\t|| Position= "+temp.position);
                temp=temp.next;
                i++;
            }
        }
    }

}
