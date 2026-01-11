package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MavericInterviewTest {
    //        Segregate the alphabets and numeric. - Done
//            Find the number of words in the given string.
//        Find the sum of digits in odd position.
//        Find the characters that occur more than twice. - Donoe
//String test="Akshay Kalam123. Today interview sdf. Hi789";
    @Test
    public void test() {
        String test="Akshay Kalam123. Today interview999 sdf. Hi789";

        String dots=test.replace(".","");

        String spaces=dots.replaceAll(" ","");

        char[] ch=spaces.toCharArray();
        List<Character> setChar=new LinkedList<>();
        List<Integer> setDigit=new LinkedList<>();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:ch){
            if (Character.isLetter(c)) {
                setChar.add(c);
            }

            else if(Character.isDigit(c)){
                setDigit.add(Character.getNumericValue(c));
            }

            map.put(c,map.getOrDefault(c,0)+1);
        }
//---------------Segregate the alphabets and numeric.
        System.out.println("All chars::"+setChar);
        System.out.println("All digits::"+setDigit);

//---------------Find the characters that occur more than twice.
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                System.out.print(entry.getKey()+"->"+entry.getValue()+",");
            }
        }

//---------------Find the sum of digits in odd position.
        int sumOdd=0;
        String digits=dots.replaceAll("[A-Za-z]","").trim();
        System.out.println();
        String digSpace=digits.replaceAll("\\s+","");
        char[] digitChar=digSpace.toCharArray();
        for (int i = 0; i < digitChar.length; i++) {
            if (i%2==0){
                int oddDigi=digitChar[i]-'0';
                sumOdd+=oddDigi;
            }
        }

        System.out.println("sumOdd::"+sumOdd);

//------------Find the number of words in the given string.
        String sentence=dots.replaceAll("[^A-Za-z]"," ").replaceAll("\\s+"," ");

        String[] split=sentence.split("\\s+");
        int numOfWords=0;
        for (String string:split){
            numOfWords++;
        }

        System.out.println("Number of words::"+numOfWords);
    }
}
