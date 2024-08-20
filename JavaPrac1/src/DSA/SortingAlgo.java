package DSA;

public class SortingAlgo {

//    public static int[] bubbleSort(int nums[] , int size , int temp ){
//
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = 0; j < size - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    // Swap nums[j] and nums[j + 1]
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//        return nums;
//    }

   public static int[] bubbleSort(int nums[] , int size){
       for(int i = 0 ;  i< size -1 ; i++){
           for(int j = 0 ; j<size-i-1; j++){
               if(nums[j]>nums[j+1]){
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;
               }
           }
       }
       return nums;

   }

    public static int[] seletionSort(int nums[] , int size ){

        int min = -1;

        for(int i = 0 ; i<size-1 ;i++){

            min = i;
            for (int j = i+1 ; j<size;j++){
                if(nums[min]>nums[j]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;

        }
        return nums;

    }

//    public static int[] insertionSort(int []arr){//
//
//        for (int i = 1 ; i< arr.length;i++){
//            int key = arr[i];
//            int j = i-1;
//
//            while(j >= 0 && arr[j]>key){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//
//        }
//        return arr;
//
//    }

    public static int[] insertionSort(int[]arr){
       for(int i= 1 ;i<arr.length;i++){
           int key = arr[i];
           int j= i-1;

           while (j>0 && arr[j]>key){
               arr[j+1]= arr[j];
               j--;
           }
          arr[j+1] = key;
       }
        return arr;
    }

//    public static int[] quickSort(int[]arr , int low ,int high ){
//      if(low<high){
//
//          int pi = parition(arr ,low ,high);
//          quickSort(arr , low, pi-1);
//          quickSort(arr, pi+1, high);
//      }
//    }
//
//    private static int parition(int[] arr, int low, int high) {
//       int pivote = arr[high];
//       int i = low-1;
//       for (int j=low;j<high;j++){
//           if(arr[i]<pivote){
//               i++;
//
//
//           }
//
//       }
//
//    }


    public static void main(String[] args) {
        int nums[] = {1, 4, 6, 2, 5, 3, 8, 7};
        int size = nums.length;
        int n1[] = {1, 4, 6, 2, 5, 3, 8, 7};
        int s1 = nums.length;
        int temp = 0;
        int n2[] = {5,6,2,4,3,1};

        System.out.print("\nThe array before sorting ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        int[] nums1 = bubbleSort(nums, size);

        System.out.print("\nThe array after bubbleSorting ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        int [] nums2 = seletionSort(n1, s1);

        System.out.print("\nThe array after selectionSorting ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }

        int [] nums3 = insertionSort(n2);

        System.out.print("\nThe array after InsertionSort ");
        for (int num : nums3) {
            System.out.print(num + " ");
        }
    }

    }

