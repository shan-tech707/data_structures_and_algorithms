package mcs_3E.DSA.DSA_LABs;

public class LinkListClass {
    Node start;

    public LinkListClass()
    {
        start = null;
    }

    void insertAtEnd(String name) {
        if(start == null)
        {
            Node newnode = new Node();
            newnode.data = name;
            start =  newnode;
            newnode.next = null;
        }
        else
        {
            Node newnode = new Node();
            newnode.data = name;
            Node last = searchLast();
            last.next =  newnode;
            newnode.next = null;
        }
    }

    void insertAtStart (String name) {
        Node newnode = new Node();
        newnode.data = name;
        newnode.next = start;
        start = newnode;

    }

    void insertAfter(String oldData,String newData) {
        Node newnode =new Node();
        newnode.data = newData;
        Node t1=   search(oldData);
        Node t2 = t1.next;
        t1.next = newnode;
        newnode.next = t2;
    }

    void insertBefore(String oldData,String newData) {
        Node n1 =new Node();
        n1.data = newData;
        Node t1=   searchPre(oldData);
        Node t2 = t1.next;
        t1.next = n1;
        n1.next = t2;
    }

    Node search(String d){
        Node t1 = start;
        while (!t1.data.equals(d))
        {
            t1=t1.next;
        }
        return t1;

    }

    void update(String oldData, String newData) {
        Node t1=   search(oldData);
        t1.data = newData;

    }

    void delete(String d) {
        Node t1 = searchPre(d);
        Node t2 = t1.next;
        Node t3 = t2.next;

        t2.data = "";
        t2.next = null;
        t1.next = t3;
    }

    void deleteAtLast() {
        Node temp = start;
        while (temp.next.next != null)
        {
            temp=temp.next;
        }
        temp.next=null;
        System.out.println("Deleted successfully!");
    }

    void deleteAtStart() {
        start = start.next;
        System.out.println("Deleted successfully!");
    }

    Node searchPre(String d) {
        if(start != null)
        {
            Node t1 = start;
            // Node t2 = start;
            while (!t1.next.data.equals(d))
            {
                // t2 = t1;
                t1=t1.next;
            }
            return t1;
        }
        else
            return null;
    }

    Node searchLast() {
        Node temp = start;
        while (temp.next != null)
        {
            temp=temp.next;
        }
        return temp;

    }

    void display() {
        Node temp = start;
        while(temp.next != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
