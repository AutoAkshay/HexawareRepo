package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class FactorialDemo {
    @Test
    public void factorial(){
        // 5 = 1*2*3*4*5

        int num=5;
        int fact=1;

        for (int i = 1; i <=num; i++) {
            fact=fact*i;
        }

        System.out.println(fact);
    }
}
