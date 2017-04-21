package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Racha {
	
	private String value;
	private String periodo;
	
	public Racha(String value, String periodo) {
		this.value = value;
		this.periodo = periodo;
	}

	public Racha(){
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}