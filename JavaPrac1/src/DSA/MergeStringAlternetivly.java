package DSA;

public class MergeStringAlternetivly {
    public static String mergeAlternately(String word1, String word2) {

      StringBuilder res = new StringBuilder();

      int i = 0;

      while (i<word1.length() || i<word2.length()){
          if(i<word1.length()){
              res.append(word1.charAt(i));
          }
          if(i<word2.length()){
              res.append(word2.charAt(i));
          }
          i++;
      }
      return res.toString();

    }

    public static void main(String[] args) {

        String a = "AAAA";
        String b = "BBBB";
        String c = mergeAlternately(a,b);

        System.out.println(c);


    }
}
