package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClearRouteTest {

//    input - abcaba
//
//    output - abcaabbaaa

    @Test
    public void test() {
//    input - abcaba
//
//    output - abcaabbaaa
        String input = "abcaba";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);
            int count = 0;

            for (int j = 0; j <= i; j++) {
                if (input.charAt(j) == current) {
                    count++;
                }
            }

            for (int k = 0; k < count; k++) {
                result.append(current);
            }
        }

        System.out.println(result);

    }

    @Test
    public void test2() {

//        Input: S = "geeksforgeeks" Output: 7 Explanation: "eksforg" is the longest substring with all distinct characters.
        String s = "geeksforgeeks";

        char[] ch = s.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for (char c : ch) {
            set.add(c);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : set) {
            stringBuilder.append(character);
        }

        System.out.println(stringBuilder);

        String string = s.substring(2, 8);

        System.out.println(string);

    }

}
