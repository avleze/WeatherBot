package aemet;


public class Prediccion{
	private Origen origen;
	private String elaborado;
	private String nombre;
	private String provincia;
	private Datos prediccion;
	private String id;
	private String version;
	
	public Prediccion(Origen origen, String elaborado, String nombre,
			String provincia, Datos prediccion, String id, String version) {
		super();
		this.origen = origen;
		this.elaborado = elaborado;
		this.nombre = nombre;
		this.provincia = provincia;
		this.prediccion = prediccion;
		this.id = id;
		this.version = version;
	}

	public Prediccion(){
		
	}
	
	public Origen getOrigen() {
		return origen;
	}
	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	public String getElaborado() {
		return elaborado;
	}
	public void setElaborado(String elaborado) {
		this.elaborado = elaborado;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Datos getPrediccion() {
		return prediccion;
	}
	public void setPrediccion(Datos prediccion) {
		this.prediccion = prediccion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
