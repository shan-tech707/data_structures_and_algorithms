package mcs_3E.DSA.Others;

import java.util.Scanner;

public class Calculator {
    static int Sum(int a, int b){
        return a+b;
    }static int Sub(int a, int b){
        return a-b;
    }static int Mul(int a, int b){
        return a*b;
    }static int Div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int Num1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int Num2 = input.nextInt();
        System.out.print("Enter Operator : ");
        char Op = input.next().charAt(0);
        switch(Op){
            case '+':
                System.out.printf("Sum of %d and %d = %d ",Num1,Num2,Sum(Num1,Num2));
                break;
            case '-':
                System.out.printf("Subtraction of %d and %d = %d ",Num1,Num2,Sub(Num1,Num2));
                break;
            case '*':
                System.out.printf("Multiplication of %d and %d = %d  ",Num1,Num2,Mul(Num1,Num2));
                break;
            case '/':
                System.out.printf("Division of %d and %d = %d ",Num1,Num2,Div(Num1,Num2));
                break;
            default:
                System.out.println("You Enter invalid Operator!");
        }
    }
}