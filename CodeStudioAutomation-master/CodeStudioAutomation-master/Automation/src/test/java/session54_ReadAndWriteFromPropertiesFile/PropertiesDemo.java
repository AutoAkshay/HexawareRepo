package session54_ReadAndWriteFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Create a function Java + Sel
//It will take data from feature file
//Name of product, qntty of that eg.
//Cucumber 2kgs


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class PropertiesDemo {

    private static final Path WRITE_FILE =
            Path.of("./src/test/java/session54_ReadAndWriteFromPropertiesFile/writeProp.properties");
    
    private static final Path READ_FILE =
            Path.of("./src/test/java/session54_ReadAndWriteFromPropertiesFile/readProp.properties");

    public static void main(String[] args) {
        try {
            writeProperties();
            readProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeProperties() throws IOException {
        Properties props = new Properties();
        props.setProperty("name", "Akshay");
        props.setProperty("surname", "Kalam");
        props.setProperty("location", "Pune");
        try (OutputStream out = Files.newOutputStream(WRITE_FILE)) {
            props.store(out, "Writing user details");
        }
    }

    private static void readProperties() throws IOException {
        Properties props = new Properties();

        try (InputStream in = Files.newInputStream(READ_FILE)) {
            props.load(in);
        }

        String firstName = props.getProperty("firstName", "N/A");
        String lastName  = props.getProperty("lastName", "N/A");
        String location  = props.getProperty("location", "N/A");

        System.out.println(firstName + " :: " + lastName + " :: " + location);
    }
}
