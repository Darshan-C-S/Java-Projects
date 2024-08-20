package leetCodeAndHackerRank;

public class ValidParantisis {
    public static boolean isValid(String s){
        /*Here checking the corresponding opening and closing brackets using string contains
        method and replacing with empty string , The String will be completely empty if all the condition for opening and
        closing is satisfied
         */
        while (true){
            if(s.contains("()")){
                s= s.replace("()","");
            } else if (s.contains("[]")) {
                s = s.replace("[]","");
            }
            else if(s.contains("{}")){
                s= s.replace("{}","");
            }else {
                return s.isEmpty();
            }

        }
    }

    public static void main(String[] args) {

        String s = "{[()]}{}[]";
        System.out.println(isValid(s));

    }
}
