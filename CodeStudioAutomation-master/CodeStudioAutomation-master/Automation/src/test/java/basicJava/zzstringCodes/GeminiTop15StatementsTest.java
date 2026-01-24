package basicJava.zzstringCodes;


import org.testng.annotations.Test;

public class GeminiTop15StatementsTest {

    //    Count total number of words in the sentence
    @Test
    public void test1() {
        String input = "Java is development language Java can develop anything";
        boolean condition = false;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != ' ' && !condition) {
                count++;
                condition = true;
            } else if (input.charAt(i) == ' ') {
                condition = false;
            }

        }

        System.out.println("Count of words :: " + count);

    }

    //    Count total characters (with and without spaces)
    @Test
    public void test2() {
        String input = "Java is development language Java can develop anything";
        char[] ch = input.replaceAll("\\s+", "").toCharArray();
        int count = 0;
        for (char c : ch) {
            count++;
        }

        System.out.println("Count of characters :: " + count);
    }

    //    Count frequency of each word
    @Test
    public void test3() {
        String input = "Java is development language Java can develop anything";
        String[] str = input.split("\\s+");
        boolean[] visited = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length; j++) {
                if (str[i].equalsIgnoreCase(str[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str[i] + "::" + count);
        }

    }

    //	4.	Count frequency of each character
    @Test
    public void test4() {
        String input = "Java is development language Java can develop anything"
                .toLowerCase().replaceAll("\\s+", "");
        int[] count = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count[c]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.print((char) i + "" + count[i]);
            }
        }
    }

    //5.	Find duplicate words
    @Test
    public void test5() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.split("\\s+");

        boolean[] visited = new boolean[split.length];

        for (int i = 0; i < split.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count >= 2) {

                System.out.println(split[i] + "::" + count);
            }
        }
    }

    //6.	Find unique words
    @Test
    public void test6() {
        String input = "Java is development language Java can develop anything";

        char[] ch = input.replaceAll("\\s+", "").toCharArray();
        boolean[] visited = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count < 2) {
                System.out.println(ch[i] + "::" + count);
            }
        }
    }

    //7.	Find duplicate characters
    @Test
    public void test7() {
        String input = "Java is development language Java can develop anything";
        String space = input.replaceAll("\\s+", "").toLowerCase();

        int[] count = new int[256];

        for (int i = 0; i < space.length(); i++) {
            char c = space.charAt(i);
            count[c]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                System.out.println((char) i + "" + count[i]);
            }
        }
    }

    //8.	Print words that occur more than once
    @Test
    public void test8() {
        String input = "Java is development language Java can develop anything";

        String[] split = input.split("\\s+");

        boolean[] visited = new boolean[split.length];

        for (int i = 0; i < split.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count >= 2) {
                System.out.println(split[i] + "::" + count);
            }
        }
    }

    //    9.	Find longest word
    @Test
    public void test9() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.split("\\s+");
        int max = Integer.MIN_VALUE;
        String longWord = "";
        for (String str : split) {
            if (str.length() > max) {
                max = str.length();
                longWord = str;
            }
        }

        System.out.println(longWord + "::" + max);
    }

    //    Find shortest word
    @Test
    public void test10() {
        String input = "Java is development language Java can develop anything";

        String[] split = input.split("\\s+");
        int min = Integer.MAX_VALUE;
        String longWord = "";
        for (String str : split) {
            if (str.length() < min) {
                min = str.length();
                longWord = str;
            }
        }

        System.out.println(longWord + "::" + min);
    }

    //    Check how many times word “Java” appears
    @Test
    public void test11() {
        String input = "Java is development language Java can develop anything";
        int count = 0;
        for (int i = 0; i <= input.length() - "java".length(); i++) {
            if (input.substring(i, i + "java".length()).equalsIgnoreCase("java")) {
                count++;
            }
        }

        System.out.println(count);
    }

    //12.	Replace “Java” with another word (e.g., Python)
    @Test
    public void test12() {
        String input = "Java is development language Java can develop anything";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); ) {
            if (i <= input.length() - "java".length() && input.substring(i, i + "java".length()).equalsIgnoreCase("java")) {
                builder.append("Python");
                i = i + "java".length();
            } else {
                builder.append(input.charAt(i));
                i++;
            }
        }

        System.out.println(builder);
    }

    //	13.	Remove duplicate words from sentence
    @Test
    public void test13() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.split("\\s+");
        boolean[] visited = new boolean[split.length];

        for (int i = 0; i < split.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    count++;
                    visited[j] = true;
                }
            }


            System.out.print(split[i] + " ");

        }
    }

    //14.	Reverse the entire sentence
    @Test
    public void test14() {
        String input = "Java is development language Java can develop anything";
        char[] ch = input.toCharArray();

        for (int i = ch.length - 1; i >= 0; --i) {
            System.out.print(ch[i]);
        }
    }

    //15.	Reverse each word individually
    @Test
    public void test15() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.split("\\s+");
        for (String str : split) {
            char[] ch = str.toCharArray();

            for (int i = ch.length - 1; i >= 0; --i) {
                System.out.print(ch[i]);
            }

            System.out.print(" ");
        }
    }

    //	16.	Print words starting with capital letter
    @Test
    public void test16() {
        String input = "Java is development language Java can develop anything";
        String[] string = input.split("\\s+");
        String finalSentence = "";
        for (String str : string) {
            finalSentence = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.print(finalSentence + " ");
        }


    }

    //	17.	Sort words alphabetically
    @Test
    public void test17() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.toLowerCase().split("\\s+");

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if (split[i].compareToIgnoreCase(split[j]) < 0) {
                    String temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }

        }

        for (String sort : split) {
            System.out.println(sort);
        }
    }

    //	18.	Convert sentence to CSV format
    @Test
    public void test18() {
        String input = "Java is development language Java can develop anything";
        String csv = input.replaceAll("\\s+", ",");
        System.out.println(csv);
    }

    //19.	Check if sentence contains all unique words
    @Test
    public void test19() {
        String input = "Java is development language Java can develop anything";
        String[] split = input.split("\\s+");
        boolean[] visited = new boolean[split.length];
        boolean condition = true;
        for (int i = 0; i < split.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count >= 2) {
                condition = false;
            }
        }

        System.out.println(condition);
    }

    //    	20.	Find index positions where word “Java” occurs
    @Test
    public void test20() {
        String input = "Java is development language Java can develop anything";
        String csv = input.replaceAll("\\s+", ",");
        System.out.println(csv);
    }

    //    Count vowels and consonants
    @Test
    public void test21() {
        String input = "Java is development language Java can develop anything";

        char[] ch = input.replaceAll("\\s+", "").toLowerCase().toCharArray();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonant = new StringBuilder();

        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.append(c);
            } else {
                consonant.append(c);
            }
        }

        System.out.println(consonant.length());
        System.out.println(vowels.length());
    }

    //	22.	Count uppercase and lowercase letters
    @Test
    public void test22() {
        String input = "Java is development language Java can develop anything";

        char[] ch = input.toCharArray();

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                upper.append(c);
            } else {
                lower.append(c);
            }
        }

        System.out.println(upper);
        System.out.println(lower);
    }

    //    23.	Remove a specific word (“can”)
    @Test
    public void test23() {
        String input = "Java is development language Java can develop anything";
        char[] ch = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); ) {

            if (i<=input.length()-"can".length() && input.substring(i, i + "can".length()).equalsIgnoreCase("can")) {
                i = i + "can".length();
            } else {
                builder.append(input.charAt(i));
                i++;
            }
        }

        System.out.println(builder);
    }

    //24.	Convert sentence to Title Case
    @Test
    public void test24() {
        String input = "Java is development language Java can develop anything";

        String[] split = input.split("\\s+");
        for (String str : split) {
            String title = str.substring(0, 1).toUpperCase() + str.toLowerCase().substring(1);

            System.out.print(title + " ");
        }
    }

    //	25.	Find palindrome words (if any)
    @Test
    public void test25() {
        String input = "Java is development level language Java dad can develop anything";
        String[] split = input.split("\\s+");

        for (int i = 0; i < split.length; i++) {
            int left = 0;
            int right = split[i].length() - 1;
            boolean condition = true;
            while (right > left) {
                if (split[i].charAt(left) != split[i].charAt(right)) {
                    condition = false;
                    break;
                }

                left++;
                right--;
            }

            if (condition && split[i].length() > 1) {
                System.out.println(split[i]);
            }
        }
    }

}