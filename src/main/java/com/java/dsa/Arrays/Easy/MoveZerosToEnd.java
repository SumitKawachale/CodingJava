package com.java.dsa.Arrays.Easy;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int[] arr){
        if(arr.length == 0 || arr.length == 1) return;

        int j =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,0,3,4,0,0,7,8};
        int[] arr2 = {0,2,0,0,5};
        int[] arr3 = {1};
        int[] arr4 = {0};
        int[] arr5 = {};

        moveZerosToEnd(arr1);
        moveZerosToEnd(arr2);
        moveZerosToEnd(arr3);
        moveZerosToEnd(arr4);
        moveZerosToEnd(arr5);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

    }
}
