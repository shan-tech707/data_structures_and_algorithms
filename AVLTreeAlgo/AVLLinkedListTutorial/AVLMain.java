package mcs_3E.DSA.AVLTreeAlgo.AVLLinkedListTutorial;

import java.util.Scanner;

public class AVLMain {

    static void menu(){
        System.out.println("\n//==========MENU========//");
        System.out.println("For insertion       : Press 1 ");
        System.out.println("For inOrder         : Press 2");
        System.out.println("For preOrder        : Press 3");
        System.out.println("For postOrder       : Press 4");
        System.out.println("For Deletion        : Press 5");
        System.out.println("For Minimum Value   : Press 6");
        System.out.println("For Maximum Value   : Press 7");
        System.out.println("For Exit            : Press 8");
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AVL avl=new AVL();
        int choice,value;
        do{
            menu();
            System.out.print("Enter your Choice: ");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter the Value: ");
                value=input.nextInt();
                avl.add(value);
            }
            else if(choice==2){
                System.out.println("Inorder: ");
                avl.inOrder(avl.root);
            }
            else if(choice==3){
                System.out.println("Inorder: ");
                avl.preOrder(avl.root);
            }
            else if(choice==4){
                System.out.println("Inorder: ");
                avl.postOrder(avl.root);
            }
            else if(choice==5){
                System.out.print("Enter the value to Delete: ");
                value=input.nextInt();
                avl.deleteNode(avl.root,value);
            }
            else if(choice==6){
                Node n=avl.minValueNode(avl.root);
                System.out.println("Minimum Value:  "+n.key);
            }
            else if(choice==7){
                Node n=avl.maxValueNode(avl.root);
                System.out.println("Minimum Value:  "+n.key);
            }
            else if(choice<1 || choice>8){
                System.out.println("Invalid Choice");
            }
        }while (choice!=8);
    }
}
