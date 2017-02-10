package com.harca.subarea.model;

public class SubArea {
	private String empresa,area,subarea,ssp,celular_ssp,status;

	public String getEmpresa() {
		return empresa;
	}

	public String getSubArea(){
		return subarea;
	}
	public void setSubArea(String sub){
		this.subarea = sub;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSsp() {
		return ssp;
	}

	public void setSsp(String ssp) {
		this.ssp = ssp;
	}

	public String getCelular_ssp() {
		return celular_ssp;
	}

	public void setCelular_ssp(String celular_ssp) {
		this.celular_ssp = celular_ssp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
