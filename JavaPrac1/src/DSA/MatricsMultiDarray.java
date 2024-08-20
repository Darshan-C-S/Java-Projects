package DSA;

public class MatricsMultiDarray {
    public static void main(String[] args) {

        int Marr[][] = new int[3][4];
        int res[];

        for (int i = 0; i<3;i++){
            for (int j=0; j<4;j++){
                Marr[i][j] = (int)(Math.random() *100) +1;
                System.out.print(Marr[i][j] + " ");
            }
            System.out.println();
        }
//        enhanced for loop
        System.out.println("====== enhanced for loop =======");
        for(int []n : Marr){
            for(int m : n){
                m = (int)(Math.random()*10)+1;
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of two matrices are : ");

        int sum[][] = new int[3][4];
        for(int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<4 ;j++){
              sum[i][j] = Marr[i][j]+Marr[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of two matrices are : ");
        int mul[][] = new int[3][4];
        for (int i = 0 ; i< 3 ; i++){
            for (int j = 0 ; j<4; j++){
                mul[i][j] = Marr[i][j] *Marr[i][j];
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

    }
}
