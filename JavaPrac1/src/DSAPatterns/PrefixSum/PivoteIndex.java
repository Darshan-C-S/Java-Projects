package DSAPatterns.PrefixSum;

public class PivoteIndex {
    public static int pivotIndex(int[] nums) {

        int total  = 0;
        int leftTotal  = 0;

        for (int n : nums){
            total  +=n;
        }

        for (int i = 0; i <nums.length ; i++) {
            int rightTotal = total  - nums[i] -leftTotal;
            if (rightTotal == leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        
//       Always traverse the example array to understand the algorithm  [1,7,3,6,5,6]

        /*
The method calculates the total sum of the array.

It keeps track of the running left sum while iterating.

For each index, it computes the right sum as total - nums[i] - leftSum.

If left sum equals right sum, that index is returned as the pivot.

If no balance point exists, it returns
        *
        * */

    }
}
