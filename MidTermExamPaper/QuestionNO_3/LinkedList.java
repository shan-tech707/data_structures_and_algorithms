package mcs_3E.DSA.MidTermExamPaper.QuestionNO_3;

import static java.lang.System.exit;

class LinkedList {
    Node top;
    LinkedList()
    {
        this.top = null;
    }
    public void push(String name,int age,String discipline,String contactNo,String address) {
        Node newNode = new Node();
        newNode.name=name;
        newNode.age=age;
        newNode.discipline=discipline;
        newNode.contactNo=contactNo;
        newNode.address=address;
        newNode.link = top;
        top = newNode;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public String peek()
    {
        String topRecord;
        if (!isEmpty()) {
            topRecord="Name= "+top.name+"\nAge= "+top.age+"\nDiscipline= "+top.discipline+"\nContactNo"+top.contactNo+"\nAddress= "+top.address;
            return topRecord;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
    }
    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }

    public void display()
    {
        int i=1;
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.println("------Record== "+ i);
                System.out.println("Name= "+temp.name);
                System.out.println("Age= "+temp.age);
                System.out.println("Discipline= "+temp.discipline);
                System.out.println("Contact No= "+temp.contactNo);
                System.out.println("Address= "+temp.address);
                // assign temp link to temp
                temp = temp.link;
                i++;
            }
        }
    }
}

