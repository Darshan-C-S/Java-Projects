package DSAPatterns.String;

public class FirstUniqueCharString {

    public int firstUniqChar(String s) {

        if(s.length() == 0){
            return -1;
        }

        for (int i = 0; i <s.length() ; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

    }
}
