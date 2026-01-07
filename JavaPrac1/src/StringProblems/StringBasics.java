package StringProblems;

import java.util.*;

public class StringBasics {


    public static boolean checkPalindrome(String st) {

        return st.equals(new StringBuilder(st).reverse().toString());

    }

    public static String revString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String revWords(String str){

        ArrayList<String> ls = new ArrayList<>();
        String[] parts = str.split("[. ]");

        for(String s : parts){
           ls.add(s);
        }

        Collections.reverse(ls);

        return String.join(" ",ls);

  }

  public static boolean doesRotate(String str1 , String str2){

        int n = str1.length();

      for (int i = 0; i <n ; i++) {

          if (str1.equals(str2)){
              return true;
          }

          char last = str1.charAt(str1.length()-1);
          str1 = last + str1.substring(0,str1.length()-1);

      }
      return false;


  }

  public static char findFirstNonReapChar(String st){

        char [] ch = st.toCharArray();
        Map<Character , Integer> map = new HashMap<>();

      for (int i = 0; i < ch.length; i++) {
          map.put(ch[i] , map.getOrDefault(ch[i] ,0)+1);
      }

      for(char c : ch){
          if(map.get(c) == 1){
              return c;
          }
      }
        return '$';
  }

  public static int romanToInt(String st){
        /*
        * - "IX" → I (1) before X (10) → subtract → 10 - 1 = 9
          - "XL" → X (10) before L (50) → subtract → 50 - 10 = 40
          - "MCMIV" → M (1000) + CM (900) + IV (4) → 190
        * */
      HashMap<Character, Integer> romanMap = new HashMap<>();
      romanMap.put('I', 1);
      romanMap.put('V', 5);
      romanMap.put('X', 10);
      romanMap.put('L', 50);
      romanMap.put('C', 100);
      romanMap.put('D', 500);
      romanMap.put('M', 1000);

      int res = 0;
      for (int i = 0; i < st.length(); i++) {
          int curr = romanMap.get(st.charAt(i));

          if(i+1 < st.length()){
              int next = romanMap.get(st.charAt(i+1));

              if (curr < next){
                  res  -=curr;
              }else {
                  res += curr;
              }
          }else {
              res +=curr;
          }
      }
      return res;

  }


    public static void main(String[] args) {

        String Name = "ada";
        System.out.println("name: "+ Name + " is Palindrome : "+checkPalindrome(Name));
        String RevName = "Jhon";
        System.out.println("Reversed name : "+revString(RevName));

        String wrd = "Hello every one here";
        System.out.println("Reversed words : "+revWords(wrd));

        String r1 = "aad";
        String  r2 = "ada";

        System.out.println("The words are rotatable : "+ doesRotate(r1,r2));

        String rep1 = "Darshan";
        System.out.println("The first non repeating char is : "+findFirstNonReapChar(rep1));

        String roman = "IX";
        System.out.println("The actual no of roman is : "+ romanToInt(roman));

    }
}
