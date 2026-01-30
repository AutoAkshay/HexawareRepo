package stringPrograms.lamdaExpressions;

import java.util.Arrays;

public class ReverseEachWordOfString {

    public static void main(String[] args) {
        String str="Akshay Anil Kalam";

        Arrays.stream(str.split("\\s+")).map(word->new StringBuilder(word).reverse().toString()).forEach(name-> System.out.println(name));

    }
}
