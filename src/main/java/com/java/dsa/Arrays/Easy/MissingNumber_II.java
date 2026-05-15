package com.java.dsa.Arrays.Easy;

// This code can handle Both WHOLE number and NATURAL Number as input
public class MissingNumber_II {

    public static long missingNumberXOR(int[] nums , boolean isWholeNumber){

        long XOR = isWholeNumber ? nums.length : (nums.length + 1);
        for(int i = 0; i < nums.length; i++){
            XOR ^= nums[i];
            XOR ^= isWholeNumber? i : (i+1);
        }
        return XOR;
    }

    public static long missingNumber(int[] nums , boolean isWholeNumber){

        long n = nums.length;

        long expectedSum;
        long actualSum = 0;

        if(isWholeNumber){
            expectedSum = n*(n+1)/2;
        }else{
            long N = nums.length + 1;
            expectedSum = N * (N+1)/2;
        }

        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // ==========================================
        // TEST SET 1: NATURAL NUMBERS (Starts from 1)
        // ==========================================
        int[] nat1 = {1, 2, 4, 5, 6, 7, 8}; // Missing: 3
        int[] nat2 = {1, 2, 3, 5};          // Missing: 4
        int[] nat3 = {2, 3, 4};             // Missing: 1 (Edge Case: First element missing)
        int[] nat4 = {1, 2, 3};             // Missing: 4 (Edge Case: Last element missing)

        System.out.println("=== NATURAL NUMBERS (Expected: 3, 4, 1, 4) ===");
        System.out.println("XOR: " + missingNumberXOR(nat1, false) + " | Sum: " + missingNumber(nat1, false));
        System.out.println("XOR: " + missingNumberXOR(nat2, false) + " | Sum: " + missingNumber(nat2, false));
        System.out.println("XOR: " + missingNumberXOR(nat3, false) + " | Sum: " + missingNumber(nat3, false));
        System.out.println("XOR: " + missingNumberXOR(nat4, false) + " | Sum: " + missingNumber(nat4, false));

        System.out.println("------------------------------------------");

        // ==========================================
        // TEST SET 2: WHOLE NUMBERS (Starts from 0)
        // ==========================================
        int[] whole1 = {0, 1, 3, 4, 5};     // Missing: 2
        int[] whole2 = {0, 1, 2, 3, 5};     // Missing: 4
        int[] whole3 = {1, 2, 3, 4};        // Missing: 0 (Edge Case: First element missing)
        int[] whole4 = {0, 1, 2, 3};        // Missing: 4 (Edge Case: Last element missing)

        System.out.println("=== WHOLE NUMBERS (Expected: 2, 4, 0, 4) ===");
        System.out.println("XOR: " + missingNumberXOR(whole1, true) + " | Sum: " + missingNumber(whole1, true));
        System.out.println("XOR: " + missingNumberXOR(whole2, true) + " | Sum: " + missingNumber(whole2, true));
        System.out.println("XOR: " + missingNumberXOR(whole3, true) + " | Sum: " + missingNumber(whole3, true));
        System.out.println("XOR: " + missingNumberXOR(whole4, true) + " | Sum: " + missingNumber(whole4, true));
    }

}
