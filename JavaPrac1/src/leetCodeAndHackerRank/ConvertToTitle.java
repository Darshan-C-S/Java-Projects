package leetCodeAndHackerRank;

public class ConvertToTitle {
    public static String convertToTitle(int columnNo){
        StringBuilder res = new StringBuilder();

        while (columnNo > 0){
            columnNo--;
            res.append((char)(columnNo % 26 + 'A'));
            columnNo /= 26;
        }
        return res.reverse().toString();





    }
    public static void main(String[] args) {



    }

}
