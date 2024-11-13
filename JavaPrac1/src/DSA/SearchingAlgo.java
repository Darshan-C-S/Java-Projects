package DSA;

public class SearchingAlgo {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7,8,9,11};
        int target = 1;
        int n = nums.length;

        //int res = LeniarSeach(nums,target);
        //int res = BinarySearch(nums , target);
        int res = BinaryRecursivSearch(nums, 0, nums.length - 1, target );

        if(res != -1){
            System.out.println("the index of the element to be searched is : "+ res);
        }
        else {
            System.out.println("The no is not in the list ");
        }
    }



    public static int BinaryRecursivSearch(int [] nums , int low , int high , int target){

        int mid = low +(high - low)/2;//123456789

       if(low <= high){
           if( nums[mid] == target){
               return mid;
           }
       } else if (nums[mid]> target) {
           return BinaryRecursivSearch(nums, mid + 1, high, target);
       } else {
           return BinaryRecursivSearch(nums, low, mid - 1, target);
       }

       return -1;
    }




    public static int Binaryrec1(int [] numsArr , int target , int left , int right ){


        int mid = (left+right)/2;
       if(left<=right){
           if(target == numsArr[mid]){
               return mid;
           }
           else if(target > numsArr[mid]){
               return Binaryrec1(numsArr , target , mid+1 ,right );
           } else  {
               return Binaryrec1(numsArr , target , left , mid-1);
           }
       }
        return -1;

    }

    public static int BinarySearch(int[] nums, int target) {

       int left = 0;
       int right = nums.length -1;//1234567

       while(left <= right){
           int mid = (left+right)/2;

           if(nums[mid]==target){
               return mid;
           }
           else if (nums[mid]< target) {
               left = mid+1;
           }
           else {
               right = mid-1;
           }
       }
        return -1;
    }

    public static int LeniarSeach(int[] nums, int target) {

        int steps =0;

        for(int i = 0 ; i < nums.length; i++){
            steps++;
            System.out.println("the no of steps taken in LeniarSeach: "+steps);
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }




}
