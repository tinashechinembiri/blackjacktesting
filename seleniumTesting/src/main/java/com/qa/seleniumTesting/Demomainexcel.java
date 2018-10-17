package com.qa.seleniumTesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Demomainexcel {
	private static XSSFSheet excel;
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row; 
	
	public static void setExcileFile (String path, int size)
	{
		try 
		{
			FileInputStream new_file = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(new_file); 
			excel = ExcelWBook.getSheetAt(size); 
			
			new_file.close();
		}
		catch (Exception  e)
		{
			e.printStackTrace();
		}
	}
	public static String getdata(int row_num, int col_num)
	{
		try 
		{
			Cell = excel.getRow(row_num).getCell(col_num); 
			String data = Cell.getStringCellValue(); 
			return data; 
		}
		catch (Exception e)
		{
			return ""; 
		}
	}
	
	public static  XSSFSheet getExcelWSheet()
	{
		return excel; 
	}
	public static void setData(String answer, int row_num, int col_num)
	{
		try 
		{
			Row = excel.getRow(row_num); 
			Cell = Row.getCell(col_num); 
			if (Cell == null)
			{
				Cell = Row.createCell(col_num); 
			}
			else
			{
				Cell.setCellValue(answer);
			}
			
			FileOutputStream print_out = new FileOutputStream(Constant.excel_link); 
			ExcelWBook.write(print_out); 
			print_out.flush();
			print_out.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	

}
