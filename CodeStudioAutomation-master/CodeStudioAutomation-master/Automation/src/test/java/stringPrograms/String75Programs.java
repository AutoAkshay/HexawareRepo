package stringPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class String75Programs {

    // String used everywhere
    // "Java is best language good level in Java can benefit"

    // 1. Count total characters with spaces - 52
    @Test
    public void test1() {
        String str = "Java is best language good level in Java can benefit";
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            count++;
        }

        System.out.println(count);
    }

    // 2. Count total characters without spaces - 44
    @Test
    public void test2() {
        String str = "Java is best language good level in Java can benefit".replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            count++;
        }

        System.out.println(count);
    }

    // 3. Count total words - 10
    @Test
    public void test3() {
        String str = "Java is best language good level in Java can benefit";
        boolean condition = false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' & !condition) {
                count++;
                condition = true;
            } else if (str.charAt(i) == ' ') {
                condition = false;
            }
        }

        System.out.println(count);
    }

    // 4. Reverse entire string - tifeneb enac avaJ ni level doog egaugnal tseb si avaJ
    @Test
    public void test4() {
        String str = "Java is best language good level in Java can benefit";
        char[] ch = str.toCharArray();
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = ch.length - 1; i >= 0; --i) {
            builder.append(ch[i]);
        }

        System.out.println(builder);
    }

    // 5. Reverse alternate words - avaJ is tseb language doog level ni Java nac benefit
    @Test
    public void test5() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");

        for (int i = 0; i < split.length; i++) {

            if (i % 2 == 0) {
                char[] ch = split[i].toCharArray();
                for (int j = ch.length - 1; j >= 0; --j) {
                    System.out.print(ch[j]);
                }
            } else {
                System.out.print(split[i]);
            }

            System.out.print(" ");
        }
    }

    // 6. Convert to camelCase - javaIsBestLanguageGoodLevelInJavaCanBenefit
    @Test
    public void test6() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");
        for (String word : split) {

        }
    }

    // 7. Convert to snake_case - Java_is_best_language_good_level_in_Java_can_benefit
    @Test
    public void test7() {
        String str = "Java is best language good level in Java can benefit";
        System.out.println(str.replaceAll(" ", "_"));
    }

    // 8. Convert to kebab-case - Java-is-best-language-good-level-in-Java-can-benefit
    @Test
    public void test8() {
        String str = "Java is best language good level in Java can benefit";
        System.out.println(str.replaceAll(" ", "-"));
    }

    // 9. Capitalize last letter of each word - JavA iS besT languagE gooD leveL iN JavA caN benefiT
    @Test
    public void test9() {
        String str = "Java is best language good level in Java can benefit".toLowerCase();
        String[] split = str.split("\\s+");
        for (String word : split) {
            String modified = word.substring(0, word.length() - 1).toLowerCase() + word.substring(word.length() - 1).toUpperCase();
            System.out.print(modified + " ");
        }
    }

    // 10. Swap first and last word - benefit is best language good level in Java can Java
    @Test
    public void test10() {
        String str = "Java is best language good level in Java can benefit";

        String[] words = str.split("\\s+");

        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;

        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    // 11. Longest word - language
    @Test
    public void test11() {
        String str = "Java is best language good level in Java can benefit";
        String[] words = str.split("\\s+");

        int longLength = Integer.MIN_VALUE;
        String longWord = "";

        for (String word : words) {
            if (word.length() > longLength) {
                longLength = word.length();
                longWord = word;
            }
        }

        System.out.println(longWord + "::" + longLength);
    }

    // 12. Shortest word - is
    @Test
    public void test12() {
        String str = "Java is best language good level in Java can benefit";
        String[] words = str.split("\\s+");

        int minValue = Integer.MAX_VALUE;
        String shortWord = "";

        for (String word : words) {
            if (word.length() < minValue) {
                minValue = word.length();
                shortWord = word;
            }
        }

        System.out.println(shortWord + "::" + minValue);
    }

    // 13. Frequency of each word - Java:2, is:1...
    @Test
    public void test13() {
        String str = "Java is best language good level in Java can benefit";

        String[] split = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : split) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }

    // 14. Duplicate words - Java
    @Test
    public void test14() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");
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

            System.out.println(split[i] + "::" + count);
        }
    }

    // 15. Remove duplicate words - Java is best language good level in can benefit
    @Test
    public void test15() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");
        boolean[] visited = new boolean[split.length];

        for (int i = 0; i < split.length; i++) {
            if (visited[i]) {
                continue;
            }

            for (int j = 0; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {

                    visited[j] = true;
                }
            }

            System.out.print(split[i] + " ");
        }
    }

    // 16. Unique words - is,best,language,good,level,in,can,benefit
    @Test
    public void test16() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");
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

            if (count == 1) {

                System.out.println(split[i] + "::" + count);
            }
        }
    }

    // 17. Sort words by length

    StringBuilder builder = new StringBuilder();

    @Test
    public void test17() {
        String str = "Java is best language good level in Java can benefit";

        String[] split = str.split("\\s+");

        List<String> list = new ArrayList<>(Arrays.asList(split));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() == o2.length()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        for (String sort : list) {
            System.out.print(sort + " ");
        }
    }

    // 18. Sort alphabetically
    @Test
    public void test18() {
        String str = "Java is best language good level in Java can benefit".toLowerCase();

        String[] split = str.split("\\s+");

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                if (split[i].compareTo(split[j]) < 0) {
                    String temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }
        }

        for (String word : split) {
            System.out.println(word);
        }
    }

    // 19. Words length >4 - language,level,benefit
    @Test
    public void test19() {
        String str = "Java is best language good level in Java can benefit";

        String[] split = str.split("\\s+");

        for (String word : split) {
            if (word.length() > 4) {
                System.out.println(word);
            }
        }


    }

    // 20. Replace good with excellent
    @Test
    public void test20() {
        String str = "Java is best language good level in Java can benefit good";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            if (i <= str.length() - "good".length() && str.substring(i, i + "good".length()).equalsIgnoreCase("good")) {
                builder.append("excellent");
                i = i + "good".length();
            } else {
                builder.append(str.charAt(i));
                i++;
            }
        }
        System.out.println(builder);
    }

    // 21. Frequency of each character
    @Test
    public void test21() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
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

            System.out.println(ch[i] + "" + count);
        }
    }

    // 22. Duplicate characters
    @Test
    public void test22() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
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
            if (count > 1) {
                System.out.println(ch[i] + "" + count);
            }
        }
    }

    // 23. Unique characters
    @Test
    public void test23() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
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
            if (count == 1) {
                System.out.println(ch[i] + "" + count);
            }
        }
    }

    // 24. Highest occurring character - a
    @Test
    public void test24() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
        int max = Integer.MIN_VALUE;
        boolean[] visited = new boolean[ch.length];
        char c = 0;
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

            if (count > max) {
                max = count;
                c = ch[i];
            }
        }

        System.out.println(c + "::" + max);
    }

    // 25. Lowest occurring character
    @Test
    public void test25() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
        int minValue = Integer.MAX_VALUE;
        boolean[] visited = new boolean[ch.length];
        char c = 0;
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

            if (count < minValue) {
                minValue = count;
                c = ch[i];
            }
        }

        System.out.println(c + "::" + minValue);
    }

    // 26. First non repeating character
    @Test
    public void test26() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();

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

            if (count == 1) {
                System.out.println(ch[i] + "::" + count);
                break;
            }
        }


    }

    // 27. Last non repeating character
    @Test
    public void test27() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();

        boolean[] visited = new boolean[ch.length];

        for (int i = ch.length - 1; i >= 0; --i) {
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

            if (count == 1) {
                System.out.println(ch[i] + "::" + count);
                break;
            }
        }


    }

    // 28. Count vowels - 17
    @Test
    public void test28() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                builder.append(c);
            }
        }

        System.out.println(builder.length());
    }

    // 29. Count consonants - 27
    @Test
    public void test29() {
        String str = "Java is best language good level in Java can benefit".toLowerCase().replaceAll("\\s+", "");
        char[] ch = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                builder.append(c);
            }
        }

        System.out.println(builder.length());
    }

    // 30. Replace vowels with *
    @Test
    public void test30() {
        String str = "Java is best language good level in Java can benefit";
        char[] ch = str.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = '*';
                System.out.print(c);
            } else {
                System.out.print(c);
            }
        }

        System.out.println(builder.toString());
    }

    // 31. First index of Java - 0
    @Test
    public void test31() {
        String str = "Java is best language good level in Java can benefit";
        for (int i = 0; i <= str.length() - "java".length(); i++) {
            if (str.substring(i, i + "java".length()).equalsIgnoreCase("java")) {
                System.out.println(i);
                break;
            }
        }
    }

    // 32. Last index of Java - 31
    @Test
    public void test32() {
        String str = "Java is best language good level in Java can benefit";
        for (int i = str.length() - "java".length(); i >= 0; --i) {
            if (str.substring(i, i + "java".length()).equalsIgnoreCase("java")) {
                System.out.println(i);
                break;
            }
        }
    }

    // 33. All indexes of 'a'
    @Test
    public void test33() {
        String str = "Java is best language good level in Java can benefit";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                System.out.println(i);
            }
        }
    }

    // 34. Index of level
    @Test
    public void test34() {
        String str = "Java is best language good level in Java can benefit";
        for (int i = 0; i <= str.length() - "level".length(); i++) {
            if (str.substring(i, i + "level".length()).equalsIgnoreCase("level")) {
                System.out.println(i);
                break;
            }
        }
    }

    // 35. Middle character
    @Test
    public void test35() {
        String str = "Java is best language good level in Java can benefit".replaceAll("\\s+", "");
        char[] ch = str.toCharArray();

        int middle = ch.length / 2;
        System.out.println(ch[middle]);

    }

    // 36. Every 3rd character
    @Test
    public void test36() {
        String str = "Java is best language good level in Java can benefit";

        for (int i = 2; i < str.length(); i += 3) {
            System.out.println(str.charAt(i));
        }
    }

    // 37. Remove even index chars
    @Test
    public void test37() {
        String str = "Java is best language good level in Java can benefit";
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                System.out.print(ch[i]);
            }
        }
    }

    // 38. Insert very after best
    @Test
    public void test38() {
        String str = "Java is best language good level in Java can benefit";
        String[] split = str.split("\\s+");
        StringBuilder builder = new StringBuilder();

        for (String word : split) {
            if (word.equalsIgnoreCase("best")) {
                word = "best very";
                builder.append(word + " ");
            } else {
                builder.append(word + " ");
            }
        }

        System.out.println(builder);
    }

    // 39. Split into two halves
    @Test
    public void test39() {
        String str = "Java is best language good level in Java can benefit";
        int half = str.length() / 2;

        String firstHalf = str.substring(0, half);
        String secondHalf = str.substring(half);
        System.out.println(firstHalf);
        System.out.println(secondHalf);

    }

    // 40. Left rotate by 3
    @Test
    public void test40() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 41. Print all substrings
    @Test
    public void test41() {
        String str = "Java is best language good level in Java can benefit";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        for (String sub : list) {
            System.out.println(sub);
        }
    }

    // 42. Count substrings
    @Test
    public void test42() {
        String str = "Java is best language good level in Java can benefit";

        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 43. Substrings starting with l
    @Test
    public void test43() {
        String str = "Java is best language good level in Java can benefit";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        for (String sub : list) {

            if (sub.charAt(0) == 'l' && !sub.isEmpty()) {
                System.out.println(sub);
            }
        }
    }

    // 44. Substrings ending with t
    @Test
    public void test44() {
        String str = "Java is best language good level in Java can benefit";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        for (String sub : list) {

            if (!sub.isEmpty() && sub.charAt(sub.length() - 1) == 't') {
                System.out.println(sub);
            }
        }
    }

    // 45. Count substring an
    @Test
    public void test45() {
        String sub = "Java is best language good level in Java can benefit";

        int count = 0;
        for (int i = 0; i <= sub.length() - "an".length(); i++) {
            if (sub.substring(i, i + "an".length()).equalsIgnoreCase("an")) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 46. Remove level
    @Test
    public void test46() {
        String sub = "Java is best language good level in Java can benefit";
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < sub.length(); i++) {
            if (i <= sub.length() - "level".length() && sub.substring(i, i + "level".length()).equalsIgnoreCase("level")) {
                i = i + "level".length() - 1;
            } else {
                builder.append(sub.charAt(i));
            }
        }

        System.out.println(builder);
    }

    // 47. Longest substring without repeat
    @Test
    public void test47() {
        String str = "Java is best language good level in Java can benefit";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        String longSub = "";
        for (String sub : list) {
            boolean condition = true;
            for (int i = 0; i < sub.length(); i++) {
                for (int j = i + 1; j < sub.length(); j++) {
                    if (sub.charAt(i) == sub.charAt(j)) {
                        condition = false;
                        break;
                    }
                }

                if (!condition) {
                    break;
                }
            }

            if (condition && sub.length() > longSub.length()) {
                longSub = sub;
            }
        }

        System.out.println(longSub);
    }

    // 48. Smallest substring containing Java
    @Test
    public void test48() {
        String str = "Java is best language good level in Java can benefit";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        String shortSub = "";
        int minLength = Integer.MAX_VALUE;
        for (String sub : list) {
            if (sub.contains("Java")) {

                if (sub.length() < minLength) {
                    minLength = sub.length();
                    shortSub = sub;
                }
            }
        }
        System.out.println(shortSub);
    }

    // 49. Count distinct substrings
    @Test
    public void test49() {
        String str = "Java is best language good level in Java can benefit";

        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        for (String word : set) {
            System.out.println(word);
        }
    }


    // 50. Highest repeating substring
    @Test
    public void test50() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 51. Palindrome words - level
    @Test
    public void test51() {
        String[] split = "Java is best language good level in Java can benefit".split("\\s+");
        for (String str : split) {
            boolean condition = true;
            for (int i = 0; i < str.length(); i++) {
                int left = 0;
                int right = str.length() - 1;

                while (right > left) {
                    if (str.charAt(left) != str.charAt(right)) {
                        condition = false;
                        break;
                    }
                    left++;
                    right--;
                }
            }

            if (condition && str.length() > 1) {
                System.out.println(str);
            }

        }
    }

    // 52. Count palindromic substrings
    @Test
    public void test52() {
        String string = "Java is best language good level in Java can benefit";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        }

        int count = 0;
        for (String str : list) {
            boolean condition = true;

            int left = 0;
            int right = str.length() - 1;

            while (right > left) {
                if (str.charAt(left) != str.charAt(right)) {
                    condition = false;
                    break;
                }
                left++;
                right--;
            }


            if (condition && str.length() > 1) {
                System.out.println(str);
                count++;
            }

        }

        System.out.println(count);
    }

    // 53. Longest palindrome - level
    @Test
    public void test53() {
        String string = "Java is best language good level in Java can benefit";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        }

        String maxLenWord="";
        for (String str : list) {
            boolean condition = true;

            int left = 0;
            int right = str.length() - 1;

            while (right > left) {
                if (str.charAt(left) != str.charAt(right)) {
                    condition = false;
                    break;
                }
                left++;
                right--;
            }


            if (condition && str.length() > 1 && str.length() > maxLenWord.length()) {
                maxLenWord=str;
            }

        }

        System.out.println(maxLenWord);
    }

    // 54. Full string palindrome - false
    @Test
    public void test54() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 55. Remove palindromes
    @Test
    public void test55() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 56. Longest word with unique chars
    @Test
    public void test56() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 57. Minimum window benefit
    @Test
    public void test57() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 58. Max consecutive vowels
    @Test
    public void test58() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 59. First repeated substring
    @Test
    public void test59() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 60. Rotation check avaJ - true
    @Test
    public void test60() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 61. Full anagram check - true
    @Test
    public void test61() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 62. All rotations
    @Test
    public void test62() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 63. Smallest rotation
    @Test
    public void test63() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 64. Group anagrams
    @Test
    public void test64() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 65. Any two anagram words
    @Test
    public void test65() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 66. Run length encoding
    @Test
    public void test66() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 67. Character compression
    @Test
    public void test67() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 68. Remove consecutive duplicates
    @Test
    public void test68() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 69. Encode vowels
    @Test
    public void test69() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 70. Decode vowels
    @Test
    public void test70() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 71. Normalize spaces
    @Test
    public void test71() {
        String str = "Java is best language good level in Java can benefit";
    }

    // 72. Mask Java
    @Test
    public void test72() {
        String str = "Java is best language good level in Java can benefit".toLowerCase();
        char[] ch=str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='j' && ch[i+1]=='a' && ch[i+2]=='v' && ch[i+3]=='a'){
                ch[i]='*';
                ch[i+1]='*';
                ch[i+2]='*';
                ch[i+3]='*';

                i = i + 3;
            }
        }

        System.out.println(ch);

    }

    // 73. Extract alphabets only
    @Test
    public void test73() {
        String str = "Java 345is best language 45435 good level in Ja234va can ben123efit";
        System.out.println(str.replaceAll("[0-9]","").replaceAll("\\s+"," ").trim());
    }

    // 74. Words starting with vowel
    @Test
    public void test74() {
        String str = "Java is best language good level in Java can benefit";

    }

    // 75. Convert to JSON
    @Test
    public void test75() {
        String str = "Java is best language good level in Java can benefit";
    }

}