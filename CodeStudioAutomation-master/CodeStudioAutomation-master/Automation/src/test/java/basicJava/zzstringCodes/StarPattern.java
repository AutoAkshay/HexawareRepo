package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class StarPattern {

    @Test
    public void starPattern(){

        for (int i = 0; i <= 5; i++) {

            for (int k = i; k <= 5; k++) {   // ← FIXED
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {   // ← FIXED
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
