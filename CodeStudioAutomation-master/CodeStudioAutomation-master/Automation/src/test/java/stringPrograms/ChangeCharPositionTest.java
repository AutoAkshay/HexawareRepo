package stringPrograms;

import org.testng.annotations.Test;

public class ChangeCharPositionTest {

    @Test
    public void replaceLastAndSecondLast() {
        String str = "Akshay Anil Kalam";

        String[] split = str.split("\\s+");

        String modified=null;
        StringBuilder builder=new StringBuilder();

        for (String string : split) {
            modified=string.substring(0,string.length()-2)
                        +string.charAt(string.length()-1)+string.charAt(string.length()-2);

            builder.append(modified+" ");

        }

        System.out.println(builder);


    }

    @Test
    public void replaceFirstAndLast() {
        String str = "Akshay Anil Kalam";

        String[] split = str.split("\\s+");

        String modified=null;
        StringBuilder builder=new StringBuilder();

        for (String string : split) {
            modified=string.charAt(string.length()-1)+string.substring(1,string.length()-1)
                    +string.charAt(0);

            builder.append(modified+" ");

        }
        System.out.println(builder);
    }
}
