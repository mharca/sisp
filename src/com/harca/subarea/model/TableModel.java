package com.harca.subarea.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	private String[] colunas = {"Empresa","Area","Subarea","SSP","Celula","Status"};
	private List<SubArea> dados;
	
	public TableModel(){
		dados = new ArrayList<SubArea>();
	}

	public String getColumnName(int num){
		return this.colunas[num];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public int getColumnCount(){
		return colunas.length;
	}
	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		switch(coluna){
		case 0: return "aaa";
		case 1: return "bbb";
		}
		return null;
	}

}
