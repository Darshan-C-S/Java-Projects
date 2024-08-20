package CoreJavaProblems;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormats {
    public static void main(String[] args) {
        double mony = 1000000000.5343;
        NumberFormat n = NumberFormat.getCurrencyInstance(new Locale("en","In"));
        NumberFormat n1  = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String ind = n.format(mony);
        String us = n1.format(mony);
        String uk  = n2.format(mony);
        String french = n3.format(mony);
        System.out.println("Indian : "+ind+" , American : "+us +" , UK : "+uk + " , French : "+french);


    }
}
