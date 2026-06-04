package DSAPatterns.PrefixSum;

public class RangeSumQuery {
    private int[] prefex;
    public void  NumArray(int[] nums) {

        prefex = new int[nums.length+1];
        prefex[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            prefex[i+1] = prefex[i]+nums[i];
        }


    }

    public int sumRange(int left, int right) {

            return prefex[right] - prefex[left-1];


    }
    public static void main(String[] args) {

//        RangeSumQuery obj = new RangeSumQuery(nums);
    }
}
