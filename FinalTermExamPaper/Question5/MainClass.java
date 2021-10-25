package mcs_3E.DSA.FinalTermExamPaper.Question5;

import java.util.Scanner;

public class MainClass {
    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to insert");
        System.out.println("Press 2 to Display ");
        System.out.println("Press 3 to Remove ");
        System.out.println("Press 4 to Remove by Name ");
        System.out.println("Press 5 to exit ");
    }

    public static void main(String[] args) {
        LinkListFun obj=new LinkListFun();
        Scanner input=new Scanner(System.in);
        Node emp;
        String name,cNIC,design,pNo;
        int salary;
        int choice;
        do {
            menu();
            System.out.print("Enter your Choice= ");
            choice = input.nextInt();
            if(choice==1){
                System.out.print("Enter Name: ");
                name=input.next();
//                System.out.print("Enter CNIC: ");
//                cNIC=input.next();
//                System.out.print("Enter Design: ");
//                design=input.next();
//                System.out.print("Enter pNo: ");
//                pNo=input.next();
//                System.out.print("Enter Salary: ");
//                salary=input.nextInt();
//                emp=new Node(name,"02389","Assistant",1200,"123499");
//                obj.insertionSort(emp);
                obj.insertRecord(name,"02389","Assistant",1200,"123499");

            }
            else if(choice==2){
                obj.display();
            }
            else if(choice==3) {
                obj.deleteAtLast();
            }
            else if(choice==4){
                System.out.print("Enter Name: ");
                name=input.next();
                obj.removeValue(name);
            }
            else if(choice==5){

            }
        }while (choice!=6);
    }
}
