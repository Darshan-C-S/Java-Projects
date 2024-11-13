package leetCodeAndHackerRank;

public class SmallestMissingIntegerSequentialPrefixSum {

    public static int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length-1; i++) {

            if(nums[i-1] + 1 == nums[i]){
                sum = sum + nums[i];
            }
            else{
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(sum == nums[i]){
                sum++;
                i=0;
            }
        }
        return sum;

    }

    public static void main(String[] args) {



    }
}
