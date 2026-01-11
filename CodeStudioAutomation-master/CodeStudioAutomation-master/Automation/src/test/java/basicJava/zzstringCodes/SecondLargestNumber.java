package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class SecondLargestNumber {

    @Test
    public void test() {

        Integer[] num = {5, 13, 6, 7, 1, 8, 2, 9};
        int temp = 0;

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
