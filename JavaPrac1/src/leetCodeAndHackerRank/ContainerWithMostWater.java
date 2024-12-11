package leetCodeAndHackerRank;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxAr = 0;
        int left = 0;
        int right = height.length -1;

        while (left < right){
            maxAr = Math.max( maxAr , (right - left)*Math.min(height[left],height[right]));

            if (height[left] < height[right]){
                    left ++;
            }
            else {
                right--;
            }
        }

        return maxAr;

    }


    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));


    }
}
