package ArraysList;

public class ArrayAvg {

//    Find the avrage of given array of elements
     public static void AvgArr(int [] arr){

         double sum = 0 ;

         for(int i = 0;i< arr.length ; i++){
             sum =  sum + arr[i];
         }
         double avg  = sum / arr.length;

         System.out.println(" The average of the list is : "+avg);


     }

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5,6};
        AvgArr(arr);



    }
}
