package CoreJavaProblems;

public class SumElementsInArray {
    public static int addAllElements(int[]arr){
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(addAllElements(arr));
    }
}
