package basicJava.tryCatchBlock;

class InvalidVoterAgeExceptions extends Exception{
    public InvalidVoterAgeExceptions(String message){
        super(message);
    }
}
public class VoterService {

    public static void validateAge(int age) throws InvalidVoterAgeExceptions {

        if(age<18){
            throw new InvalidVoterAgeExceptions("Age is below voting criteria");
        }
    }

    public static void main(String[] args) {
        try{
            VoterService.validateAge(17);
        }

        catch(InvalidVoterAgeExceptions age){
            System.out.println(age);
        }

    }
}
