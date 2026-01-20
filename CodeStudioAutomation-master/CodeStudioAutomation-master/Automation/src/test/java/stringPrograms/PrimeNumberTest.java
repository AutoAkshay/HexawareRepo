package stringPrograms;

import org.testng.annotations.Test;

public class PrimeNumberTest {

    @Test
    public void test(){
        int num=11;
        int count=0;

        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("it is prime number:: "+ num);
        }

        else {
            System.out.println("it is not prime number:: "+ num);
        }
    }
}
