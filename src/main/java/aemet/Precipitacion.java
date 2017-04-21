package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Precipitacion {
	
	private int value;
	private String periodo;
	
	public Precipitacion(int value, String periodo) {
		this.value = value;
		this.periodo = periodo;
	}
	
	public Precipitacion(){
		
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}