package basicJava.zzarray;

interface InterImp {

    void test1();
    default void test(){
        System.out.println("Akshay Kalam");
    }

    static void tests3(){
        System.out.println("Rutuja Kalam");
    }
}
public class Interview implements InterImp {
    public static void main(String[] args) {
        Interview interview=new Interview();
        interview.test();
        InterImp.tests3();
        interview.test1();
    }

    @Override
    public void test1() {
        System.out.println("Kalam akshay");
    }


}

