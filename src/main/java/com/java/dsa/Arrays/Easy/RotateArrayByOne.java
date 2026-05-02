package com.java.dsa.Arrays.Easy;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void rotateArrayByOne(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return;
        }
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {1};
        int[] arr4 = {};

        rotateArrayByOne(arr1);
        rotateArrayByOne(arr2);
        rotateArrayByOne(arr3);
        rotateArrayByOne(arr4);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
