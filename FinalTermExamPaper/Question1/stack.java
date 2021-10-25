package mcs_3E.DSA.FinalTermExamPaper.Question1;

import static java.lang.System.exit;

class stack {

    Node top;
    public void push(char x) {
        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow\n");
        }
        else {
            top = (top).link;
        }
    }

    public void display() {
        String s=" ";
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                s+=temp.data;
                temp = temp.link;
            }
        }
        reverseWord(s);
    }

    public void reverseWord(String str){
        String reverse = "";
        int length = str.length();
        for (int i = length - 1 ; i >= 0 ; i--) {
            reverse =reverse+ str.charAt(i);
        }
        System.out.println("Reverse of the string: " + reverse);
    }
}

