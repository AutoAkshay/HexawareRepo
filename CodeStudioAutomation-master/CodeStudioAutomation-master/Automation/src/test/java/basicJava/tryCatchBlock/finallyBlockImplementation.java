package basicJava.tryCatchBlock;

public class finallyBlockImplementation {

    public static void main(String[] args) {

        int num1=1;
        int num2=0;
        int cal;
        try {
            cal=num1/num2;
            System.out.println(cal);
        }
        catch(Exception e){
            System.out.println("not found"+e.getMessage());
        }

        finally {
            System.out.println("Invalid expression calculation given");
        }
    }
}
