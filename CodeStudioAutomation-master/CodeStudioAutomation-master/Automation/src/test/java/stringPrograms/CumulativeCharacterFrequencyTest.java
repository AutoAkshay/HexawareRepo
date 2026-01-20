package stringPrograms;

import org.testng.annotations.Test;

public class CumulativeCharacterFrequencyTest {
//    output - abcaabbaaa

    @Test
    public void tests() {
        String input = "abcaba";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;
            for (int j = 0; j <=i; j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }
            for (int k = 0; k < count; k++) {
                builder.append(ch);
            }

        }

        System.out.println(builder);
    }
}
