package basicJava.staticConcept;

class staticVariableDemo {
    static String name="This is static variable";

    public static void staticMethod(){
        System.out.println("This is static method");
    }

    static class StaticClass {
        void staticClassMethod(){
            System.out.println("This is static class method");
        }
    }

}
public class staticVariable {
    public static void main(String[] args) {

        System.out.println(staticVariableDemo.name);
        staticVariableDemo.staticMethod();

        staticVariableDemo.StaticClass obj= new staticVariableDemo.StaticClass();
        obj.staticClassMethod();

    }
}


