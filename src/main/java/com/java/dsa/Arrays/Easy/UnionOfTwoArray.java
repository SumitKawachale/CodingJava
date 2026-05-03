package com.java.dsa.Arrays.Easy;

import java.util.ArrayList;

// The two array is Sorted array
public class UnionOfTwoArray {

    public static ArrayList<Integer> unionOfTwoSortedArray(int[] a , int[] b){
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }
                i++;
            }else{
                if(result.isEmpty() || result.get(result.size()-1) != b[j]){
                    result.add(b[j]);
                }
                j++;
            }
        }
        while(i < a.length){
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,2,4,5,6,7,8};
        int[] arr2 = {1,2,3,3,6,9};
        int[] arr3 = {1,2};
        int[] arr4 = {1,3,4};
        int[] arr5 = {1,2,3,4,8};
        int[] arr6 = {6,7,8};
        int[] arr7 = {1};
        int[] arr8 = {};

        System.out.println(unionOfTwoSortedArray(arr1,arr2));
        System.out.println(unionOfTwoSortedArray(arr3,arr4));
        System.out.println(unionOfTwoSortedArray(arr5,arr6));
        System.out.println(unionOfTwoSortedArray(arr7,arr8));

    }
}
