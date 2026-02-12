package org.doximo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException {
		//File
		File file =new File("C:\\Users\\Ezhil\\eclipse-workspace\\MavenDec25Batch\\target\\newfile1.xlsx");
		
		//Workbook
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.createSheet("data");
		
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("selenium");
		
		FileOutputStream fOut=new FileOutputStream(file);
		
		w.write(fOut);
		
		System.out.println("Done..");
		
		
	}

}
