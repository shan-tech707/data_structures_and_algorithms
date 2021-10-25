package mcs_3E.DSA.BinarySearchTreee.UsingArray;

import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("\n//-----------Menu--------------// ");
        System.out.println("Press 1 to insert the data ");
        System.out.println("Press 2 to display All Indexes Data ");
        System.out.println("Press 3 For In Order ");
        System.out.println("Press 4 For Pre Order ");
        System.out.println("Press 5 For Post Order ");
        System.out.println("Press 6 to find Minimum ");
        System.out.println("Press 7 to find Maximum ");
        System.out.println("Press 8 to update ");
        System.out.println("Press 9 to Search the Index of Value ");
        System.out.println("Press 10 to remove value ");
        System.out.println("Press 11 to Exit");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Tree tree=new Tree();
        int choice,value;
        do{
            menu();
            System.out.print("Enter Your Choice: ");
            choice=input.nextInt();
            if (choice == 1) {
                System.out.print("Enter Value: ");
                value = input.nextInt();
                tree.insert(value);
            }
            else if (choice==2){
                tree.indexOfData();
            }
            else if (choice==3){
                System.out.print("In Order: \t");
                tree.inOrder(tree.arr,0);
            }
            else if (choice==4){
                System.out.print("Pre Order: \t");
                tree.preOrder(tree.arr,0);
            }
            else if (choice==5){
                System.out.print("Post Order: \t");
                tree.postOrder(tree.arr,0);
            }
            else if (choice==6){
                tree.findMinimum();
            }
            else if (choice==7){
                tree.findMaximum();
            }
            else if (choice==8){
                System.out.print("Enter Value: ");
                value = input.nextInt();
                tree.update(value);
            }

            else if (choice==9){
                System.out.print("Enter Value: ");
                value = input.nextInt();
                System.out.println("Index of the value = "+tree.indexSearch(value));
            }

            else if (choice==10){
                System.out.print("Enter Value: ");
                value = input.nextInt();
                tree.remove(value);
            }

            else if (choice<1 || choice>11){
                System.out.print("Invalid Choice!");
            }
        }while (choice!=11);
    }

}

