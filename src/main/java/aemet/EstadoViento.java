package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class EstadoViento {
	
	private String direccion;
	private int velocidad;
	private String periodo;
	
	public EstadoViento(String direccion, int velocidad, String periodo) {
		
		this.direccion = direccion;
		this.velocidad = velocidad;
		this.periodo = periodo;
		
	}
	
	public EstadoViento(){
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
}