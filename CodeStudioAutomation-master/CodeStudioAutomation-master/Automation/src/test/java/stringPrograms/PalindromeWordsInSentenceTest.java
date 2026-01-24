package stringPrograms;

import org.testng.annotations.Test;

public class PalindromeWordsInSentenceTest {

    @Test
    public void palindromeOfIndividualWord() {
        String input = "Java Is Very Java Powerful Java level dad";

        String[] split = input.split("\\s+");
        for (int i = 0; i < split.length; i++) {

            int left=0;
            int right=split[i].length()-1;
            boolean condition=true;
            while(right>left) {
                if (split[i].charAt(left) != split[i].charAt(right)) {
                    condition=false;
                    break;
                }

                left++;
                right--;
            }
            if(condition && split[i].length()>1) {
                System.out.println(split[i]);
            }
        }


    }
}
