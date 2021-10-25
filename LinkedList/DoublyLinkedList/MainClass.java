package mcs_3E.DSA.LinkedList.DoublyLinkedList;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        int choice;
        LinkedList lst=new LinkedList();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("press 1 to insert the data ");
            System.out.println("press 2 to display the data ");
            System.out.println("press 3 to search the data ");
            System.out.println("press 4 to update the data ");
            System.out.println("press 5 to exit");
            choice=sc.nextInt();

            if(choice==1){
                lst.insert();
            }
            if(choice==2){
                lst.display();
            }
            if(choice==3){
                lst.search();
            }
        }while(choice!=5);
    }
}

