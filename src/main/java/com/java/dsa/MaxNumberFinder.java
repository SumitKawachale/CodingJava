package com.java.dsa;

import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        char ch = sc.next().charAt(0);

        // Use the most negative possible value
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == ch) {
                String temp = num.substring(0, i) + num.substring(i + 1);
                double val = java.lang.Double.parseDouble(temp);
                if (val > max) {
                    max = val;
                }
            }
        }

        System.out.println(max);
    }
}

/*
## Problem: Maximize Number After Removing a Digit
Description
You are given a string number representing a positive integer and a character digit. You must remove exactly one occurrence of digit from number such that the value of the resulting string is maximized.
Constraints

* The digit is guaranteed to occur at least once in number.
* The resulting string can have leading zeros (though rare in this specific problem context).
        * The length of number is between 2 and 100.

        ------------------------------
        ## Example Walkthrough
Input:
number = "1321"
digit = '1'
Possible Operations:

        1. Remove the first '1': The remaining string is "321".
        2. Remove the second '1': The remaining string is "132".

Comparison:
Comparing "321" and "132", the value 321 is larger.
Output:
        "321"
*/

/*
        ------------------------------
        ## Logical Explanation
To solve this efficiently, you can use a Greedy Approach. While you could find every possible result and compare them (as you did in your code), there is a specific pattern to look for:

        1. The "Greater Neighbor" Rule: Iterate through the string from left to right. If you find the target digit and the character immediately after it is larger than the digit itself, removing the current digit will immediately result in a larger number at that decimal place.
        * Example: In 1321, the first 1 is followed by 3. Since 3 > 1, removing that 1 jumps the 3 into a higher place value, making it the best move.
   2. The Last Resort: If you never find a digit followed by a larger number (e.g., number = "54251", digit = '5'), you should remove the last occurrence of the digit to keep the higher-value digits in their place as long as possible.

## Corrected Java Solution (Optimized)
Since the problem asks for a string return and the numbers can be up to 100 digits long, you should compare strings or use the logic above rather than converting to a Double (which will lose precision for very large numbers).
 */

