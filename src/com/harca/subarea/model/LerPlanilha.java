package com.harca.subarea.model;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LerPlanilha {
	
	List<SubArea> listaSubArea;
	SubArea subArea;
	Sql sql;
	public LerPlanilha(String path){
		sql = new Sql();
		try{
			subArea = new SubArea();
			
			FileInputStream fp = new FileInputStream(new File(path));
			XSSFWorkbook wb = new XSSFWorkbook(fp);
			XSSFSheet sheet = wb.getSheetAt(0);
			listaSubArea = new ArrayList<SubArea>();
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()){
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while(cellIterator.hasNext()){
					Cell cell = cellIterator.next();
					switch(cell.getColumnIndex()){
						case 0:
							subArea.setEmpresa(cell.getStringCellValue());
							break;
						case 1:
							subArea.setArea(cell.getStringCellValue());
							break;
						case 2:
							subArea.setSsp(cell.getStringCellValue());
							break;
						case 3:
							subArea.setCelular_ssp(cell.getStringCellValue());
							break;
						case 4:
							subArea.setStatus(cell.getStringCellValue());
							break;
						}
					listaSubArea.add(subArea);
				}
				sql.insert(listaSubArea);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("=-=-=-=-=-=-=-=-=-="+listaSubArea.size()+"-=-=-="+listaSubArea.get(3));
	}
}
