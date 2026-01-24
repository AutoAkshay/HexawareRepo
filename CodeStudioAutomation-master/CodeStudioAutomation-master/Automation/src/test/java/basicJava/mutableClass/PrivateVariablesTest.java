package basicJava.mutableClass;

public final class PrivateVariablesTest {

    private final String name;
    private final int id;


    PrivateVariablesTest(String name,int id){
        this.id=id;
        this.name=name;

    }

    public String getName(){
        return name;
    }


    public int getId(){
        return id;
    }

}
