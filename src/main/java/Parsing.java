
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Parsing {

    private static final String FILE_NAME = "C:/Users/User/Desktop/лист (2).xlsx";

    public static void main(String[] args) {

        String result = "";

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = (Row) iterator.next();
                Iterator cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = (Cell) cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        result += currentCell.getStringCellValue();
                        //System.out.print(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        result += currentCell.getStringCellValue();
                        //System.out.print(currentCell.getStringCellValue() + "--");
                    }
                    if (result != null) {

                    }
                }



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

