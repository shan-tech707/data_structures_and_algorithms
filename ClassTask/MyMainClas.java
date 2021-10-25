package mcs_3E.DSA.ClassTask;

import java.util.Scanner;

public class MyMainClas {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to create account");
        System.out.println("Press 2 to display account detail ");
        System.out.println("Press 3 to deposit ");
        System.out.println("Press 4 to withdraw ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name;
        int accountNo;
        float amount_Deposit,amount_WithDraw;
        LinkedLis lst=new LinkedLis();
        Scanner input=new Scanner(System.in);
        int choice;
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter the Name= ");
                name=input.next();
                System.out.print("Enter the Account number= ");
                accountNo=input.nextInt();
                System.out.print("Enter the initial amount= ");
                amount_Deposit=input.nextFloat();
                lst.createAccount(name,accountNo,amount_Deposit);
            }
            if(choice==2){
                lst.display();
            }
            if(choice==3){
                System.out.print("Enter the Account No= ");
                accountNo=input.nextInt();
                System.out.print("Enter the amount to deposit= ");
                amount_Deposit=input.nextFloat();
                lst.deposit(accountNo,amount_Deposit);
            }
            if(choice==4){
                System.out.print("Enter the Account No= ");
                accountNo=input.nextInt();
                System.out.print("Enter the amount to withdraw ");
                amount_WithDraw=input.nextFloat();
                lst.withdraw(accountNo,amount_WithDraw);
            }
            if(choice<1 || choice>5) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        }while(choice!=5);
    }
}

