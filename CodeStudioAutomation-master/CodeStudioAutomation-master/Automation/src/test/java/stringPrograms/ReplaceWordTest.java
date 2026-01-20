package stringPrograms;

import org.testng.annotations.Test;

public class ReplaceWordTest {
    @Test
    public void statement7() {

        String str = "javaSpringjavaHibernatejava";
        String replace = "java";
        String with = "Akshay";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); ) {

            if (str.substring(i, i + replace.length()).equalsIgnoreCase(replace)) {
                builder.append(with);
                i = i + replace.length();
            } else {
                builder.append(str.charAt(i));
                i++;
            }

        }

        System.out.println(builder);
    }
}
