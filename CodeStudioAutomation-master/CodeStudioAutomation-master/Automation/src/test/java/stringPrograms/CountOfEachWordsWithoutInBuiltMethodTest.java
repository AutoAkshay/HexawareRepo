package stringPrograms;

import org.testng.annotations.Test;

public class CountOfEachWordsWithoutInBuiltMethodTest {

    @Test
    public void tests() {
        String str = "Akshay123 An45il Kalam567 A5657kshay Anil Kalam345 Anil Akshay Akshay      Akshay";
        String number = str.replaceAll("[0-9]", "").trim();
        System.out.println(number);

        String[] split = number.split("\\s+");
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

            System.out.println(split[i] + count);
        }
    }
}
