package mcs_3E.DSA.AVLTreeAlgo.AVLArrayTutorial;

public class AVLArray {

    Node[] array=new Node[50];
    int i=0;
    int max(int a,int b){
        return Math.max(a,b);
    }

    int getHeight(Node[] node){
        if(node[i]==null){
            return -1;
        }
        else
            return array[i].height;
    }

    int getBalanceFactor(Node[] node){
        return getHeight(node)-getHeight(node);
    }
}
