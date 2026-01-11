package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class PalindromeDemo {

    @Test
    public void palindrome() {
        String string = "Madam";
        char[] ch = string.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            builder.append(ch[i]);
        }
        if (string.equalsIgnoreCase(builder.toString())) {
            System.out.println("It is palindrome word");
        } else {
            System.out.println("It is not palindrome");
        }
    }

    @Test
    public void palindrome2() {
        String string = "Madam";
        char[] ch = string.toLowerCase().toCharArray();
        int index = 0;

        for (int i = ch.length - 1; i >= 0; i--) {
            if (string.charAt(index) == ch[i]) {
                index++;
            } else {
                System.out.println("It is not palindrome");
                break;
            }
        }

    }
}
