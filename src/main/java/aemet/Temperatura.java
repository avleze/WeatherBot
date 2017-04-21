package aemet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Temperatura {
	
	private int maxima;
	private int minima;
	
	private List<TempPorHoras> dato;

	public Temperatura(int maxima, int minima, List<TempPorHoras> dato) {
		this.maxima = maxima;
		this.minima = minima;
		this.dato = dato;
	}
	
	public Temperatura(){
		
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

	public List<TempPorHoras> getDato() {
		return dato;
	}

	public void setDato(List<TempPorHoras> dato) {
		this.dato = dato;
	}
	
}