package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

//    str1 = "Silent"
//    str2 ="Listen"
    @Test
    public void anagramTest(){
        String str1 = "Conversation";
        String str2 ="Voices rant on";
        char[] c1=str1.replaceAll("\\s+","").toLowerCase().toCharArray();
        char[] c2=str2.replaceAll("\\s+","").toLowerCase().toCharArray();


        if (c1.length != c2.length) {
            System.out.println("Not an anagram");
            return;
        }


        List<Character> ls1=new ArrayList<>();
        List<Character> ls2=new ArrayList<>();

        for (char c:c1){
            ls1.add(c);
        }
        Collections.sort(ls1);

        System.out.println(ls1);

        for (char c:c2){
            ls2.add(c);
        }

        Collections.sort(ls2);

        System.out.println(ls2);

        if(ls1.equals(ls2)){
            System.out.println("It is Anagram word");
        }

        else {
            System.out.println("It is not Anagram word");
        }


    }
}
