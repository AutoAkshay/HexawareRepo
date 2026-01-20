package basicJava.zzstringCodes;

import org.testng.annotations.Test;


public class BajajFinanceTest {

    @Test
    public void test1() {
        String a = "Hi This is my name Akshay Kalam";
        int count=1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==' '){
               ++count;
            }
        }
        System.out.println("Number of words::"+count);
    }

    @Test
    public void test2(){
        Integer[] number={0,1,0,0,1,1,0};
        int temp=0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(number[i]<number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }

        for (int num:number) {
            System.out.print(num);
        }

    }
}
