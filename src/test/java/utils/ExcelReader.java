package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static List<Map<String, String>> read(String sheetName, String path) {
        FileInputStream fileInputStream = null;
        List<Map<String, String>> excelData = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
                Row row = sheet.getRow(rows);
                Map<String, String> rowMap = new LinkedHashMap<>();
                for (int column = 0; column < row.getPhysicalNumberOfCells(); column++) {
                    String keys = headerRow.getCell(column).toString();
                    String values = row.getCell(column).toString();
                }
                excelData.add(rowMap);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return excelData;
    }
}
