package basicJava.tryCatchBlock;

class InvalidVoterAgeException extends RuntimeException{

    public InvalidVoterAgeException(String message){
       super(message);
    }
}

public class RunTimecustomizedException {

    public static void main(String[] args) {
        int age=17;
        if(age>19){
            System.out.println("Eligible for voting");
        }

        else {
            throw new InvalidVoterAgeException("Age is below criteria");
        }
    }
}
