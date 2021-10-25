package mcs_3E.DSA.FinalTermExamPaper.Question4;

import java.util.Scanner;

public class Messages {

    public String[] storageArray,bufferArray;
    public int Q_F,Q_R,storage=2,cache=5, Q_F1,Q_R1;

    public Messages(){
        storageArray=new String[storage];
        bufferArray=new String[cache];
        Q_F1=0;
        Q_R1=0;
        Q_F=0;
        Q_R=0;
    }

    public int isStorageFull() {
        if(Q_R==5) {
            return 1;

        }else {
            return 0;
        }
    }

    public int isBufferFull() {
        if(Q_R1==10) {
            return 1;
        }else {
            return 0;
        }
    }

    public void EnQueue(String j) {
        if(isStorageFull()==1) {
            System.out.println("Storage Queue Overflows");
            if(isBufferFull()==1) {
                System.out.println("Cache Queue Overflows");
            }else {
                bufferArray[Q_R1++]=j;
            }
        }else {
            storageArray[Q_R++]=j;
        }
    }

    public void DeQueue() {
        if(isEmpty_Storage()==1) {
            System.out.println("Storage Queue Underflow\n");
        }
        else{
            if(isStorageFull()==1) {
                String temp=storageArray[Q_F];
                storageArray[Q_F]=bufferArray[Q_F1];
                bufferArray[Q_F1]=bufferArray[Q_F1++];
                System.out.println("The Message is being deleted from Storage \t"+temp);
            }
        }
    }

    public int isEmpty_Storage() {
        if(Q_R==-1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void show_Storage() {
        System.out.println("Messages in Mobile Storage Are \n");
        for(int i=0;i<Q_R;i++) {
            System.out.println(storageArray[i]);
        }
    }

    public void show_Cache() {
        System.out.println("Messages in Cache Storage Are \n");
        for(int i=0;i<Q_R1;i++) {
            System.out.println(bufferArray[i]);
        }
    }

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Insert Message  ");
        System.out.println("Press 2 to Show Storage Messages ");
        System.out.println("Press 3 to Show Buffer Messages ");
        System.out.println("Press 4 to delete message from phone memory ");
        System.out.println("Press 5 to Exit");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        String msg;
        Messages lst=new Messages();
        int choice;
        do {
            menu();
            System.out.print("Enter your Choice= ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter a Message= ");
                input.nextLine();
                msg = input.nextLine();
                lst.EnQueue(msg);
            }
            if (choice == 2) {
                lst.show_Storage();
            }
            if (choice == 3) {
                lst.show_Cache();
            }
            if (choice == 4) {
                lst.DeQueue();
            }
            if (choice<0 || choice>5) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        } while (choice!=5);
    }
}
