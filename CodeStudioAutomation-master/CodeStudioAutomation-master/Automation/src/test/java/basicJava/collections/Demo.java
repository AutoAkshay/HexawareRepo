package basicJava.collections;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Input string : welcome to paramount 3q
//Output string: Welcome To Paramount 3q

public class Demo {

    @Test
    public void test() {
        String string = "welcome to paramount 3q";

        String[] str=string.split("\\s+");

       for (String st:str){
           System.out.print(st.toUpperCase().substring(0,1)+st.toLowerCase().substring(1,st.length())+" ");
       }
    }
}

