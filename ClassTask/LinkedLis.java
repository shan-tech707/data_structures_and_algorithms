package mcs_3E.DSA.ClassTask;

public class LinkedLis {
    Node head;
    public void createAccount(String name,int accountNo,float amountDeposit){
        Node newNode=new Node();
        newNode.name=name;
        newNode.accountNumber=accountNo;
        newNode.balance=amountDeposit;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No record to display ");
        }
        else{
            Node temp=head;
            System.out.println("Inserted Records Are: ");
            while(temp!=null){
                //temp=temp.next;
                System.out.println("Name = "+temp.name);
                System.out.println("Name = "+temp.accountNumber);
                System.out.println("Salary= "+temp.balance);
                temp=temp.next;
            }
        }
    }

    public void deposit(int accountNo, float amountDeposit){
        if(head==null){
            System.out.println("There is No Record ");
        }else{
            Node temp=head;
            boolean check=true;
            while(temp!=null){
                if(temp.accountNumber==accountNo){
                    temp.balance= temp.balance+amountDeposit;
                    System.out.println("Current Amount Account= "+ temp.balance);
                    check=false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found");
            }
        }
    }

    public void withdraw(int accountNo,float amountDeposit){
        if(head==null){
            System.out.println("There is No Record ");
        }else{
            Node temp=head;
            boolean check=true;
            while(temp!=null){
                if(temp.accountNumber==accountNo){
                    if(temp.balance>=amountDeposit) {
                        temp.balance = temp.balance - amountDeposit;
                        System.out.println("Remaining Amount in Account:"+temp.balance);
                    }
                    else {
                        System.out.println("Amount is not enough to withdraw");
                        System.out.println("Amount in your Account="+temp.balance);
                    }
                    check = false;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found");
            }
        }
    }
}
