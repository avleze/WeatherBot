package aemet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Datos{
	private List<Dia> dia;

	public Datos(){
		
	}
	
	public Datos(List<Dia> dia) {
		this.dia = dia;
	}


	public List<Dia> getDia() {
		return dia;
	}

	public void setDia(List<Dia> dia) {
		this.dia = dia;
	}
	
}