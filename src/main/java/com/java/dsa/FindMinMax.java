package com.java.dsa;

public class FindMinMax {
    public static void findMaxMin(int[] arr){
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }

            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }else if(arr[i] < secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }

        System.out.println("Minimum : "+min);
        System.out.println("Second Minimum : "+secondMin);
        System.out.println("Maximum : "+max);
        System.out.println(" Second Maximum : "+secondMax);

    }
    public static void main(String[] args){
        int[] arr ={3,7,5,2,8,9};
        findMaxMin(arr);

    }
}
