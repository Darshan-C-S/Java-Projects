package Recursion;

public class Febonochee {

public static int feb(int n){
    if(n==0)return 0;
    if(n==1 || n ==2) return 1;
    return feb(n-1)+feb(n-2);
}
    public static int feb2(int n){
        int a =0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a+b;
            a=b;
            b=c;
        }
        return a;
    }
    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i < n; i++) {
//            System.out.println(feb(i));
            System.out.println(feb2(i));
        }

    }
}
