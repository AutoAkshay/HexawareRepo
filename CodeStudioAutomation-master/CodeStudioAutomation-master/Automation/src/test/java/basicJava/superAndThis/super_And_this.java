package basicJava.superAndThis;

class superKeyImplementation{
    String name="Java";
}
public class super_And_this extends superKeyImplementation {
    String name;

    public void accessSuperVar(){
        System.out.println(super.name);
    }
    public void testInstance_And_LocalVar(String name){
        this.name=name;
        System.out.println(name);//this value should be assigned to instant var
    }

    public void accessInstanceVar(){
        System.out.println(name);
    }



    public static void main(String[] args) {
        super_And_this obj=new super_And_this();

        obj.accessSuperVar();
        obj.testInstance_And_LocalVar("Java");
        obj.accessInstanceVar();
    }
}
