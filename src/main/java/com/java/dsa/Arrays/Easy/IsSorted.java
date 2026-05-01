package com.java.dsa.Arrays.Easy;

public class IsSorted {
    public static boolean isSorted(int[] arr){
        if(arr.length == 0 || arr.length == 1) return true;

        for(int i = 1 ; i < arr.length; i++ ){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isSorted(arr));
    }
}
