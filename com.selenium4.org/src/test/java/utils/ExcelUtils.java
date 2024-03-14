package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	
	static FileInputStream fs;
	static Workbook wb;
	static Sheet ws;
	
	public ExcelUtils(String fileName, String sheetName) {
		
		try {
			fs = new FileInputStream(fileName);
			wb = WorkbookFactory.create(fs);
			ws = wb.getSheet(sheetName);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getRowCount() {
		
		int rowCount = ws.getPhysicalNumberOfRows();
		return rowCount;
		
	}
	
	public int getColCount() {
		
		int colCount = ws.getRow(0).getPhysicalNumberOfCells();
		return colCount;
		
	}
	
	public String getCellDataString(int rowNum, int colNum) {
		
		String cellData = ws.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
	
	

}
