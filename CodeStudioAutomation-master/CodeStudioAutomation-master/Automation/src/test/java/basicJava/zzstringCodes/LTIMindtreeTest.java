package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.*;

public class LTIMindtreeTest {

    @Test
    public void capitalFirstChar() {
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
        Integer[] num1={1,3,5,7,9,11};
        Integer[] num2={2,4,6,8,10};

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

    @Test
    public void program3() {
        Integer[] array1={10,20,30,40};
        Integer[] array2={11,21,31,39};

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for (int arr1:array1){
            if(arr1>first){
                third=second;
                second=first;
                first=arr1;
            }

            else if(arr1>second){
                third=second;
                second=arr1;

            }

            else if(arr1>third){
                third=arr1;

            }
        }


        for (int arr2:array2){
            if(arr2>first){
                third=second;
                second=first;
                first=arr2;
            }

            else if(arr2>second){
                third=second;
                second=arr2;

            }

            else if(arr2>third){
                third=arr2;

            }
        }

        System.out.println(third);
    }


}
