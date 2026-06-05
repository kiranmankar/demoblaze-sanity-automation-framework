package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static String getCellData(
            String sheetName,
            int rowNum,
            int cellNum) {

        String path =
                "src/test/resources/testdata/DemoBlazeData.xlsx";

        try {

            FileInputStream fis =
                    new FileInputStream(path);

            XSSFWorkbook workbook =
                    new XSSFWorkbook(fis);

            XSSFSheet sheet =
                    workbook.getSheet(sheetName);

            Row row = sheet.getRow(rowNum);

            Cell cell = row.getCell(cellNum);

            String value =
                    cell.toString();

            workbook.close();

            return value;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return "";
    }
}
