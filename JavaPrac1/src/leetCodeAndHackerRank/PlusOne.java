package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }

        // If all digits were 9, create a new array with an extra length and set the first element to 1
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;


    }

        public static void main(String[] args) {
        int[]a = {1,1,9};
        int[]an = plusOne(a);
            for (int i = 0; i < an.length; i++) {
                System.out.println(an[i]);
            }
    }
}
