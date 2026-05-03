package com.java.dsa.Arrays.Easy;

import java.util.Arrays;

public class LinearSearch {

    public static int linearSearch(int[] arr , int k){
        if(arr.length == 0 || arr == null ) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {1};
        int[] arr4 = {0};
        int[] arr5 = {};

        System.out.println(linearSearch(arr1,5));
        System.out.println(linearSearch(arr2,2));
        System.out.println(linearSearch(arr3,1));
        System.out.println(linearSearch(arr4,3));
        System.out.println(linearSearch(arr5,3));

    }
}
