package stringPrograms.lamdaExpressions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LambdaExpression {

    @Test
    public void collection() {
        List<String> names = Arrays.asList("Anubhav", "Riya", "Karan");

        names.forEach(name -> System.out.println(name));

    }

    @Test
    public void collection2() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach(i-> System.out.println(i));


    }
}
