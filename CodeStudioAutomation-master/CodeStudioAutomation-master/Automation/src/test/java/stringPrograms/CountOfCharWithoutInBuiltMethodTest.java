package stringPrograms;

import org.testng.annotations.Test;

public class CountOfCharWithoutInBuiltMethodTest {

    @Test
    public void tests() {
        String str = "Akshay Anil Kalam Akshay Anil Kalam";
        String str2=str.replaceAll("\\s+","");

        int[] ch=new int[256];

        for (int i = 0; i < str2.length(); i++) {
            char c=str2.toLowerCase().charAt(i);
            ch[c]++;
        }

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>0){
                System.out.println((char)i+"::"+ch[i]);
            }
        }


    }
}
