package mcs_3E.DSA.BinarySearchTreee.UsingArray;

public class BinaryTree {

    int [] arr=new int[50];

    public void insert(int v) {
        int i = 0;
        while (arr[i] != 0) {
            if (v > arr[i])
                i = 2 * i + 2;
            else
                i = 2 * i + 1;
        }
        arr[i] = v;
    }

    int search(int v) {
        int i = 0;
        while (arr[i] != v) {
            if (v > arr[i])
                i = 2 * i + 2;
            else
                i = 2 * i + 1;
        }
        return i;
    }

    int max(int i) {  //3
        int prei = i;
        while (arr[i] != 0) {  //

            prei = i;
            i = 2 * i + 2;
        }
        return prei;
    }

    int min() {
        int i = 0;
        int prei = 0;
        while (arr[i] != 0) {

            prei = i;
            i = 2 * i + 1;
        }
        return prei;
    }


    void Remove(int v) {  //v=5
        int ind = search(v);  //1
        int maxind = max(2 * ind + 1);  //3
        arr[ind] = arr[maxind];
        arr[maxind] = 0;
    }
    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println("value at index "+i+"="+arr[i]);
        }
    }
    void inorder(int i) {
        if (arr[i] != 0) {
            inorder(2 * i + 1);
            System.out.print(arr[i] + "\t");
            inorder(2 * i + 2);

        }
    }
    void preorder(int i){
        if(arr[i]!=0){
            preorder(2*i+1);

            preorder(2*i+2);
            System.out.print(arr[i]+"\t");


        }

    }
    void postorder(int i) {
        if (arr[i] != 0) {
            System.out.print(arr[i] + "\t");
            postorder(2 * i + 1);

            postorder(2 * i + 2);

        }
    }


    public static void main(String[] args) {
        BinaryTree ob = new BinaryTree();
        ob.insert(12);
        ob.insert(14);
        ob.insert(5);
        ob.insert(17);
        ob.insert(30);
        ob.display();
        System.out.println("index of value "+ob.search(30));
        int j=ob.max(0);
        System.out.println("index of value "+ob.arr[j]);
        j=ob.min();

        System.out.println("index of value "+ob.arr[j]);
        ob.Remove(30);
        ob.display();
        ob.inorder(0);
        System.out.println();
        ob.preorder(0);
        System.out.println();

        ob.postorder(0);
    }
}
