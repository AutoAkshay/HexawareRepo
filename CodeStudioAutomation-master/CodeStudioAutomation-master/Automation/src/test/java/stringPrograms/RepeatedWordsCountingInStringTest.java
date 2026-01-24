package stringPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RepeatedWordsCountingInStringTest {

    @Test
    public void test(){

        String str = "JavaStringjavaMubaiJavaRutujajaVAAkshayJAVA";
        String target="java";
        int count=0;

        for (int i = 0; i <=str.length()-target.length(); i++) {

            if(str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                    count++;
            }
        }

        System.out.println(count);

    }

}
