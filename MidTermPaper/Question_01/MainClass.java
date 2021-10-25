package mcs_3E.DSA.MidTermPaper.Question_01;

import java.util.Scanner;

public class MainClass {

    public static void menu(){
        System.out.println("//---------------Main Menu-------------//");
        System.out.println("Press 1 to add the record ");
        System.out.println("Press 2 to Count the record ");
        System.out.println("Press 3 to remove the record ");
        System.out.println("Press 4 for Max Paid");
        System.out.println("Press 5 to exit");
    }
    public static void main(String[] args) {
        MyClass emp=new MyClass();
        int choice;
        Scanner input=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1){
                Employee e=new Employee();
                System.out.println("Enter Id");
                e.id=input.nextInt();
                e.name="ali";
                System.out.println("Enter Salary");
                e.salary=input.nextInt();
                e.department="HR";
                e.gender='M';
                emp.add(e);
            }
            if(choice==2){
                int count=emp.count();
                System.out.println(count);
            }
            if(choice==3){
                System.out.println("Enter Id");
                int id=input.nextInt();
                emp.remove(id);
            }
            if(choice==4){
                Employee em=emp.maxPaid();
                System.out.println(em.id);
            }
            if(choice==6){
                emp.display();
            }
        }
        while (choice!=5);
    }
}
