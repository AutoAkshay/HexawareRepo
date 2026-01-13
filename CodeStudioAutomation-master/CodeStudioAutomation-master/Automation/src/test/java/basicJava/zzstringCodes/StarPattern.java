package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class StarPattern {

    @Test
    public void starPattern(){

        for (int i = 0; i <=5; i++) {
            for (int k = 0; k <=5; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <=5; j++) {
                System.out.print("*"+" ");
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



//        for (int i = 0; i <=5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <=5; i++) {
//            for (int j = i; j <=5; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 5; i < 0; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

    }
}
