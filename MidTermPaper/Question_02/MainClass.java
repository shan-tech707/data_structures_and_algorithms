package mcs_3E.DSA.MidTermPaper.Question_02;

import java.util.Scanner;

public class MainClass {
    public static void menu(){
        System.out.println("//---------------Main Menu-------------//");
        System.out.println("Press 1 to Add Result of Candidates ");
        System.out.println("Press 2 to Search by Roll_Num ");
        System.out.println("Press 3 to Check Passed Candidates ");
        System.out.println("Press 4 to exit");
    }

    public static void main(String[] args) {
        MyFunctions std=new MyFunctions();
        int choice;
        Scanner input=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1){
                Result r=new Result();
                System.out.print("Enter Roll No: ");
                r.roll_num=input.nextInt();
                System.out.print("Enter Marks: ");
                r.marks=input.nextInt();
                std.add(r);
            }
            if(choice==2){
                System.out.print("Enter Roll No: ");
                int roll_num=input.nextInt();
                Result s=std.search(roll_num);
                System.out.println("Roll No: "+s.roll_num);
                System.out.println("Marks: "+s.marks);
            }
            if(choice==3){
                std.passedCandidate();
            }
        }
        while (choice!=4);
    }
}
