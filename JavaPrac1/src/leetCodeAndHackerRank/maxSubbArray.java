package leetCodeAndHackerRank;

public class maxSubbArray {

//    public static int maxSubArray(int[] nums) {
//
//        /*Here we are storing max sum value where we are comparing current with max
//         * max will be initially min integer value an start comparing with current value
//         * the current value adds the elements in the list and compare it with max value
//         * if its greater it stores the current value in maxSum so that max sum can be used to compare
//         * max value */
//
//        int maxSum = Integer.MIN_VALUE;
//        int current = 0;
//
//        for(int i = 0;i<nums.length;i++){
//            current += nums[i];
//
//            if(current>maxSum){
//                maxSum = current;
//            } else if (current<0) {
//                current = 0;
//            }
//        }
//        return maxSum;
//    }
    //Alternet approch
    public static int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
/*Here we will find the max value between list elements and currentSum adding with list elements and
update currentSum
* then We compare the first element which is assigned as maxSum with currentSum and
update the max value to maxSum */

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {

        int []a ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(a));


    }
}
