package aemet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class HumedadRelativa {
	
	private int maxima;
	private int minima;
	
	private List<HumedadRelPorHoras> dato;

	public HumedadRelativa(int maxima, int minima,
			List<HumedadRelPorHoras> dato) {
		this.maxima = maxima;
		this.minima = minima;
		this.dato = dato;
	}

	public HumedadRelativa(){
		
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

	public List<HumedadRelPorHoras> getDato() {
		return dato;
	}

	public void setDato(List<HumedadRelPorHoras> dato) {
		this.dato = dato;
	}
	
}