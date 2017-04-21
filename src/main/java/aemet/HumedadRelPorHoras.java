package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class HumedadRelPorHoras {
	
	private int value;
	private int hora;
	
	public HumedadRelPorHoras(int value, int hora) {
		this.value = value;
		this.hora = hora;
	}

	public HumedadRelPorHoras(){
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
}