package com.java.dsa.Arrays.Easy;

public class ConsecutiveOnes_II {
    public static int longestOnes(int[] nums , int k){
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount ++ ;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount --;
                }
                left ++;
            }
            maxLen = Math.max(maxLen, right -left +1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        // Case 1: Standard case (Multiple windows possible)
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        // Output: 6 (Window: [1, 1, 1, 1, 0, 0] flipped or similar)

        // Case 2: k is larger than the number of zeros (Can flip all zeros)
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        // Output: 10

        // Case 3: No zeros in the array
        System.out.println(longestOnes(new int[]{1, 1, 1, 1}, 0));
        // Output: 4

        // Case 4: k is 0 (Cannot flip any zeros)
        System.out.println(longestOnes(new int[]{1, 0, 1, 1, 0, 1}, 0));
        // Output: 2

        // Case 5: Array is all zeros
        System.out.println(longestOnes(new int[]{0, 0, 0, 0}, 2));
        // Output: 2
    }
}
