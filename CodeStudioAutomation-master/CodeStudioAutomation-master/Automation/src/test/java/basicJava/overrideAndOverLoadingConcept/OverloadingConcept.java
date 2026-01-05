package basicJava.overrideAndOverLoadingConcept;

class ParentForOverLoading{

    public void test(){
        System.out.println("Void method");
    }

    public void test(String name){
        System.out.println(name);
    }

    public String test(String name,String lastName){
        return name+"::"+lastName;
    }

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

}
public class OverloadingConcept {
    public static void main(String[] args) {
        ParentForOverLoading parent=new ParentForOverLoading();
        System.out.println(parent.test("Akshay","Kalam"));
    }
}
