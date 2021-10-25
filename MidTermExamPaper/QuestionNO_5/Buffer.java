package mcs_3E.DSA.MidTermExamPaper.QuestionNO_5;

import java.util.Scanner;

public class Buffer {
    String[] messages;
    int size;
    int front,back;
    static Scanner input= new Scanner(System.in);
    public Buffer() {
        System.out.print("Enter the size of buffer : ");
        size = input.nextInt();
        messages = new String[size];
        front = 0;
        back = -1;
    }
    public void enqueue(String msg) {
        if (back == size-1) {
            System.out.println("buffer is overflow! ");
        }
        else {
            back++;
            messages[back]=msg;
        }
    }
    public String dequeue() {
        if (back == -1 ) {
            System.out.println("buffer is under flow! ");
            return null;
        }
        else {
            String n=messages[0];
            int i=0;
            while (i<back) {
                messages[i]=messages[i+1];
                i++;
            }
            back--;
            return n;
        }
    }
    public void display() {
        if (back == -1) {
            System.out.println("There is no message to display! ");
        }
        else {
            for (int i=0;i<=back;i++) {
                System.out.print(messages[i]+"\t");
            }
        }
    }
    public static void menu(){
        System.out.println("\n//-----------------Menu----------//");
        System.out.println("Enter 1 to EnQueue the message : ");
        System.out.println("Enter 2 to DeQueue the message : ");
        System.out.println("Enter 3 to Display all the messages : ");
        System.out.println("Enter 4 to Exit  ");
    }

    public static void main(String[] args) {
        String msg;
        Buffer lst = new Buffer();
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1) {
                System.out.println("Enter a number to EnQueue in the buffer :");
                input.nextLine();
                msg=input.nextLine();
                lst.enqueue(msg);
            }
            if (choice==2) {
                msg=lst.dequeue();
                if (msg != null) {
                    System.out.println("The DeQueue message is :"+msg);
                }
            }
            if (choice==3) {
                lst.display();
            }
        } while(choice != 4);
    }
}