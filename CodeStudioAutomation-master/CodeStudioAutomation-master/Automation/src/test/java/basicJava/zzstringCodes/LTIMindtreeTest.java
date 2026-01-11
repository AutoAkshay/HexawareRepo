package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.*;

public class LTIMindtreeTest {

    @Test
    public void program1() {
//        output : Welcome To Paranormal 3q
        String string = "welcome to paranormal 3q";

        String[] str = string.split("\\s+");

        for (String st : str) {
            String test = st.toUpperCase().substring(0, 1) + st.substring(1, st.length());
            System.out.print(test + " ");
        }

    }

    @Test
    public void program2() {
//---------Output = 1234567891011
        Integer[] num1={1,7,9,11,3,5};
        Integer[] num2={6,10,2,4,8};

//-------------very simple way
//        for (int i = 0; i < num1.length; i++) {
//            System.out.print(num1[i]);
//            if(num2.length>i) {
//                System.out.print(num2[i]);
//            }
//        }

        List<Integer> ls1=new ArrayList<>(Arrays.asList(num1));
        List<Integer> ls2=new ArrayList<>(Arrays.asList(num2));

        ls1.addAll(ls2);

       Collections.sort(ls1);

        for (int i:ls1){
            System.out.print(i);
        }

    }
}
