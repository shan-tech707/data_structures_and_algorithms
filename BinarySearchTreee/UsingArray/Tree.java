package mcs_3E.DSA.BinarySearchTreee.UsingArray;

public class Tree {
    int index=0,temp;

    int[] arr=new int[50];

    void insert(int value){
        boolean check=false;
        int i=0;
        if(arr[0]==0) {
            arr[0]=value;
        }
        else {
            while (i<arr.length && arr[i]!=0){
                if(arr[i]==value){
                    check=true;
                    break;
                }
                else if(arr[i]<value){
                    temp=i;
                    i=2*i+2;
                }
                else {
                    temp=i;
                    i=2*i+1;
                }
            }
            if (check) {
                System.out.println("Such Value Already Exists");
            }
            else {
                if(arr[temp]>value) {
                    arr[2*temp+1]=value;
                }else {
                    arr[2*temp+2]=value;
                }
            }
        }
    }

    void indexOfData(){
        int i=0;
        while (i<arr.length) {
            System.out.println("Value at index "+ i + " = "+ arr[i]);
            i++;
        }
    }

    void inOrder(int[] q,int i){
        if (q[i]!=0) {
            inOrder(q,2*i+1);
            System.out.print(q[i]+"   ");
            inOrder(q,2*i+2);
        }
    }

    void preOrder(int[] q,int i){
        if (q[i]!=0) {
            System.out.print(q[i] +"     ");
            preOrder(q,2*i+1);
            preOrder(q,2*i+2);
        }
    }

    void postOrder(int[] q,int i) {
        if(q[i]!=0) {
            postOrder(q,2*i+1);
            postOrder(q,2*i+2);
            System.out.print(q[i] +"     ");
        }
    }

    void findMinimum(){
        if(arr[0]==0){
            System.out.println("Array is Empty");
        }
        int i=0,min=0;
        while(arr[2*i+1]<arr[i]){
            if(arr[2*i+1]==0) {
                break;
            }
            min = arr[2 * i + 1];
            i++;
        }
        System.out.println("Minimum Value = "+ min);
    }

    void findMaximum(){
        if(arr[0]==0){
            System.out.println("Array is Empty");
        }
        int i=0,max=0;
        while(arr[2*i+2]>arr[i]){
            if(arr[2*i+2]==0) {
                break;
            }
            max = arr[2 * i + 2];
            i+=2;
        }
        System.out.println("Minimum Value = "+ max);
    }

    void remove(int value){
        int root=indexSearch(value);
        if(index==-1){
            System.out.println("Value not Exist");
        }
        else{
            int valueIndex=2*root+2;
            int minValueIndex=findMinimumValueIndex(valueIndex);
            arr[root]=arr[minValueIndex];
            arr[minValueIndex]=0;
        }
    }

    int indexSearch(int value){
        boolean check=false;
        int i=0;
        if(arr[0]==0) {
            System.out.println("Array is Empty");
        }
        else {
            while (i < arr.length) {
                if (arr[i] == value) {
                    check = true;
                    index = i;
                    break;
                } else if (arr[i] < value) {
                    index = i;
                    i = 2 * i + 2;
                } else {
                    index = i;
                    i = 2 * i + 1;
                }
            }
            if (!check) {
                return -1;
            }
        }
        return index;
    }

    // to find the index of minimum value:
    int findMinimumValueIndex(int ind){
        if(arr[ind]==0){
            return ind;
        }

        if(arr[2*ind+1]==0 && arr[2*ind+2]==0) {
            return ind;
        }

        if(arr[2*ind+1]!=0 && arr[2*ind+2]!=0) {
            temp=2*ind+2;
            while (arr[2 * temp + 1] < arr[temp]) {
                if (arr[2 * temp + 1] == 0) {
                    break;
                }
                index = 2 * temp + 1;
                ind++;
            }
        }

        if(arr[2*ind+1]==0 && arr[2*ind+2]!=0){
            temp=2*ind+2;
            while (arr[2 * temp + 1] < arr[temp]) {
                if (arr[2 * temp + 1] == 0) {
                    break;
                }
                index = 2 * temp + 1;
                ind++;
            }
        }

        if(arr[2*ind+1]!=0 && arr[2*ind+2]==0){
            temp=2*ind+1;
            while (arr[2 * temp + 2] < arr[temp]) {
                if (arr[2 * temp + 2] == 0) {
                    break;
                }
                index = 2 * temp + 2;
                ind+=2;
            }
        }
        return index;
    }

    void update(int value){
        boolean check=false;
        int i=0;
        if(arr[0]==0) {
            System.out.println("Array is Empty");
        }
        else {
            while (i < arr.length) {
                if (arr[i] == value) {
                    check = true;
                    index = i;
                    break;
                } else if (arr[i] < value) {
                    index = i;
                    i = 2 * i + 2;
                } else {
                    index = i;
                    i = 2 * i + 1;
                }
            }
            if (!check) {
                System.out.println("Not Found");
            }
            else {
                arr[index]=value;
            }
        }
    }
}
