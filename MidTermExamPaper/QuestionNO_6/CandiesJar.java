package mcs_3E.DSA.MidTermExamPaper.QuestionNO_6;

import java.util.*;

public class CandiesJar {
    static int index;
    String candyName;
    Scanner input=new Scanner(System.in);
    public void insert(){
        System.out.print("Enter Candy Color: ");
        candyName=input.next();
    }
    public void display(){
        System.out.println("Candy = "+candyName);

    }
    public void delete(CandiesJar[] arr){
        System.out.print("Enter the Candy Color you want to eat= ");
        candyName=input.next();
        for(int i=0;i<index;i++){
            if(arr[i].candyName.equals(candyName)){
                int j=i;
                while (j<index-1) {
                    arr[j]=arr[j+1];
                    j++;
                }
                index--;
                System.out.println("Eat Candy");
            }
        }

    }
    public static void menu(){
        System.out.println("//-----------------Menu----------//");
        System.out.println("Press 1 to Enter Candy Color ");
        System.out.println("Press 2 to Display All Candy ");
        System.out.println("Press 3 to Eat Candy Remove ");
        System.out.println("Press 4 to exit ");
    }

    public static void main(String[] args){
        CandiesJar[] stdArray=new CandiesJar[50];
        CandiesJar std=new CandiesJar();
        int choice;
        index=0;
        Scanner s=new Scanner(System.in);
        do{
            menu();
            System.out.print("Enter your Choice= ");
            choice=s.nextInt();
            if(choice==1){
                stdArray[index]=new CandiesJar();
                stdArray[index].insert();
                index++;
            }
            if(choice==2){
                for(int i=0;i<index;i++) {
                    stdArray[i].display();
                }
            }
            if(choice==3){
                std.delete(stdArray);
            }
            if(choice<1 || choice>4) {
                System.out.println("Invalid Option!\nPlease Enter Valid Option.");
            }
        }while(choice!=4);
    }
}

