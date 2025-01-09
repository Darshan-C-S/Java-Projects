package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1); 
        }
        return nums1;


    }

    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};

        Arrays.stream(nextGreaterElement(nums1, nums2)).forEach(System.out::println);


    }


}
