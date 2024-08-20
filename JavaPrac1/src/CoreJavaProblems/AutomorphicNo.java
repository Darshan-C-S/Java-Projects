package CoreJavaProblems;

public class AutomorphicNo {

    public static boolean Automorphic(int n){
        int sq = n*n;
        while (n>0){
            if(n%10 != sq%10){
//                to be atomic no the sq%10 and n%10 are equal
                return false;
            }
            n = n/10;
            sq = sq/10;
        }
        return true;

    }
    public static void main(String[] args) {

        System.out.println(Automorphic(5));
        System.out.println(Automorphic(7));


    }
}
