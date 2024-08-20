package CoreJavaProblems;

public class CheckVovelsString{

    public static void countAndPrintVovels(String s){

        String a  = s.toUpperCase();
        char[] ch = a.toCharArray();
        StringBuffer vov = new StringBuffer();
        int count = 0;

        for(int i=0; i<ch.length ; i++){
            if(ch[i] =='A'||ch[i]== 'E'||ch[i]=='I'||ch[i] == 'O'||ch[i] =='U' ){
                ++count;
                vov.append(ch[i]);
            }
        }
        System.out.println("Vovels : " + new String(vov));
        System.out.println("Count : "+count);
    }

    public static void main(String[] args){
        String s = "AuerrsIoa";
        countAndPrintVovels(s);
    }
}
