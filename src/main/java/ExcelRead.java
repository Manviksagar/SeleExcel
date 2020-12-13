import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read() throws IOException {

        FileInputStream fs= new FileInputStream(new File("C:\\Users\\SAGAR\\Desktop\\TestData.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sh= wb.getSheetAt(0);
        String firstcell=sh.getRow(0).getCell(0).getStringCellValue();
        System.out.println(firstcell);
        System.out.println(sh.getRow(0).getCell(1).getStringCellValue());

    }

}
