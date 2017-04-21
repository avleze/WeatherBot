package aemet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Dia {
	private List<Precipitacion> probPrecipitacion;
	private List<CotaNieve> cotaNieveProv;
	private List<EstadoCielo> estadoCielo;
	private List<EstadoViento> viento;
	private List<Racha> rachaMax;
	
	private Temperatura temperatura;
	
	private SensacionTermica sensTermica;
	
	private HumedadRelativa humedadRelativa;
	
	private int uvMax;
	
	private String fecha;

	public Dia(){
		
	}
	
	public Dia(List<Precipitacion> probPrecipitacion,
			List<CotaNieve> cotaNieveProv, List<EstadoCielo> estadoCielo,
			List<EstadoViento> viento, List<Racha> rachaMax,
			Temperatura temperatura, SensacionTermica sensTermica,
			HumedadRelativa humedadRelativa, int uvMax, String fecha) {
		super();
		this.probPrecipitacion = probPrecipitacion;
		this.cotaNieveProv = cotaNieveProv;
		this.estadoCielo = estadoCielo;
		this.viento = viento;
		this.rachaMax = rachaMax;
		this.temperatura = temperatura;
		this.sensTermica = sensTermica;
		this.humedadRelativa = humedadRelativa;
		this.uvMax = uvMax;
		this.fecha = fecha;
	}



	public List<Precipitacion> getProbPrecipitacion() {
		return probPrecipitacion;
	}

	public void setProbPrecipitacion(List<Precipitacion> probPrecipitacion) {
		this.probPrecipitacion = probPrecipitacion;
	}

	public List<CotaNieve> getCotaNieveProv() {
		return cotaNieveProv;
	}

	public void setCotaNieveProv(List<CotaNieve> cotaNieveProv) {
		this.cotaNieveProv = cotaNieveProv;
	}

	public List<EstadoCielo> getEstadoCielo() {
		return estadoCielo;
	}

	public void setEstadoCielo(List<EstadoCielo> estadoCielo) {
		this.estadoCielo = estadoCielo;
	}

	public List<EstadoViento> getViento() {
		return viento;
	}

	public void setViento(List<EstadoViento> viento) {
		this.viento = viento;
	}

	public List<Racha> getRachaMax() {
		return rachaMax;
	}

	public void setRachaMax(List<Racha> rachaMax) {
		this.rachaMax = rachaMax;
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public SensacionTermica getSensTermica() {
		return sensTermica;
	}

	public void setSensTermica(SensacionTermica sensTermica) {
		this.sensTermica = sensTermica;
	}

	public HumedadRelativa getHumedadRelativa() {
		return humedadRelativa;
	}

	public void setHumedadRelativa(HumedadRelativa humedadRelativa) {
		this.humedadRelativa = humedadRelativa;
	}

	public int getUvMax() {
		return uvMax;
	}

	public void setUvMax(int uvMax) {
		this.uvMax = uvMax;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}