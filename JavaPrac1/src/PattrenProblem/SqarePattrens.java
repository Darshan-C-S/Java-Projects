package PattrenProblem;

public class SqarePattrens {
    public static void squarePattern(int n){
        for (int i = 0; i <n ; i++) {
            //            i have rows no and j is used to tell ho many characters have to be filled
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        squarePattern(5);
    }
}
