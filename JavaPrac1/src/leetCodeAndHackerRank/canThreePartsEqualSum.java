package leetCodeAndHackerRank;

public class canThreePartsEqualSum {
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int temp = 0;
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
        }
        if(sum%3 != 0) return false;
        int part = sum/3;
        for (int a : arr){
            temp += a;
            if (temp == part){
                temp = 0;
                count++;
            }

        }
        return count>=3;

    }
    public static void main(String[] args) {

        int []arr = {0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(arr));


    }
}
