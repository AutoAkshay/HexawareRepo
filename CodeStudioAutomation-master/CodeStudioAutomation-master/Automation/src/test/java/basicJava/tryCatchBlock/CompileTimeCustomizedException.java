package basicJava.tryCatchBlock;

import java.io.IOException;
import java.text.RuleBasedCollator;

class InvalidVoterAge extends Exception {

    InvalidVoterAge(String message){
        super(message);
    }
}

public class CompileTimeCustomizedException{
    public static void main(String[] args) throws InvalidVoterAge //throws concept to be used
    {
        int age=17;
        if(age<18){
            throw new InvalidVoterAge("Age is below voting criteria");
        }
        System.out.println("Eligible for voting");
    }
}
