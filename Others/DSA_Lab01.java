package mcs_3E.DSA.Others;

import java.util.*;

public class DSA_Lab01 {
    public static void main(String[] args) {
        int[] arr={3,52,52,1,5,7,3,7,9};
        Arrays.sort(arr);
        for(int element:arr) {
            System.out.println(element);
        }
        int SearchNo=Arrays.binarySearch(arr,5);
        System.out.println("The index of element 5 = "+SearchNo);
    }
}
