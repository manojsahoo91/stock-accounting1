package com.ERP.Masters;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelread {

	
	
	
	 
	public static void main(String[] args) throws Exception {
		stocklib sk=new stocklib();
		sk.openAPP("http://webapp.qedgetech.com");
		sk.Admlogin("admin", "master");
		
		FileInputStream fis=new FileInputStream("D:\\workspace1\\ERP_Automation\\src\\com\\ERP\\testData\\uom.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("uomdata");
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		for (int i = 1; i <=rc ; i++) {
			XSSFRow sr=ws.getRow(i);
			XSSFCell wc1=sr.getCell(0);
			XSSFCell wc2=sr.getCell(1);
			XSSFCell wc3=sr.createCell(2);
			String uid=wc1.getStringCellValue();
			String udesc=wc2.getStringCellValue();
			String rex=sk.unitmsrmnt( uid, udesc);
			wc3.setCellValue(rex);
		}
		FileOutputStream fo=new FileOutputStream("D:\\workspace1\\ERP_Automation\\src\\com\\ERP\\Results\\umores.xlsx");
		wb.write(fo);
		wb.close();
	}

}

