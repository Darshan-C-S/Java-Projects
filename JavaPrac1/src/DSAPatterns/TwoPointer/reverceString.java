package DSAPatterns.TwoPointer;

import java.util.Arrays;

public class reverceString {
    public static char[] reverSt(char[] s){
        int left = 0;
        int right = s.length-1;

        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
    public static void main(String[] args) {

        char[]ch = {'h','e','l','l','o'};
        for (char c : reverSt(ch)) {
            System.out.println(c);
        }
    }
}
