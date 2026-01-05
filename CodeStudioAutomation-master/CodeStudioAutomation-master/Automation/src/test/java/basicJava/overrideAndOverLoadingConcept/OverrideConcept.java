package basicJava.overrideAndOverLoadingConcept;

class Parent{

    void show(){
        System.out.println("Let this override method in child class");
    }

    static void staticShow(){
        System.out.println("Let this override method in child class");
    }

}

class Child extends Parent {

    @Override
    void show(){
        System.out.println("This overridden method to from class");
    }
    static void staticShow(){
        System.out.println("Let this override method in child class");
    }

}

public class OverrideConcept{
    public static void main(String[] args) {
        Child child=new Child();
        child.show();
        Child.staticShow();

        Parent parent=new Child();
        parent.show();

    }
}


