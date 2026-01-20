package basicJava.zzstringCodes;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class SecondLargestNumber {

    @Test
    public void test() {

        Integer[] num1={1,3,5,7,9};
        Integer[] num2={2,4,6,8};
        int temp = 0;

        Integer[] num= Stream.concat(Arrays.stream(num1),Arrays.stream(num2)).toArray(Integer[]::new);


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }

        }

        System.out.println(temp);

    }

}
