package basicJava.collections;


final class FinalClass{
    private final String name;
    private final int id;

    FinalClass(String name,int id){
        this.id=id;
        this.name=name;
    }

    public String stuName(){
        return name;
    }

    public int id(){
        return id;
    }

}
public class Demo {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass("Akshay",3);

        System.out.println(finalClass.stuName()+finalClass.id());
    }
}

