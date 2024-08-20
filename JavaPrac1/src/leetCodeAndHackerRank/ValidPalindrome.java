package leetCodeAndHackerRank;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        StringBuffer sb = new StringBuffer(s1).reverse();
        String rev = sb.toString();

        if(s1.equals(rev)){
            return true;
        }
        return false;

    }
}
