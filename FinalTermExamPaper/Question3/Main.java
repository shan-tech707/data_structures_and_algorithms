package mcs_3E.DSA.FinalTermExamPaper.Question3;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Store Product ");
        System.out.println("Press 2 to Print All Product ");
        System.out.println("Press 3 to Remove Top Product ");
        System.out.println("Press 4 to exit ");
    }

    public static void main(String[] args) {
        MyStock pro=new MyStock();
        Scanner input=new Scanner(System.in);
        int choice,id;
        String title;
        float price;

        do {
            menu();
            System.out.print("Enter your Choice= ");
            choice = input.nextInt();
            if(choice==1){
                System.out.print("Enter Product ID: ");
                id=input.nextInt();
                System.out.print("Enter Title: ");
                title=input.next();
                System.out.print("Enter Price: ");
                price=input.nextFloat();
                pro.enterProduct(id,title,price);
            }
            else if(choice==2){
                pro.display();
            }
            else if(choice==3) {
                pro.removeProduct();
            }
        }while (choice!=4);
    }
}
