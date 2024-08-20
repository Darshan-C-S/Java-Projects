package ArraysList;

public class SortAndFindLargestSmallestElementOfArray {
    public static void SortgetMaxAndMinElementOfArray(int []arr){
        int size = arr.length;
        System.out.println("The sorted Array is : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("The max element is : "+arr[size-1]);
        System.out.println("The min element is : "+arr[0]);


    }

    public static void main(String[] args) {

        int arr[] = {1,5,2,6,8,3,4,7};
        SortgetMaxAndMinElementOfArray(arr);

    }
}
