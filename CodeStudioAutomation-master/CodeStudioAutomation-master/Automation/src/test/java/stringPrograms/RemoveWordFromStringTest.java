package stringPrograms;

import org.testng.annotations.Test;

@Test
public class RemoveWordFromStringTest {
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
