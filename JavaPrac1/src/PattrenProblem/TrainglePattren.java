package PattrenProblem;

public class TrainglePattren {
    public static void main(String[] args) {
         int no = 5;
        System.out.println("===== Increasing  Triangle  =====");
        for (int i = 0; i < no; i++) {
//            i has rows
//            j has columns
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("===== Decreasing Triangle  =====");

        for (int i = 0; i < no ; i++) {
            for (int j = i; j < no; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===== Left Triangle Star Pattern =====");

        for (int i = 0; i <= no; i++) {
            for (int j = 2*(no -i); j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===== Equilateral triangle Pattern =====");

        for (int i = 0; i <= no; i++) {
            for (int j = (no-i); j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===== Reverse Equilateral triangle Pattern =====");
        for (int i = no; i >0; i--) {
            for (int j = i; j < no; j++) {
                System.out.print(" ");
            }

                for (int j = 1; j <= (2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
