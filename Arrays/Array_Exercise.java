package mcs_3E.DSA.Arrays;

import java.util.Scanner;

public class Array_Exercise {
    static int index;
    int num;
    Scanner input=new Scanner(System.in);
    public void insertAtEnd(){
        System.out.print("Enter the Value : ");
        num=input.nextInt();
    }
    public void insertAtStart(Array_Exercise[] arr){
        int i=index;
        while (i>0) {
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=new Array_Exercise();
        System.out.print("Enter Value at First index: ");
        arr[0].num=input.nextInt();
        index++;
    }
    public void insertBefore(Array_Exercise[] arr,int existing_Value,int new_Value){
        for(int i=0;i<index;i++){
            if(arr[i].num==existing_Value){
                int j=index;
                while (j>=i) {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[i]=new Array_Exercise();
                arr[i].num=new_Value;
                break;
            }
        }
        index++;
    }
    public void insertAfter(Array_Exercise[] arr,int existing_Value,int new_Value){
        for(int i=0;i<index;i++){
            if(arr[i].num==existing_Value){
                int j=index;
                while (j>=i+1) {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[i+1]=new Array_Exercise();
                arr[i+1].num=new_Value;
                break;
            }
        }
        index++;
    }
    public void insertAtIndex(Array_Exercise[] arr,int index_No,int value){
        int i = index;
        while (i >= index_No) {
            arr[i+1] = arr[i];
            i--;
        }
        arr[index_No]=new Array_Exercise();
        arr[index_No].num=value;
        index++;
    }
    public void insertBeforeIndex(Array_Exercise[] arr,int index_No,int value){
        int i = index;
        while (i >= index_No-1) {
            arr[i+1] = arr[i];
            i--;
        }
        arr[index_No-1]=new Array_Exercise();
        arr[index_No-1].num=value;
        index++;
    }
    public void insertAfterIndex(Array_Exercise[] arr,int index_No,int value){
       int i = index;
       while (i >= index_No + 1) {
            arr[i + 1] = arr[i];
           i--;
       }
       arr[index_No+1]=new Array_Exercise();
        arr[index_No+1].num=value;
        index++;
    }
    public void updateRecord(Array_Exercise[] arr,int old_Value,int new_Value){
        int searched=0;
        for(int i=0;i<index;i++){
            if(arr[i].num==old_Value){
                searched=i;
                break;
            }
        }
        arr[searched]=new Array_Exercise();
        arr[searched].num=new_Value;
    }
    public void search(Array_Exercise[] arr){
        System.out.print("Enter the Value to search : ");
        int searchNo=input.nextInt();
        boolean check=true;
        for(int i=0;i<index;i++){
            if(arr[i].num==searchNo){
                System.out.println("Record found at index: "+(i));
                check=false;
                //searched=i;
                break;
            }
        }
        if(check){
            System.out.println("No record found");
        }
    }
    public void delete(Array_Exercise[] arr){
        System.out.print("Enter the Value to delete: ");
        int num_ToDelete=input.nextInt();
        for(int i=0;i<index;i++){
            if(arr[i].num==num_ToDelete){
                int j=i;
                while (j<index-1) {
                    arr[j]=arr[j+1];
                    j++;
                }
                index--;
                System.out.println("First Found Record deleted successfully");
                break;
            }
        }

    }
    public void display(){
        System.out.println(num);
    }
    public static void menu(){
        System.out.println("------------Menu------------");
        System.out.print("Press 1 to add the record at End \t");
        System.out.println("||  \tPress 7 to insert At index ");
        System.out.print("Press 2 to add the record at Start \t");
        System.out.println("||  \tPress 8 to insert Before the Index ");
        System.out.print("Press 3 to display the Values \t\t");
        System.out.println("||  \tPress 9 to insert After the Index ");
        System.out.print("Press 4 to insert before value \t\t");
        System.out.println("||  \tPress 10 to search the Value ");
        System.out.print("Press 5 to insert After the Value \t");
        System.out.println("||  \tPress 11 to delete the Value ");
        System.out.print("Press 6 to update the Value \t\t");
        System.out.println("||  \tPress 12 to exit");
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Array_Exercise [] intArray=new Array_Exercise[10];
        Array_Exercise arr=new Array_Exercise();
        int choice,index_No,new_Value,old_Value;
        index=0;
        Scanner input=new Scanner(System.in);
        do{
            menu();
            choice=input.nextInt();
            if (choice == 1) {
                intArray[index] = new Array_Exercise();
                intArray[index].insertAtEnd();
                index++;
            }
            if (choice == 2) {
                arr.insertAtStart(intArray);
            }
            if (choice == 3) {
                System.out.println("-----------Display----------");
                for (int i = 0; i < index; i++) {
                    System.out.print("Value at Index " + i + " = ");
                    intArray[i].display();
                }
                System.out.println("----------------------------");
            }
            if (choice == 4) {
                System.out.print("Enter old Value: ");
                int existing_Value=input.nextInt();
                System.out.print("Enter New Value: ");
                new_Value=input.nextInt();
                arr.insertBefore(intArray,existing_Value,new_Value);
            }
            if(choice == 5){
                System.out.print("Enter old Value: ");
                int existing_Value=input.nextInt();
                System.out.print("Enter New Value: ");
                new_Value=input.nextInt();
                arr.insertAfter(intArray,existing_Value,new_Value);
            }
            if(choice==6){
                System.out.print("Enter old Value: ");
                old_Value=input.nextInt();
                System.out.print("Enter New Value: ");
                new_Value=input.nextInt();
                arr.updateRecord(intArray,old_Value,new_Value);
            }
            if(choice==7){
                System.out.print("Enter index Number: ");
                index_No=input.nextInt();
                System.out.print("Enter the Value: ");
                new_Value=input.nextInt();
                arr.insertAtIndex(intArray,index_No,new_Value);
            }
            if(choice==8){
                System.out.print("Enter index Number: ");
                old_Value=input.nextInt();
                System.out.print("Enter New Value: ");
                new_Value=input.nextInt();
                arr.insertBeforeIndex(intArray,old_Value,new_Value);
            }
            if(choice==9){
                System.out.print("Enter index Number: ");
                old_Value=input.nextInt();
                System.out.print("Enter New Value: ");
                new_Value=input.nextInt();
                arr.insertAfterIndex(intArray,old_Value,new_Value);
            }
            if(choice==10){
                arr.search(intArray);
            }
            if(choice==11){
                arr.delete(intArray);
            }
            if(choice<1 || choice>12) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }

        }while(choice!=12);
        System.out.println("------------EXIT-----------");
    }
}

