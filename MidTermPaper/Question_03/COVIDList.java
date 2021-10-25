package mcs_3E.DSA.MidTermPaper.Question_03;

import mcs_3E.DSA.LinkedList.SimpleLinkedList.Node;

public class COVIDList {
    COVIDDetail start=null;


    // a)
    void add(COVIDDetail n){
        COVIDDetail newNode=new COVIDDetail();
        newNode.country=n.country;
        newNode.active_cases=n.active_cases;
        newNode.next=null;

        if(start==null){
            start=newNode;
        }else{
            // will return the previous node of node having active_cases minimum then newNode active_cases
            COVIDDetail node=search(newNode.active_cases);
            newNode.next=node.next;
            node.next=newNode;
        }
    }

    COVIDDetail search(int cases){
        COVIDDetail n=new COVIDDetail();
        if(start==null){
            System.out.println("No Record Entered Yet,");
        }
        else{
            COVIDDetail temp=start;
            while(temp.next!=null){
                if(temp.next.active_cases < cases){
                    n=temp;
                    break;
                }
                temp=temp.next;
            }
        }
        return n;
    }

    // b)
    void updateCases(String country_name , int cases){
        if(start==null){
            System.out.println("No Record Entered Yet,");
        }
        else{
            boolean check=true;
            COVIDDetail temp=start;
            while(temp!=null){
                if(temp.country==country_name){
                    temp.active_cases=temp.active_cases+cases;
                    check=false;
                    break;
                }
                temp=temp.next;
            }
            if(check){
                System.out.println("No Record Found!.");
            }
        }
        // This method will sort list by active_cases dec
        sortList();
    }

    static  void sortList(){

    }

    // c)
    String maxCases(){
        int max=0;
        String country=null;
        if(start!=null){
            max=start.active_cases;
        }
        COVIDDetail temp=start.next;
        while (temp != null)
        {
            if (max < temp.active_cases){
                max = temp.active_cases;
                country=temp.country;
            }
            temp = temp.next;
        }
        return country;
    }

    // d)
    void displayData(){
        int min=0;
        COVIDDetail d=new COVIDDetail();
        if(start!=null){
            min=start.active_cases;
        }
        COVIDDetail temp=start;
        while (temp != null)
        {
            if (min> temp.active_cases){
                min = temp.active_cases;
                d=temp;
            }
            temp = temp.next;
        }
        System.out.println("Country: "+d.country);
        System.out.println("Active Cases: "+d.active_cases);
    }

    // e)
    COVIDDetail newList;

    COVIDList covid_FreeCountries(){
        COVIDList n=new COVIDList();
        if(start==null){
            System.out.println("List is Empty");
        }
        COVIDDetail temp=start;
        while (temp != null)
        {
            if (temp.active_cases==0){
                n.newList=temp;
                n.newList=n.newList.next;
            }
            temp = temp.next;
        }
        return n;
    }
}
