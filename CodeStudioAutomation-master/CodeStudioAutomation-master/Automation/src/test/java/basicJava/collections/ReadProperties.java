package basicJava.collections;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class ReadProperties {

    @Test
    public void readProp() throws IOException {
        Properties properties=new Properties();
        properties.setProperty("lastName","Kalam");
        properties.setProperty("designation","SDET");
        FileOutputStream streamWrite=new
                FileOutputStream(new File("./src/test/java/basicJava/collections/prop.properties"));


        properties.store(streamWrite,"Details");
        streamWrite.close();
        properties.clear();

        FileInputStream streamRead=new
                FileInputStream(new File("./src/test/java/basicJava/collections/prop.properties"));

        properties.load(streamRead);
        System.out.println(properties.getProperty("lastName"));
        System.out.println(properties.getProperty("designation"));
        streamRead.close();

    }
}
