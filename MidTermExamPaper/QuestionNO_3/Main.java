package mcs_3E.DSA.MidTermExamPaper.QuestionNO_3;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Store Applicant's Data ");
        System.out.println("Press 2 to Print Top Application record ");
        System.out.println("Press 3 to Print All records ");
        System.out.println("Press 4 to Remove Top Record ");
        System.out.println("Press 5 to exit ");
    }

    public static void main(String[] args)
    {
        int age;
        String name,address, discipline,contactNo;
        Scanner input=new Scanner(System.in);
        LinkedList lst = new LinkedList();
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter the Name= ");
                name=input.next();
                System.out.print("Enter the Age= ");
                age=input.nextInt();
                System.out.print("Enter the Discipline= ");
                discipline=input.next();
                System.out.print("Enter the ContactNo= ");
                contactNo=input.next();
                System.out.print("Enter the Address(city)= ");
                address=input.next();
                lst.push(name,age,discipline,contactNo,address);
            }
            if(choice==2){
                System.out.print(lst.peek());
            }
            if(choice==3){
                lst.display();
            }
            if(choice==4){
                lst.pop();
            }
            if(choice<1 || choice>5) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        }while(choice!=5);
    }
}

