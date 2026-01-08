package practice_selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class MavericInterview {

    //        Segregate the alphabets and numeric.
//            Find the number of words in the given string.
//        Find the sum of digits in odd position.
//        Find the characters that occur more than twice.
//String test="Akshay Kalam123. Today interview sdf. Hi789";
//    String mobileNo= “9859347589395”
//    Find the sum of digits divisible by 5 in the string above




    @Test
    public void test() throws InterruptedException {
        {
            String test = "Akshay Kalam123. Today interview sdf899. Hi789";

            StringBuilder alphabet = new StringBuilder();
            StringBuilder num = new StringBuilder();

            String replaceDot = test.replace(".", "");

            char[] ch = replaceDot.toLowerCase().toCharArray();
            boolean condition = false;

            int numOfchar=0;
            int numOfDig=0;

            int sum = 0;
            for (int i = 0; i < ch.length; i++) {

                if (Character.isLetter(ch[i])) {
                    alphabet.append(ch[i]);
                    numOfchar++;
                }

                else if (Character.isDigit(ch[i])){
                    num.append(ch[i]);
                    sum += ch[i] - '0';
                    numOfDig++;
                }

            }

            System.out.println(alphabet);
            System.out.println(num);
            System.out.println(sum);
            System.out.println(numOfchar);
            System.out.println(numOfDig);
        }
    }

}
