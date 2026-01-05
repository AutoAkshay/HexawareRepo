package basicJava.tryCatchBlock;

public class multipleCatchBlock {

    public static void main(String[] args) {

        int num1=1;
        int num2=0;
        int cal;
        try {
            cal=num1/num2;
            System.out.println(cal);
        }

        catch(NullPointerException e){
            System.out.println("Null pointer exception"+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic exception"+e.getMessage());
        }

        catch(Exception e){
            System.out.println("not found"+e.getMessage());
        }

        finally {
            System.out.println("Invalid expression calculation given");
        }
    }
}
