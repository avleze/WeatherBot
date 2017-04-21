package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class EstadoCielo {
	
	private String value;
	private String periodo;
	private String descripcion;
	
	public EstadoCielo(String value, String periodo, String descripcion) {
		super();
		this.value = value;
		this.periodo = periodo;
		this.descripcion = descripcion;
	}

	public EstadoCielo(){
		
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}