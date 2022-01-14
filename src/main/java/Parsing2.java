import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Parsing2 {

    public static void main(String[] args) throws IOException {

        final String file = "C:/Users/User/Desktop/лист (2).xlsx";

        FileInputStream excelFile = new FileInputStream(new File(file));
        Workbook workbook = new XSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);

        int rowStart = datatypeSheet.getFirstRowNum (); // индекс первой строки
        int rowEnd = datatypeSheet.getLastRowNum (); // индекс последней строки

        if (rowStart == rowEnd) {
            System.out.println(file + "-" + "Пустой");
        } else {
            System.out.println(file + "-" + "Содержит данные");
        }
    }
}






/**
 * if (FILE_NAME.length() > 13) {
   System.out.println(0);
   } else {
   System.out.println(1);
   }
 */

/**
 * BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
 *
 *         if (br.readLine() == null) {
 *             System.out.println(0);
 *         } else {
 *             System.out.println(1);
 *         }
 */