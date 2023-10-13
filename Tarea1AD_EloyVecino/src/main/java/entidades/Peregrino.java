package entidades;

import java.util.List;

public class Peregrino {

	private long id;
	private String nombre;
	private String nacionalidad;
	private List<Parada> paradaPere;
	private List<Estancia> estanciaPere;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<Parada> getParadaPere() {
		return paradaPere;
	}

	public void setParadaPere(List<Parada> paradaPere) {
		this.paradaPere = paradaPere;
	}

	public List<Estancia> getEstanciaPere() {
		return estanciaPere;
	}

	public void setEstanciaPere(List<Estancia> estanciaPere) {
		this.estanciaPere = estanciaPere;
	}

	public Peregrino() {
	}

	public Peregrino(long id, String nombre, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public Peregrino(long id, String nombre, String nacionalidad, List<Parada> paradaPere,
			List<Estancia> estanciaPere) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.paradaPere = paradaPere;
		this.estanciaPere = estanciaPere;
	}

	@Override
	public String toString() {
		return "Peregrino [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", paradaPere="
				+ paradaPere + ", estanciaPere=" + estanciaPere + "]";
	}

}
