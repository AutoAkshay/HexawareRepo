package basicJava.zzstringCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    @Test
    public static void primeNumberDemo(int num)  {
        int count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Prime");
        }

        else {
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        PrimeNumbers.primeNumberDemo(11);
    }

}
