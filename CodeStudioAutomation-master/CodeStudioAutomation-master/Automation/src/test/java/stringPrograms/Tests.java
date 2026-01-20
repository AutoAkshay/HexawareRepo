package stringPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Tests {

    public static void main(String[] args) {
        String str="AkshayAnilAkshayAnilKalamKalam";
        String target="Akshay";

        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                count++;
            }
        }

        System.out.println(count);

    }
}
