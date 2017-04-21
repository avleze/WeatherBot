package aemet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class SensacionTermica {
	
	private int maxima;
	private int minima;
	
	private List<SensTermicaPorHoras> dato;

	public SensacionTermica(int maxima, int minima,
			List<SensTermicaPorHoras> dato) {
		this.maxima = maxima;
		this.minima = minima;
		this.dato = dato;
	}

	public SensacionTermica(){
		
	}
	public int getMaxima() {
		return maxima;
	}

	public void setMaxima(int maxima) {
		this.maxima = maxima;
	}

	public int getMinima() {
		return minima;
	}

	public void setMinima(int minima) {
		this.minima = minima;
	}

	public List<SensTermicaPorHoras> getDato() {
		return dato;
	}

	public void setDato(List<SensTermicaPorHoras> dato) {
		this.dato = dato;
	}
	
	
}