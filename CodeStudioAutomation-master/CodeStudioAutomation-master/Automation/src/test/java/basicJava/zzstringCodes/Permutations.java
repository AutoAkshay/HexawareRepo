package basicJava.zzstringCodes;

public class Permutations {

    public static void main(String[] args) {
        String str = "Akshay";
        printPermutations(str, "");
    }

    static void printPermutations(String str, String result) {

        // Base condition
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Recursive logic
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            printPermutations(remaining, result + currentChar);

        }
    }

}