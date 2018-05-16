package com.LLL.lll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test01Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//输出流
		FileOutputStream fo = null;

		
		// 创建一个execl文件
		HSSFWorkbook hw = new HSSFWorkbook();
		//创建一个页面名字2
		HSSFSheet hs = hw.createSheet("闪电发货");
		//创建行
		HSSFRow row1 = hs.createRow(0);
		HSSFRow row2 = hs.createRow(0);
		HSSFRow row3 = hs.createRow(0);
		//创建列
		HSSFCell cell1=row1.createCell(0);
		HSSFCell cell2=row2.createCell(1);
		HSSFCell cell3=row3.createCell(2);
		//给单元格内容赋值
		cell1.setCellValue("第一行第一列");
		cell2.setCellValue("第一行第二列");
		cell3.setCellValue("第一行第三列");
		

		
		
		try {
			fo = new FileOutputStream("E:/myexecl.xls");
			hw.write(fo);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("文件写入成功！");
		
		

	}

}
