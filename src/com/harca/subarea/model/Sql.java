package com.harca.subarea.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Sql {
	Connection c = null;
	Statement stmt = null;
	SubArea subArea;
	public Sql(){
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:subareas.sqlite3");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void insert(List<SubArea> lista){
		for (int i=0; i < lista.size();i++){
			subArea = new SubArea();
			subArea = lista.get(i);
			
			try {
				stmt = c.createStatement();
				stmt.executeUpdate("INSERT INTO SUBAREA(EMPRESA,AREA,SSP,CELULAR_SSP,STATUS) VALUES"
						+ "("+subArea.getEmpresa()+","+subArea.getArea()+","+subArea.getSsp()+","+subArea.getCelular_ssp()+","+subArea.getStatus()+")");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
