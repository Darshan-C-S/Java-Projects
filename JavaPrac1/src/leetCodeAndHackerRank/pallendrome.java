package leetCodeAndHackerRank;

public class pallendrome {
    public static void pallend(String a){
        StringBuilder sb = new StringBuilder(a);
        // StringBuffer is thread-safe and synchronized whereas StringBuilder is not
        String rev = sb.reverse().toString();
        if(rev.contentEquals(a) ){
            System.out.println("Its palindrome ");
        }else {
        System.out.println("Its not palindrome ");
    }
    }
    public static void removeTrailingspace(String s){
        StringBuffer sb = new StringBuffer();
        char []ch = s.toCharArray();
        for (char c : ch){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {

        String a = "CSC";
        System.out.println("--- Checking Palindrome --- ");
        pallend(a);
        System.out.println("--- Removing whitespaces  --- ");
        String b= "A A CC IT ONAM I";
        removeTrailingspace(b);



   }
}
