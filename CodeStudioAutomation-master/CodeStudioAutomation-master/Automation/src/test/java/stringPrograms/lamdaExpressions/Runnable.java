package stringPrograms.lamdaExpressions;

public class Runnable {

    public static void main(String[] args) {
        java.lang.Runnable runnable=()-> System.out.println("Hi Lambda");

        runnable.run();
    }
}
