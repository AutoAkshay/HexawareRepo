package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TryTest {
    //        Segregate the alphabets and numeric.
//            Find the number of words in the given string.
//        Find the sum of digits in odd position.
//        Find the characters that occur more than twice.
//String test="Akshay Kalam123. Today interview sdf. Hi789";


    @Test
    public void tests() throws IOException {
        String test = "Akshay Kalam123. Today interview sdf.  .   Hi7899";
//---------------Segregation of alphabets and number done ------------------
        String chars = test.toLowerCase().replaceAll("[^aA-zZ]", "");
        System.out.println("Characters::" + chars);

        String number = test.replaceAll("[^0-9]", "");
        System.out.println("Numbers::" + number);

//-------------------Number of word -------------------------------------------
        String replaceDot = test.replace(".", "");
        String removeSpace = replaceDot.replaceAll("\\s+", " ");

        String str = removeSpace.replaceAll("[^A-Za-z]", " ")
                .replaceAll("\\s+", " ");
        int num = 0;
        for (String string : str.split(" ")) {
            num++;
        }

        System.out.println("Number of words::" + num);

//-----------------Addition of digits coming on odd position ----------
        char[] charNum = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < charNum.length; i++) {
            if (i % 2 == 0) {
                int numberConvert = Character.getNumericValue(charNum[i]);
                sum += numberConvert;
            }
        }

        System.out.println("Sum of odd positioned digits::" + sum);

//-------------------characters that occur more than twice -------------------------------------------

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int threshold = 1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.print(entry.getKey() + "::" + entry.getValue() + ",");
            }
        }
    }
}
