package com.cgi.code.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Used to read excel sheets
 * 
 */
public class ReadExcel {
	private static final Logger logger = Logger.getLogger(ActionKeywords.class.getName());

	private Collection<Object[]> data = null;

	/**
	 * Constructs a collection based on sheet in an excel workbook
	 * 
	 * @param sheetName Name of the excel sheet.
	 */
	public ReadExcel(String sheetName) {
		this.data = parse(sheetName);
	}

	/**
	 * 
	 * @return collection of data in an excel workbook sheet
	 */
	public Collection<Object[]> getData() {
		return data;
	}

	private Collection<Object[]> parse(String sheetName) {
		String excelFilePath = "Test Cases//";
		FileInputStream inputStream = null;
		List<Object[]> ret = new ArrayList<Object[]>();
		Workbook workbook = null;
		
			try {
				inputStream = new FileInputStream(excelFilePath + "TestSuite.xlsx");
			} catch (FileNotFoundException e) {
				logger.error("Excel file not found.");
			}
			try {
				workbook = new XSSFWorkbook(inputStream);
			} catch (IOException e) {
				logger.error("Can not read excel file.");
			}
			Sheet sheet = workbook.getSheet(sheetName);
			
			List<Object> rowData = new ArrayList<Object>();
			int numberOfColumns = firstEmptyCellPosition(sheet);
			int columnsAdded = 0;
			Iterator<Row> iterator = sheet.iterator();
			while (iterator.hasNext()) {
				Row nextRow = iterator.next();
				for (int cn = 0; cn < numberOfColumns; cn++) {
			          Cell cell = nextRow.getCell(cn, Row.RETURN_BLANK_AS_NULL);
			          if (cell == null) {
			        	  rowData.add(" ");
						  columnsAdded++;
			          } else {
			        	  switch (cell.getCellType()) {
							case Cell.CELL_TYPE_STRING:
								rowData.add(cell.getStringCellValue());
								columnsAdded++;
								break;
							case Cell.CELL_TYPE_BOOLEAN:
								rowData.add(String.valueOf(cell.getBooleanCellValue()));
								columnsAdded++;
								break;
							case Cell.CELL_TYPE_NUMERIC:
								rowData.add(String.valueOf((cell.getNumericCellValue())));
								columnsAdded++;
								break;
							case Cell.CELL_TYPE_BLANK:
								rowData.add(" ");
								columnsAdded++;
								break;
							}
			          }
				if (columnsAdded == numberOfColumns) {
					ret.add(rowData.toArray());
					rowData.clear();
					columnsAdded = 0;
				}
			}
			try {
				workbook.close();
			} catch (IOException e) {
				logger.error("Error closing workbook.");
			}
			try {
				inputStream.close();
			} catch (IOException e) {
				logger.error("Error closing workbook inputStream.");
			}
					}
		return ret;
	}

	private int firstEmptyCellPosition(Sheet firstSheet) {
		int columnCount = 0;
		Row firstRow = firstSheet.getRow(0);
		for (Cell cell : firstRow) {
			if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
				break;
			}
			columnCount++;
		}
		return columnCount;
	}
}
