package mcs_3E.DSA.TasksDSAClass;

import java.util.Scanner;

public class MyMainClass {

    public static void menu(){
        System.out.println("\n//-----------------Menu----------//");
        System.out.println("Press 1 to Insert Data at End ");
        System.out.println("Press 2 to Insert Before last Node ");
        System.out.println("Press 4 to Delete Node at Position ");
        System.out.println("Press 5 to Update Price ");
        System.out.println("Press 6 to Display All Data ");
        System.out.println("Press 7 to Display Price ");
        System.out.println("Press 8 to Exit ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;
        int id,price,qty,pos;
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
                System.out.print("Enter the Price= ");
                price=input.nextInt();
                System.out.print("Enter the Qty= ");
                qty=input.nextInt();
                lst.insertAtEnd(id,name,price,qty);
            }

            if(choice==2){
                System.out.print("Enter the Id= ");
                id=input.nextInt();
                System.out.print("Enter the Name= ");
                name=input.next();
                System.out.print("Enter the Salary= ");
                price=input.nextInt();
                System.out.print("Enter the Age= ");
                qty=input.nextInt();
                lst.insertBeforeLastNode(id,name,price,qty);
            }

            if(choice==3){
                lst.display();
                System.out.print("Enter the Position of Node you want to delete= ");
                pos=input.nextInt();
                lst.deleteNodeAtPosition(pos);
            }

            if(choice==4){
                System.out.print("Enter the id of Person Update Price= ");
                id=input.nextInt();
                lst.updateSalary(id);
            }

            if(choice==5){
                lst.display();
            }

            if(choice==6){
                System.out.println("Enter the Name= ");
                name=input.next();
                lst.getPrice(name);
            }

            if(choice<1 || choice>6){
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }

        }while(choice!=6);
    }
}

