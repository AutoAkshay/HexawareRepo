package stringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringTest {
    @Test
    void test(){
        String str = "geeksforgeeks";

        List<String> list = new ArrayList<>();

        // Generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        String longestString = "";

        for (String substring : list) {
            boolean condition = true;

            // Check duplicate characters
            for (int i = 0; i < substring.length(); i++) {
                for (int j = i + 1; j < substring.length(); j++) {   // FIX #1
                    if (substring.charAt(i) == substring.charAt(j)) {
                        condition = false;
                        break;
                    }
                }
                if (!condition) break;
            }

            // FIX #2 (moved outside inner loops)
            if (condition && substring.length() > longestString.length()) {
                longestString = substring;
            }
        }

        System.out.println(longestString);
    }
}
