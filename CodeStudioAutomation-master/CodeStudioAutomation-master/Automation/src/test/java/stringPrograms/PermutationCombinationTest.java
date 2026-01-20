package stringPrograms;

import org.testng.annotations.Test;

public class PermutationCombinationTest {

    @Test
    public void tests() {
        String str="Akshay";
        PermutationCombinationTest.permutation(str,"");

    }

    public static void permutation(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            String current=str.substring(0,i)+str.substring(i+1);

            permutation(current,result+ch);
        }
    }
}
