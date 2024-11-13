package Recursion;

public class Febonochee {

    public static int feb(int count){
        if(count==0) return 0;
        if(count ==1 || count == 2) return 1;
        return feb(count-2)+feb(count-1);

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
            System.out.println(feb(i));
            System.out.println(feb2(i));
        }

    }
}
