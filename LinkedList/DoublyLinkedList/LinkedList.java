package mcs_3E.DSA.LinkedList.DoublyLinkedList;

import java.util.*;
public class LinkedList {
    Node head;

    public void insert(){

        Scanner sc=new Scanner(System.in);
        Node n=new Node();
        System.out.println("enter the value");
        n.data=sc.nextInt();
        n.next=null;
        if(head==null){

            head=n;
            n.prev=null;
        }else{
            Node temp=head;
            while(temp.next!=null){

                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
        }

    }

    public void display(){
        if(head==null){
            System.out.println("there is no data to display ");
        }else{
            Node temp=head;

            while(temp!=null){
                System.out.println("data  = "+temp.data);
                temp=temp.next;

            }

        }


    }
    public void search(){
        Scanner s=new Scanner(System.in);
        if(head==null){
            System.out.println("there is no value in the list");
        }else{
            boolean isFound=false;
            Node temp=head;
            System.out.println("Enter the value to search");
            int v=s.nextInt();

            while(temp!=null){
                if(temp.data==v){
                    System.out.print("value is = "+temp.data);
                    isFound=true;
                }
                temp=temp.next;
            }
            if(isFound==false){
                System.out.print("No such value found");
            }
        }
    }
}
