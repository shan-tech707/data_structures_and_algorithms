package mcs_3E.DSA.BinarySearchTreee.UsingLinkedList;

public class Binary_Tree {

    Node root, parent, temp,q;

    Binary_Tree() {
        root=null;
    }

    public void insert(int value) {
        Node newNode=new Node();
        newNode.data=value;
        newNode.L=null;
        newNode.R=null;

        if(root==null) {
            root=newNode;
        }
        else {
            temp=root;
            boolean check=false;
            // while loop for checking duplication
            while(temp!=null) {
                if(temp.data==value) {
                    check=true;
                    break;
                }
                else if(temp.data<value) {
                    parent=temp;
                    temp=temp.R;
                }
                else{
                    parent=temp;
                    temp=temp.L;
                }
            }
            if(check) {
                System.out.println("such node exists.");
            }
            else {
                if(parent.data>value)
                    parent.L=newNode;
                else
                    parent.R=newNode;
            }
        }
    }

    void Remove(int value){
        boolean check=false;
        if(root==null)
            System.out.println("tree not created");
        else
        {
            q=root;
            while(q!=null)
            {
                if(q.data==value)
                {
                    check=true;
                    break;
                }
                else if(q.data<value)
                {
                    parent=q;
                    q=q.R;
                }
                else {
                    parent=q;
                    q=q.L;
                }
            }
        }
        if(!check)
            System.out.println("Value Not Found");
        else
        {
            if(q.L != null && q.R!=null) {             // two child
                parent=q;
                temp=q.R;
                while(temp.L!=null) {
                    parent=temp;
                    temp=temp.L;
                }
                q.data=temp.data;
                q=temp;
            }

            ///////// for leaf node
            if(q.L==null && q.R==null)
            {
                if(parent.R==q)
                    parent.R=null;
                else
                    parent.L=null;

            }

            if(q.L == null && q.R!=null) {    // one child   right
                if(parent.L==q) {
                    parent.L = q.R;
                }
                else
                {
                    parent.R = q.R;
                }


            }
            if(q.L != null && q.R==null) {     // one child   left`
                if(parent.L==q) {
                    parent.L = q.L;
                }
                else
                {
                    parent.R = q.L;
                }

            }
        }
    }

    public void findMinimum(){
        if ( root == null ){
            System.out.println("Tree is Empty");
        }
        temp = root;
        while(temp.L != null){
            temp = temp.L;
        }
        System.out.println("Minimum Value in Tree : "+temp.data);
    }

    public void findMaximum(){
        if ( root == null){
            System.out.println("tree not created");
        }
        temp = root;
        while(temp.R != null){
            temp =temp.R;
        }
        System.out.println("Maximum Value in Tee : "+temp.data);
    }

    void inOrder(Node q) {
        if(q!=null)
        {
            inOrder(q.L);
            System.out.print(q.data +"     ");
            inOrder(q.R);
        }
    }

    void preOrder(Node q) {
        if(q!=null)
        {
            System.out.print(q.data +"     ");
            preOrder(q.L);
            preOrder(q.R);
        }
    }

    void postOrder(Node q) {
        if(q!=null)
        {
            postOrder(q.L);
            postOrder(q.R);
            System.out.print(q.data +"     ");
        }
    }

    void search(int value) {
        boolean check=false;
        if(root==null)
        {
            System.out.println("\tList not Created.\n");
        }
        else
        {
            temp=root;
            while(temp!=null)
            {
                if(temp.data==value)
                {
                    check=true;
                    break;
                }
                else if(temp.data<value)
                {
                    temp=temp.R;
                }
                else {
                    temp=temp.L;
                }
            }

        }
        if(check)
        {
            System.out.println("Value Found! :-)\n");
        }
        else
        {
            System.out.println("Value Not Found!:-(\n");
        }

    }

    int sum=0;
    void sum(Node root) {
        if (root == null)
            System.out.println("List is Empty!");
        else {
            sum = root.data + sum;
            sum(root.L);
            sum(root.R);
        }
        System.out.println("Sum of All the Nodes = "+ sum);
    }

    int count=0;
    void average(Node q) {
        if(q==null)
            System.out.println("Empty");
        else {
            sum=q.data+sum;
            count++;
            average(q.L);
            average(q.R);
        }
        int avg=sum/count;
        System.out.println("Average is:  "+avg);
    }

    void count(Node q) {
        if(q==null)
            System.out.println("List is Empty!");
        else
        {
            count++;
            count(q.L);
            count(q.R);
        }
    }

}
