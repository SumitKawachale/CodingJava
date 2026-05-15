package com.java.dsa.Arrays.Easy;

public class MissingNumber {
    public static long missingNumberXOR(int[] arr){
        long missing = arr.length+1;
        for(int i = 0; i < arr.length ; i++){
            missing ^= arr[i] ^ (i+1);
        }
        return missing;
    }

    public static int missingNumber(int[] arr){
        int N = arr.length+1;

        long expectedSum = (long) N *(N+1)/2;
        long actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,6,7,8};
        int[] arr2 = {1,2,3,5};
        int[] arr3 = {1,2};
        int[] arr4 = {1,3,4};

        System.out.println(missingNumberXOR(arr1));
        System.out.println(missingNumberXOR(arr2));
        System.out.println(missingNumberXOR(arr3));
        System.out.println(missingNumberXOR(arr4));
        System.out.println("------------------------------------------");
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));
        System.out.println(missingNumber(arr4));
    }
}
