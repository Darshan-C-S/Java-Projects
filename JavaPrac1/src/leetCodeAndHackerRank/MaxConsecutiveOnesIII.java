package leetCodeAndHackerRank;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {

        int end = 0;
        int start = 0;
        int zeros = 0;

        while (end < nums.length){
            if(nums[end] == 0){
                zeros ++;
            }
            end++;

            if(zeros > k){
                if (nums[start] == 0){
                    zeros -- ;
                }
                start++;
            }
        }
        return end - start;


    }

    public static void main(String[] args) {

        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr , 2));

    }
}
