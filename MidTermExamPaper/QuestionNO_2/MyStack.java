package mcs_3E.DSA.MidTermExamPaper.QuestionNO_2;

import java.util.Scanner;

public class MyStack
{
    static int index;
    public int productId;
    public String productTitle;
    public float productPrice;
    static MyStack[] itemList=new MyStack[50];
    public void push(int productId,String productTitle,float productPrice) {
        itemList[index].productId=productId;
        itemList[index].productTitle=productTitle;
        itemList[index].productPrice=productPrice;
    }
    public void display() {
            System.out.println("Product Id= " + productId);
            System.out.println("Product Id= " + productTitle);
            System.out.println("Product Id= " + productPrice);
    }
    public void pop() {
        System.out.println("Product Id= "+productId+
                "\nProduct Id= "+productTitle+
                "\nProduct Id= "+productPrice);
        System.out.println("Deleted Successfully!");
    }
    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Store Product ");
        System.out.println("Press 2 to Print All records ");
        System.out.println("Press 3 to Remove Top Record ");
        System.out.println("Press 4 to exit ");
    }

    public static void main(String[] args)
    {
        int choice;
        int productId;
        String productTitle;
        float productPrice;
        index=0;
        Scanner input = new Scanner(System.in);
        do {
            menu();
            System.out.print("Enter your Choice= ");
            choice = input.nextInt();
            if (choice==1) {
                System.out.print("Enter Product id= ");
                productId = input.nextInt();
                System.out.print("Enter Name= ");
                productTitle = input.next();
                System.out.print("Enter Price= ");
                productPrice = input.nextFloat();
                itemList[index]=new MyStack();
                itemList[index].push(productId,productTitle,productPrice);
                index++;
            }
            if (choice==2) {
                if(index>=0) {
                    for (int i = 0; i < index; i++) {
                        itemList[i].display();
                    }
                }else
                    System.out.println("Stack is Empty");
            }
            if (choice==3) {
                if(index>=0) {
                    for (int i = 0; i <=index; i++) {
                        if (i == index) {
                            itemList[index] = new MyStack();
                            itemList[(index-1)].pop();
                        }
                    }
                }
                index--;
            }
            if(choice<1 || choice>4){
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        } while (choice!=4);
    }
}
