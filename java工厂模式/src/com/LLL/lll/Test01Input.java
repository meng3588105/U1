package com.LLL.lll;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test01Input {
    private HSSFWorkbook workbook;//工作簿
    
	public void importExcel(File file){
    	try {
			 workbook = new HSSFWorkbook(new FileInputStream("E:/myexecl.xls"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
    }
	
	
}
