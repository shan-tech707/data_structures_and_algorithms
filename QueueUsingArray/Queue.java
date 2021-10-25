package mcs_3E.DSA.QueueUsingArray;

import java.util.*;

public class Queue {
    int []arr;
    int front,rear;
    int size;

    public Queue(){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the size of the Queue");
        size=input.nextInt();
        arr=new int[size];
        front=0;
        rear=-1;
    }

    public void enqueue(int v){
        if(rear==size-1){
            System.out.println("queue is overflow");
        }else{
            rear++;
            arr[rear]=v;
        }
    }

    public int dequeue(){
        int v=-1;
        if(front==size){
            System.out.println("queue is under flow");
        }else{
            v=arr[front];
            front++;
        }
        return v;
    }

    public void delete(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value to delete");
        int v=s.nextInt();
        for(int i=front;i<rear;i++){
            if(arr[i]==v){
                int j=i;
                while (j<rear) {
                    arr[j]=arr[j+1];
                    j++;
                }
                rear--;
                System.out.println("value delete successfully");
                break;
            }
        }
    }

    public void swap(){

        int temp=arr[front];

        arr[front]=arr[rear];
        arr[rear]=temp;

    }

    public void display(){

        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+"\t");

        }
    }

    public static void menu(){
        System.out.println("press 1 to Enqueue");
        System.out.println("press 2 to Deque");
        System.out.println("press 3 to display");
        System.out.println("press 4 to remove");
        System.out.println("press 5 to swap the first and last values");
        System.out.println("press 6 to display");

    }

    public static void main(String[] args) {
        int choice;
        Queue q=new Queue();
        Scanner input=new Scanner(System.in);
        do{
            menu();
            choice=input.nextInt();
            if(choice==1){
                System.out.println("Enter the value to Enqueue");
                int value=input.nextInt();
                q.enqueue(value);
            }
            if(choice==2){
                int v=q.dequeue();
                System.out.println("deleting value form que "+v);
            }
            if(choice==3){
                q.display();
            }
            if(choice==4){
                q.delete();
            }
            if(choice==5){
                q.swap();
            }
        }while(choice!=6);
    }
}