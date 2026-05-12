package com.java.dsa.Arrays.Easy;

import java.util.ArrayList;

public class IntersectionSortedArrays {
    public static ArrayList<Integer> intersectionSortedArrays(int[] a , int[] b){
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                if(result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,4,5,6,7,8};
        int[] arr2 = {1,2,3,3,6,9};
        int[] arr3 = {1,2,4};
        int[] arr4 = {1,3,4};
        int[] arr5 = {1,2,3,4,8};
        int[] arr6 = {2,3,6,7,8};
        int[] arr7 = {1};
        int[] arr8 = {};

        System.out.println(intersectionSortedArrays(arr1,arr2));
        System.out.println(intersectionSortedArrays(arr3,arr4));
        System.out.println(intersectionSortedArrays(arr5,arr6));
        System.out.println(intersectionSortedArrays(arr7,arr8));
    }
}
