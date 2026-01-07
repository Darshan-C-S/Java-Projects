package ArraysList;

import java.util.HashMap;
import java.util.Map;

public class StringInternExample {

        public static void main(String args[])
        {
//            String str1 = "Python";
//            String str2 = "Data Science";
//            String str3 = "Python";
//            String str4 = "C";
//            String str5 = new String ("Java");
//            String str6 = new String ("C++");
//            String str7 = new String ("Data Science");
//            String str8 = new String ("C").intern();
//            System.out.println(str1 == str5);//false
//            System.out.println(str2 == str7); // false
//            System.out.println(str4 == str8); // true

            String val = "adcbcab";
//            a=2
//            d=1
//            c=2
//            b=1

            Map<Character ,  Integer> map =  new HashMap<>();

            char [] ch =  val.toCharArray();

            for (int i = 0; i <ch.length ; i++) {
                map.put(ch[i], map.getOrDefault(ch[i] , 0 )+1);
            }

            System.out.println(map);





        }
    }
