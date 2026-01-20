package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.*;

final class Testing {

    String str = "Akshay";

}

public class Word {

    @Test
    public void statement1() {
//        6. Check if a substring exists (without using contains())
        String str= "javaSpringjavaHibernatejava";
        String replace="java" ;
        int count=0;

        for (int i = 0; i <=str.length()-replace.length();i++ ) {

            if (str.substring(i, i + replace.length()).equalsIgnoreCase(replace)) {
                count++;
            }

        }

        System.out.println("Count of java word::"+count);
    }

    @Test
    public void statement6() {
//        6. Check if a substring exists (without using contains())
        String string = "AutomationTesting";
        String target = "Testing";
        boolean found=false;

        for (int i = 0; i <=string.length()-target.length(); i++) {
            if(string.substring(i,i+target.length()).equalsIgnoreCase(target)){
                found=true;
            }

        }
        System.out.println(found);
    }

    @Test
    public void statement7() {
//        7. Replace all occurrences of a substring
        String str= "javaSpringjavaHibernatejava";
        String replace="java" ;
        String with="Akshay";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <str.length();) {

            if (str.substring(i, i + replace.length()).equalsIgnoreCase(replace)) {
                builder.append(with);
                i=i+replace.length();
            }

            else {
                builder.append(str.charAt(i));
                i++;
            }

        }

        System.out.println(builder);
    }

    @Test
    public void statement9() {
//        9. Count overlapping substrings
        String string = "aaaa";
        String target = "aa";
        int count=0;

        for (int i = 0; i <=string.length()-target.length(); i++) {
            if(string.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }

        }
        System.out.println("count of substring :: "+count);
    }

    @Test
    public void statement10() {
//        10. Remove a substring from a string
        String string = "JavaIsVeryJavaPowerful";
        String target = "Java";

        StringBuilder builder = new StringBuilder();


        for (int i = 0; i <= string.length() - target.length(); ) {

            if (string.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                i = i + target.length();   // move past "Java"
            } else {
                builder.append(string.charAt(i));
                i++;
            }
        }


        System.out.println(builder.toString());

    }
}
