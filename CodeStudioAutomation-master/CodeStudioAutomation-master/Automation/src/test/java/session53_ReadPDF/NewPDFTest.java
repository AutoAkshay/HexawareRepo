package session53_ReadPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewPDFTest {

    @Test
    public void test() throws IOException {
        File stream=new File("./src/test/java/session53_ReadPDF/Name.pdf");
        PDDocument document=PDDocument.load(stream);

        PDFTextStripper stripper=new PDFTextStripper();

        String name=stripper.getText(document);

        System.out.println(name);
    }


}
