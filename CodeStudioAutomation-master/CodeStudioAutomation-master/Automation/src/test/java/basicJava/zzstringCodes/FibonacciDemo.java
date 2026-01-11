package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class FibonacciDemo {

    @Test
    public void fibonacci() {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        int total = num1 + num2;

        System.out.print(num1 + " " + num2);

        for (int i = 1; i < 10; i++) {
            sum = num1 + num2;
            total += sum;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }

        System.out.println("\n" + total);
    }
}
