package leetCodeAndHackerRank;

import java.util.Scanner;

public class HA_EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        int i = 1;
        System.out.println("Enter The Lines : ");
        while (in.hasNext()){
            line = in.nextLine();
            System.out.println(i + " "+line);
            i++;
        }

    }
}
