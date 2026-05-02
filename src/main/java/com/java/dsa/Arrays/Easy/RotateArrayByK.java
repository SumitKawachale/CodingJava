package com.java.dsa.Arrays.Easy;

import java.util.Arrays;

public class RotateArrayByK {

    public static void rotateArrayByK(int[] arr , int k){
        int n = arr.length;
        if(n == 0 || n == 1) return;
        k = k % n;
        if(k == 0) return;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1};
        int[] arr4 = {};

        rotateArrayByK(arr1,3);
        rotateArrayByK(arr2,7);
        rotateArrayByK(arr3,4);
        rotateArrayByK(arr4,3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
