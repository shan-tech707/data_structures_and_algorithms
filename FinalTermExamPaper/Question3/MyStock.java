package mcs_3E.DSA.FinalTermExamPaper.Question3;

public class MyStock {

    Product newNode,head,temp;

    public void enterProduct(int id,String title,float price){
        newNode=new Product();
        newNode.pId=id;
        newNode.pTitle=title;
        newNode.pPrice=price;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }else{
            temp=head;
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
            temp=head;
            System.out.println("Stocked Product Are: ");
            while(temp!=null){
                System.out.println("Id= "+temp.pId);
                System.out.println("Name = "+temp.pTitle);
                System.out.println("Salary= "+temp.pPrice);
                temp=temp.next;
            }
        }
    }

    public  void removeProduct(){
        if(head==null){
            System.out.println("There is No Stock Available ");
        }else if(head.next==null){
            head=null;
        }else{
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
}
