package stringPrograms.lamdaExpressions;

interface InterfaceEx{

    void sayHello();
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        InterfaceEx ex=()-> System.out.println("Akshay Kalam");

        ex.sayHello();
    }
}
