package mcs_3E.DSA.Arrays;

import java.util.Scanner;

public class integerArray {
    static int index;
    static void insertAtEnd(int[] Arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value : ");
        Arr[index]=sc.nextInt();
    }
    static void insertAtStart(int[] Arr){
        Scanner sc=new Scanner(System.in);
        int i=index;
        while (i>0) {
            Arr[i]=Arr[i-1];
            i--;
        }
        System.out.println("Enter the Value : ");
        Arr[0]=sc.nextInt();
        index++;
    }
    static void display(int[] Arr){
        for(int i=0 ; i<index;i++){
            System.out.printf("value at %d = %d \n",i,Arr[i]);
        }
    }
    static void menu(){
        System.out.println("Press 1 to add the record at End ");
        System.out.println("Press 2 to add the record at Start ");
        System.out.println("Press 3 to display the record ");
        System.out.println("Press 4 to exit");
    }
    public static void main(String[] args) {
        int [] intArray=new int[10];
        int choice;
        index=0;
        Scanner s=new Scanner(System.in);
        do{
            menu();
            choice=s.nextInt();
            if(choice==1){
                insertAtEnd(intArray);
                index++;
            }
            if(choice==2){
                insertAtStart(intArray);
            }
            if(choice==3){
                display(intArray);
            }
        }while(choice!=4);
    }
}
