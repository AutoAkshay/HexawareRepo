package stringPrograms;

import org.testng.annotations.Test;

public class CountWordsTest {

    @Test
    public void countWordWithoutInBuiltFunctions2() {
        String a = "Hi   This is my   name  Akshay      Kalam";
        int count = 0;
        boolean condition = false;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) != ' ' && !condition) {
                count++;
                condition = true;
            } else if (a.charAt(i) == ' ') {
                condition = false;
            }
        }

        System.out.println("Count of words :: " + count);
    }

    @Test
    public void countWordWithInBuiltFunctions() {
        String a = "Hi   This is my   name  Akshay      Kalam";
        String space = a.replaceAll("\\s+", " ");
        int count = 0;
        for (String str : space.split(" ")) {
            count++;
        }
        System.out.println("Count of words :: " + count);
    }

    @Test
    public void countWordWithInBuiltFunctions2() {
        String a = "Hi   This is my   name  Akshay      Kalam";
        String space = a.replaceAll("\\s+", " ");
        int count = 1;
        for (int i = 1; i < space.length(); i++) {
            if (space.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Count of words :: " + count);
    }
}
