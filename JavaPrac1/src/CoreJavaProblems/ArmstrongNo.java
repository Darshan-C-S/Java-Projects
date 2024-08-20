package CoreJavaProblems;

import java.util.Scanner;

public class ArmstrongNo {
    public static boolean checkArmstong(int n){

        int temp , digits = 0,last = 0, sum = 0;

        temp = n;
//       below is to calculate the no of digits to raise the power
        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp = n;

//       To calculate the Armstrong No
        while (temp>0){
            last = temp%10;
            sum += (Math.pow(last , digits));
            temp = temp/10;
        }

        if (n == sum) return true;

        else return false;


    }

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
//reads the limit from the user
        num=sc.nextInt();
        System.out.println("Armstrong Number up to "+ num + " are: ");
        for(int i=10; i<=num; i++){
//function calling
            if(checkArmstong(i)){
//prints the armstrong numbers
                System.out.print(i+ ", ");
    }}}
}






