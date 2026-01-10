package basicJava.collections;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {


    @Test
    public void readExcel() throws IOException {
        FileInputStream stream=new
                FileInputStream(new File("./src/test/java/basicJava/collections/ExtentReportDemo.xlsx"));
        XSSFWorkbook wb=new XSSFWorkbook(stream);
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        sheet=wb.getSheetAt(0);
        int rowSize=sheet.getLastRowNum();
        int cellSize=sheet.getRow(0).getLastCellNum();

        for (int i = 0; i <= rowSize; i++) {

            if(sheet.getRow(i)==null) {
                continue;
            }
            for (int j = 0; j <= cellSize; j++) {
                if(sheet.getRow(i).getCell(j)==null) {
                    continue;
                }
                String content=sheet.getRow(i).getCell(j).toString();
                System.out.print(content+" | ");
            }
            System.out.println();
        }
    }

}
