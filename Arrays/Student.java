package mcs_3E.DSA.Arrays;

import java.util.*;
public class Student {
    static int index;
    int id;
    String name,f_Name,p_Num;
    Scanner sc=new Scanner(System.in);
    public void insert(){
        System.out.print("Enter the id: ");
        id=sc.nextInt();
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Father Name: ");
        f_Name=sc.next();
        System.out.print("Enter Phone Number: ");
        p_Num=sc.next();
    }

    public void display(){
        System.out.println("id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Father Name = "+f_Name);
        System.out.println("Phone Number = "+p_Num);
    }

    public void display_Name(){
        System.out.println("Name = "+name);
    }

    public void display_Num(){
        System.out.println("Phone Number = "+p_Num);
    }

    public void searchById(Student[] arr){
        System.out.print("Enter the id of the student to search the record= ");
        int sid=sc.nextInt();
        boolean check=true;
        for(int i=0;i<index;i++){
            if(arr[i].id==sid){
                System.out.println("record found at position "+(i+1));
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("No record found");
        }
    }

    public void searchByName(Student[] arr){
        System.out.print("Enter the Name of the student to search the record= ");
        String n=sc.next();
        boolean check=true;
        for(int i=0;i<index;i++){
            if(arr[i].name.equals(n)){
                arr[i].display();
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("No record found");
        }
    }

    public void searchByPhoneNo(Student[] arr){
        System.out.print("Enter the Phone Number of the student to search the record= ");
        String p=sc.next();
        boolean check=true;
        for(int i=0;i<index;i++){
            if(arr[i].p_Num.equals(p)){
                arr[i].display();
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("No record found");
        }
    }

    public void delete(Student[] arr){
        System.out.print("Enter the id of the student to delete the record= ");
        int sid=sc.nextInt();
        for(int i=0;i<index;i++){
            if(arr[i].id==sid){
                int j=i;
                while (j<index-1) {
                    arr[j]=arr[j+1];
                    j++;
                }
                index--;
                System.out.println("Record deleted successfully");
            }
        }

    }

    public void insertAtStart(Student[] arr){
        int i=index;
        while (i>0) {
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=new Student();
        arr[0].insert();
        index++;
    }

    public void insertAt(Student[] arr){
        System.out.print("Enter the index no to insert the data= ");
        int userInd=sc.nextInt();
        int i=index;
        while (i>userInd) {
            arr[i]=arr[i-1];
            i--;
        }
        arr[userInd]=new Student();
        arr[userInd].insert();
        index++;
    }

    public static void menu(){
        System.out.println("//---------------Main Menu-------------//");
        System.out.println("Press 1 to add the record ");
        System.out.println("Press 2 to display the record ");
        System.out.println("Press 3 to search the record ");
        System.out.println("Press 4 to delete the record");
        System.out.println("Press 5 to insert At Start of the array");
        System.out.println("Press 6 to insert At specific point ");
        System.out.println("Press 7 to exit");
    }

    public static void dis_Menu(){
        System.out.println("Press A to display all record ");
        System.out.println("Press B to display only name ");
        System.out.println("Press C to display only Phone number ");
        System.out.println("Press D return to the main Menu");
    }

    public static void searchMenu() {
        System.out.println("press A to search by id");
        System.out.println("press B to search by name");
        System.out.println("press C to search by phone number ");
        System.out.println("Press D return to the main Menu");
    }

    public static void main(String[] args){
        Student[] stdArray=new Student[50];
        Student std=new Student();
        int choice;
        Scanner s=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=s.nextInt();
            if(choice==1){
                stdArray[index]=new Student();
                stdArray[index].insert();
                index++;
            }
            if(choice==2){
                char display_choice;
                do{
                    dis_Menu();
                    display_choice=Character.toUpperCase(s.next().charAt(0));
                    switch (display_choice){
                        case 'A':
                            for(int i=0;i<index;i++) {
                                stdArray[i].display();
                            }
                            break;
                        case 'B':
                            for(int i=0;i<index;i++) {
                                stdArray[i].display_Name();
                            }
                            break;
                        case 'C':
                            for(int i=0;i<index;i++) {
                                stdArray[i].display_Num();
                            }
                            break;
                        default:
                            System.out.println("Invalid Entry");
                    }
                }
                while (display_choice=='D');
            }
            if(choice==3){
                char search_Choice;
                do{
                    searchMenu();
                    search_Choice=Character.toUpperCase(s.next().charAt(0));
                    switch (search_Choice){
                        case 'A':
                            std.searchById(stdArray);
                            break;
                        case 'B':
                            std.searchByName(stdArray);
                            break;
                        case 'C':
                            std.searchByPhoneNo(stdArray);
                            break;
                        default:
                            System.out.println("Invalid Entry");
                    }
                }
                while (search_Choice=='D');
            }
            if(choice==4){
                std.delete(stdArray);
            }
            if(choice==5){
                std.insertAtStart(stdArray);
            }
            if(choice==6){
                std.insertAt(stdArray);
            }
            if(choice<1 || choice>7) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        }while(choice!=7);
    }
}

