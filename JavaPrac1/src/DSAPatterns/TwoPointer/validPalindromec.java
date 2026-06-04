package DSAPatterns.TwoPointer;

public class validPalindromec {
    public static boolean isPalindrome(String s) {

        char[] ch = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int lftEnd = 0;
        int rigtEnd = ch.length - 1; // use cleaned array length

        while (lftEnd < rigtEnd) {
            if (ch[lftEnd] != ch[rigtEnd]) {
                return false;
            }
            lftEnd++;
            rigtEnd--;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome("CAA"));
        System.out.println(isPalindrome("RAAR"));
    }

}
