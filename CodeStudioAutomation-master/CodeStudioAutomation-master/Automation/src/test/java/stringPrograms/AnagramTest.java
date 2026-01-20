package stringPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class AnagramTest {

    @Test
    public void test(){
        String str1 = "Conversation";
        String str2 = "Voices rant on";


        char[] char1=str1.toLowerCase().toCharArray();
        char[] char2=str2.toLowerCase().replaceAll("\\s+","").toCharArray();

        List<Character> ls1=new ArrayList<>();
        List<Character> ls2=new ArrayList<>();

        for (char c1:char1){
            ls1.add(c1);
        }

        for (char c2:char2){
            ls2.add(c2);
        }

        Collections.sort(ls1);
        Collections.sort(ls2);
        System.out.println(ls1.equals(ls2));
    }
}
