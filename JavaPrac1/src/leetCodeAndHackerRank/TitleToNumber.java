package leetCodeAndHackerRank;

public class TitleToNumber {
    public static int titleToNumber(String title){
        int res = 0;
        for( char cha : title.toCharArray()){

            res = res * 26 +(cha - 'A'+1);
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(titleToNumber("AA"));

    }
}
