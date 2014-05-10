package javaapplication164;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication164 {

    public static void main(String[] args) {
        Pattern test = Pattern.compile("[A-Z][a-z]+");
        String rar = "Aaaaaaaaa";
        Matcher test2 = test.matcher(rar);

        if (test2.matches()) {
            System.out.print("true");
        } else {
            System.out.print("F");
        }

    }
}
