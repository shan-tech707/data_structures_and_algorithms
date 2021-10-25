package mcs_3E.DSA.BinarySearchTreee.UsingLinkedList;

import java.util.Scanner;

public class BSTMain {

    static void menu(){
        System.out.println("\n//-----------Menu--------------// ");
        System.out.println("Press 1 For Tree Insertion ");
        System.out.println("Press 2 For Deletion ");
        System.out.println("Press 3 For Minimum Value ");
        System.out.println("Press 4 For Maximum Value ");
        System.out.println("Press 5 for Display In-Order(L, root, R) ");
        System.out.println("Press 6 for Display Pre-Order(root, L, R) ");
        System.out.println("Press 7 for Display Post-Order(L, R, root) ");
        System.out.println("Press 8 for Search ");
        System.out.println("Press 9 for Sum of All the Nodes ");
        System.out.println("Press 10 for Average of All the Nodes ");
        System.out.println("Press 11 for Count Number of Nodes ");
        System.out.println("Press 12 for Exit ");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Binary_Tree tree=new Binary_Tree();
        int value,size,choice;
        do{
            menu();
            System.out.print("Enter Your choice: ");
            choice=input.nextInt();
            if (choice == 1) {
                System.out.print("How many values you want to input: ");
                size = input.nextInt();
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter Value: ");
                    value = input.nextInt();
                    tree.insert(value);
                }
            } else if (choice == 2) {
                System.out.print("Enter Value for Delete: ");
                value = input.nextInt();
                tree.Remove(value);
            }else if (choice == 3) {
                tree.findMinimum();
            } else if (choice == 4) {
                tree.findMaximum();
            } else if (choice == 5) {
                System.out.print("In Order: \t");
                tree.inOrder(tree.root);
            } else if (choice == 6) {
                System.out.print("Pre Order: \t");
                tree.preOrder(tree.root);
            } else if (choice == 7) {
                System.out.print("Post Order: \t");
                tree.postOrder(tree.root);
            } else if (choice == 8) {
                System.out.print("Enter Value for Search: \t");
                value = input.nextInt();
                tree.search(value);
            }
            else if (choice==9) {
                tree.sum(tree.root);
            }
            else if (choice==10) {
                tree.average(tree.root);
            }
            else if (choice==11) {
                tree.count(tree.root);
            }
            else if (choice<1 || choice>12) {
                System.out.println("Invalid Choice!");
            }
        }while(choice!=12);
    }

}
