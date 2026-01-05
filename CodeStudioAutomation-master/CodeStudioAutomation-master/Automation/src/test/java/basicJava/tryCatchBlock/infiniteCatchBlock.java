package basicJava.tryCatchBlock;

public class infiniteCatchBlock {
    public static void main(String[] args) {
        try {
            while(true) {}
        }
        finally {
            System.out.println("Never reached");
        }
    }

}
