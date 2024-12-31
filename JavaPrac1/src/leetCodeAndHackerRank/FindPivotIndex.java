package leetCodeAndHackerRank;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {

        int total = 0;
        int leftTotal = 0;

        for(int i : nums){
            total+=i;
        }
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal -nums[i];
            if(rightTotal == leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}