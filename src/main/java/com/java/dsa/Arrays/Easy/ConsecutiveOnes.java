package com.java.dsa.Arrays.Easy;

public class ConsecutiveOnes {

    public static int consecutiveOnes(int[] nums){

        int maxCount = 0;
        int currentCount = 0;

        for(int num : nums){
            if(num == 1){
                currentCount ++;
                maxCount = Math.max(currentCount, maxCount);
            }
            else{
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {},                                 // Empty Array
                {0, 0, 0, 0},                       // No Ones
                {1, 1, 1, 1},                       // All Ones
                {1},                                // Single One
                {0},                                // Single Zero
                {1, 1, 0, 1},                       // At Start
                {0, 1, 1, 1},                       // At End
                {1, 0, 1, 0, 1},                    // Alternating
                {1, 1, 0, 1, 1, 1, 0, 1}            // Scattered
        };

        int[] expectedOutputs = {0, 0, 4, 1, 0, 2, 3, 1, 3};

        for (int i = 0; i < testCases.length; i++) {
            int result = consecutiveOnes(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": Calculated = " + result + " | Expected = " + expectedOutputs[i]);
        }
    }

}
