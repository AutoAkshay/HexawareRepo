package basicJava.zzstringCodes;

import org.testng.annotations.Test;

public class SwapNumberDemo {

    @Test
    public void demo1(){
        int num1=5;
        int num2=10;

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num1 ::"+num1);
        System.out.println("num2 ::"+num2);

    }

    @Test
    public void demo2(){
        int num1=5;
        int num2=10;

        int temp=0;
        temp=num1;//5
        num1=num2;//10
        num2=temp;//5

        System.out.println("num1 ::"+num1);
        System.out.println("num2 ::"+num2);
    }
}
