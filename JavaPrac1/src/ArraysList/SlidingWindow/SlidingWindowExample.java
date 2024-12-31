package ArraysList.SlidingWindow;

public class SlidingWindowExample {

    public static int maxSubarraySum(int[] arr , int k ){
        int maxSum  =0 , windows_left = 0 , windows_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            windows_sum += arr[i];

            if(i >= k-1){
                maxSum = Math.max(maxSum , windows_sum);
                windows_sum -= arr[windows_left];
                windows_left ++;
            }
        }
        return maxSum;

    }
    public static int maxSubarray2(int[] arr , int k ){

        int sum  = 0 , maxSum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;


    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(nums, k));
        System.out.println(maxSubarray2(nums , k));

    }

}
