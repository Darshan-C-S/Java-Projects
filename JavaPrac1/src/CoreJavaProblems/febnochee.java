package CoreJavaProblems;



public class febnochee {
    public static void feb(int n){
        int a = 0;
        int b =1;
        int c;
        System.out.println("The febanoche series is :");
        for(int i =0;i<n;i++){
            c = a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }

//    public static int febrec(int count){
//        if (count <= 1)
//            return count;
//
//        return febrec(count - 1) + febrec(count - 2);
//    }

    public static int febrec(int n){
        if(n<=1){
            return n;
        }
        if (n==2) return 2;
        return febrec(n-1) + febrec(n-2);

    }

    public static void main(String[] args) {
//        Without Recursion
        feb(11);

//        With recursion
        int seqLength = 11;

        for (int i = 0; i < seqLength; i++) {
            System.out.print(febrec(i) +" ");
        }

    }
}
