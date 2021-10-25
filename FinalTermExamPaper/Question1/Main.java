package mcs_3E.DSA.FinalTermExamPaper.Question1;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("//----Main Menu-----//");
        System.out.println("Undo:       Press 1 ");
        System.out.println("Add:        Press 2 ");
        System.out.println("Save/Exit:  Press 3 ");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        stack obj = new stack();
        int choice;
        String msg;
        do{
            menu();
            System.out.print("Enter your Choice: ");
            choice=input.nextInt();
            if(choice==1){
                obj.pop();
            }
            else if(choice==2){
                System.out.print("Add Sentence: ");
                input.nextLine();
                msg=" ";
                msg+=input.nextLine();
                for(int i=0; i<msg.length();i++){
                    obj.push(msg.charAt(i));
                }
            }
        }while (choice!=3);
    }
}

