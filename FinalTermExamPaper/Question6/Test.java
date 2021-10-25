package mcs_3E.DSA.FinalTermExamPaper.Question6;

import java.util.Scanner;

public class Test {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Collect Degrees ");
        System.out.println("Press 2 to Remove ");
        System.out.println("Press 3 to exit ");
    }

    public static void main(String[] args) {
        Queue obj=new Queue();
        Scanner input=new Scanner(System.in);
        String name,dTitle,uni;
        int year,choice;
        do {
            menu();
            System.out.print("Enter your Choice= ");
            choice = input.nextInt();
            if(choice==1){
                for(int i=0; i<3;i++){
                    System.out.print("Enter Name: ");
                    name=input.next();
                    System.out.print("Enter Degree: ");
                    dTitle=input.next();
                    System.out.print("Enter University: ");
                    uni=input.next();
                    System.out.print("Enter Year: ");
                    year=input.nextInt();
                    obj.collect(name,dTitle,uni,year);
                }
            }
            else if(choice==2) {
                obj.verified();
            }
        }while (choice!=6);
    }
}