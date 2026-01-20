package session11_19;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Revision {

    public static void main(String[] args) {
        String str="Akshay";
        String result="";
        Revision.test(str,result);
    }
    public static void test(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);

            String string=str.substring(0,i)+str.substring(i+1);

            test(string,c+result);
        }
    }
}
