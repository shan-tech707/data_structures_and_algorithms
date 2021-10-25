package mcs_3E.DSA.AVLTreeAlgo.AVLLinkedListTutorial;

public class Node {
    int key;
    Node left;
    Node right;
    int height;

//    Node(){
//        key=-1;
//        left=null;
//        right=null;
//        height=0;
//    }

    Node(int value){
        key=value;
        left=null;
        right=null;
        height=0;
    }
}
