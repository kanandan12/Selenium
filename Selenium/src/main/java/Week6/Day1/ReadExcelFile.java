package Week6.Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFile {

	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	public Object[][] ReadExcel() throws IOException{
		
		FileInputStream file = new FileInputStream(new File("../data/createlead.xlsx"));
		XSSFWorkbook wbook = new XSSFWorkbook(file);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int nRowCount = sheet.getLastRowNum();
		int nColCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count: " +nRowCount+ "Cell Count: " +nColCount );
		Object[][] szData = new Object[2][5];
		
		for(int nRow = 1; nRow <= nRowCount; nRow++) {
			
			XSSFRow row = sheet.getRow(nRow);
			for(int nCol = 0; nCol < nColCount; nCol++) {
				String szText = row.getCell(nCol).getStringCellValue();
				szData[nRow][nCol] = szText;
				System.out.println(szText);
			}
		}
		
		file.close();
		wbook.close();
		return szData;

	}

}
