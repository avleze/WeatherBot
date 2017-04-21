package aemet;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Municipio {
	private String cpro;
	private String cmun;
	private String nombre;
	
	public Municipio(String cpro, String cmun, String nombre) {
		super();
		this.cpro = cpro;
		this.cmun = cmun;
		this.nombre = nombre;
	}
	
	public Municipio(){}
	
	public String getcpro() {
		return cpro;
	}
	public void setcpro(String cpro) {
		this.cpro = cpro;
	}
	public String getcmun() {
		return cmun;
	}
	public void setcmun(String cmun) {
		this.cmun = cmun;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
