package basicJava.zzstringCodes;

import org.testng.annotations.Test;

interface ABC{
    default void test(){
        System.out.println("Akshay Kalam");
    };
}

interface DEF extends ABC{
    void test();
    static void test1(){
        System.out.println("Akshay Kalam");
    }
}

abstract class EFG{
    abstract void test();
}

class GHI extends EFG{

    @Override
    void test() {

    }
}

abstract class PQR extends  GHI{
    abstract  void test();
}

public class TryTest extends PQR implements ABC,DEF {
    @Override
    public void test() {
        System.out.println("Kalam akshay");
    }

    public static void main(String[] args) {
        TryTest test=new TryTest();

        DEF.test1();
        test.test();
    }
}

