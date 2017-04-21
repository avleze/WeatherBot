package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class TempPorHoras {
	
	private int value;
	private int hora;
	
	public TempPorHoras(int value, int hora) {
		this.value = value;
		this.hora = hora;
	}
	
	public TempPorHoras(){
		
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