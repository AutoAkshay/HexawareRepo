package basicJava.abstractConcept;

abstract class ParentAbstractConcept {
    int speed;
    int velocity;
    ParentAbstractConcept(int speed,int velocity){
        this.speed=speed;
        this.velocity=velocity;
    }
    abstract public void show();
}

public class AbstractConcept extends ParentAbstractConcept {

    AbstractConcept(){
        super(100,100);
    }

    @Override
    public void show() {
        System.out.println("Abstract method is overridden::"+speed+"::"+velocity);
    }

    public static void main(String[] args) {
        AbstractConcept concept=new AbstractConcept();
        concept.show();
    }
}
