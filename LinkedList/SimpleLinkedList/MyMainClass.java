package mcs_3E.DSA.LinkedList.SimpleLinkedList;

import java.util.Scanner;

public class MyMainClass {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to insert data at End ");
        System.out.println("Press 2 to insert at Start ");
        System.out.println("Press 3 to insert After ");
        System.out.println("Press 4 to display data ");
        System.out.println("Press 5 to search the record of employee ");
        System.out.println("Press 6 to update the Record");
        System.out.println("Press 7 to delete the value At Start");
        System.out.println("Press 8 to delete the value At End");
        System.out.println("Press 9 to remove the value  ");
        System.out.println("Press 10 to exit ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        LinkedList lst=new LinkedList();
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=s.nextInt();
            if(choice==1){
                lst.insertAtEnd();
            }
            if(choice==2){
                lst.insertAtStart();
            }
            if(choice==3){
                lst.insertAfter();
            }
            if(choice==4){
                lst.display();
            }
            if(choice==5){
                lst.search();
            }
            if(choice==6){
                lst.update();
            }
            if(choice==7){
                lst.deleteAtStart();
            }
            if(choice==8){
                lst.deleteAtLast();
            }
            if(choice==9){
                lst.removeValue();
            }
            if(choice<1 || choice>10) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }

        }while(choice!=10);

    }


}

