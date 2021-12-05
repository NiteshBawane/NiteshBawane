package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelUtility {
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;

	public static ArrayList<String> readDataColdata(String filepath, int sheetindex, int colNo, int ivalue)
			throws Exception {

		ArrayList<String> explist = new ArrayList<String>();
		fis = new FileInputStream(filepath);
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(sheetindex);
		int row = sh.getRows();
		System.out.println(row);
		for (int i = ivalue; i < row; i++) {
			explist.add(sh.getCell(colNo, i).getContents());
		}
		System.out.println(explist.size());

		return explist;
	}

	public static ArrayList<String> readDataRowdata(String filepath, int sheetindex, int rowNo, int ivalue)
			throws Exception {

		ArrayList<String> explist = new ArrayList<String>();
		fis = new FileInputStream(filepath);
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(sheetindex);
		int cols = sh.getColumns();
		for (int i = ivalue; i < cols; i++) {
			explist.add(sh.getCell(i, rowNo).getContents());
		}
		System.out.println(explist);
		System.out.println(explist.size());

		return explist;
	}

	public static List<String> readRowAndColData(String filepath, int sheetindex, int ivalue, int jvalue,int row,int column)
			throws Exception {
		fis = new FileInputStream(new File("C:\\Users\\91814\\Desktop\\operatorPage.xls"));
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(0);
		 row = sh.getRows();
		 column = sh.getColumns();
		ArrayList<String> explist = new ArrayList<String>();
		for (int i = ivalue; i < row; i++) {// row
			for (int j = jvalue; j < column; j++) {// column
				Cell cell = sh.getCell(j, i);// column ,row
				String val = cell.getContents();
				explist.add(val);
			}
			System.out.println();
		}
		return explist;
	}

}