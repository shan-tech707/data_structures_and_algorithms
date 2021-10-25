package mcs_3E.DSA.MidTermExamPaper.QuestionNO_1;

import java.util.Scanner;

public class MyMainClass {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to insert data at End ");
        System.out.println("Press 2 to insert Before last Node ");
        System.out.println("Press 3 to Highest Salary Employees ");
        System.out.println("Press 4 to Delete Node at Position ");
        System.out.println("Press 5 to update salary ");
        System.out.println("Press 6 to display data ");
        System.out.println("Press 7 to exit ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;
        int id,salary,age,pos;
        Scanner input=new Scanner(System.in);
        LinkedList lst=new LinkedList();
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter the Id= ");
                id=input.nextInt();
                System.out.print("Enter the Name= ");
                name=input.next();
                System.out.print("Enter the Salary= ");
                salary=input.nextInt();
                System.out.print("Enter the Age= ");
                age=input.nextInt();
                lst.insertAtEnd(id,name,salary,age);
            }
            if(choice==2){
                System.out.print("Enter the Id= ");
                id=input.nextInt();
                System.out.print("Enter the Name= ");
                name=input.next();
                System.out.print("Enter the Salary= ");
                salary=input.nextInt();
                System.out.print("Enter the Age= ");
                age=input.nextInt();
                lst.insertBeforeLastNode(id,name,salary,age);
            }
            if(choice==3){
                lst.highestSalary();
            }
            if(choice==4){
                lst.display();
                System.out.print("Enter the Position of Node you want to delete= ");
                pos=input.nextInt();
                lst.deleteNodeAtPosition(pos);
            }
            if(choice==5){
                System.out.print("Enter the id of Person Update Salary= ");
                id=input.nextInt();
                lst.updateSalary(id);
            }
            if(choice==6){
                lst.display();
            }
            if(choice<1 || choice>7) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }

        }while(choice!=7);
    }
}

