package mcs_3E.DSA.DSA_LABs;

import mcs_3E.DSA.LinkedList.SimpleLinkedList.LinkedList;

import java.util.Scanner;

public class Test {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to insert data at End ");
        System.out.println("Press 2 to insert at Start ");
        System.out.println("Press 3 to insert After ");
        System.out.println("Press 4 to insert Before ");
        System.out.println("Press 5 to display data ");
        System.out.println("Press 6 to search the record of employee ");
        System.out.println("Press 7 to update the Record");
        System.out.println("Press 8 to delete the value At Start");
        System.out.println("Press 9 to delete the value At End");
        System.out.println("Press 10 to remove the value  ");
        System.out.println("Press 11 to exit ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String newData,oldData;
        Scanner s=new Scanner(System.in);
        LinkListClass lst=new LinkListClass();
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=s.nextInt();
            if(choice==1){
                System.out.print("Enter the Name= ");
                newData=s.next();
                lst.insertAtEnd(newData);
            }
            if(choice==2){
                System.out.print("Enter the Name= ");
                newData=s.next();
                lst.insertAtStart(newData);
            }
            if(choice==3){
                System.out.print("Enter the Name After which you want to insert= ");
                oldData=s.next();
                System.out.print("Enter the Name= ");
                newData=s.next();
                lst.insertAfter(oldData,newData);
            }
            if(choice==4){
                System.out.print("Enter the Name After which you want to insert= ");
                oldData=s.next();
                System.out.print("Enter the Name= ");
                newData=s.next();
                lst.insertBefore(oldData,newData);
            }
            if(choice==5){
                lst.display();
            }
            if(choice==6){
                System.out.print("Enter the Name you want to search= ");
                oldData=s.next();
                lst.search(oldData);
            }
            if(choice==7){
                System.out.print("Enter the data you want to update= ");
                oldData=s.next();
                System.out.print("Enter the Name= ");
                newData=s.next();
                lst.update(oldData,newData);
            }
            if(choice==8){
                lst.deleteAtStart();
            }
            if(choice==9){
                lst.deleteAtLast();
            }
            if(choice==10){
                System.out.print("Enter the Name you want to delete= ");
                oldData=s.next();
                lst.delete(oldData);
            }
            if(choice<1 || choice>11) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }

        }while(choice!=11);
    }
}
