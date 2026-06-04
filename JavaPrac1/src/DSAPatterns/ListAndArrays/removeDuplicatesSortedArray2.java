package DSAPatterns.ListAndArrays;

public class removeDuplicatesSortedArray2 {
    public int removeDuplicates(int[] nums) {

        int c = 0;


        for (int ele : nums) {
            if(c == 0 || c == 1 || nums[c-2] !=ele ){
                nums[c] = ele;
                c++;
            }

        }
        return c;
    }



    public static void main(String[] args) {

    }
}
