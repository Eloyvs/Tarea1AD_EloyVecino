package entidades;

import java.io.Serializable;
import java.util.List;

public class Parada implements Serializable, Comparable<Parada> {

	private long id;
	private String nombre;
	private char region;
	private List<Peregrino> peregrinoParada;
	private Estancia estanciaParada;
	private Carnet carnetParada;

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

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	public List<Peregrino> getPeregrinoParada() {
		return peregrinoParada;
	}

	public void setPeregrinoParada(List<Peregrino> peregrinoParada) {
		this.peregrinoParada = peregrinoParada;
	}

	public Estancia getEstanciaParada() {
		return estanciaParada;
	}

	public void setEstanciaParada(Estancia estanciaParada) {
		this.estanciaParada = estanciaParada;
	}

	public Carnet getCarnetParada() {
		return carnetParada;
	}

	public void setCarnetParada(Carnet carnetParada) {
		this.carnetParada = carnetParada;
	}

	public Parada() {
	}

	public Parada(long id, String nombre, char region) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.region = region;
	}

	public Parada(long id, String nombre, char region, List<Peregrino> peregrinoParada, Estancia estanciaParada,
			Carnet carnetParada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.region = region;
		this.peregrinoParada = peregrinoParada;
		this.estanciaParada = estanciaParada;
		this.carnetParada = carnetParada;
	}

	@Override
	public String toString() {
		return "Parada [id=" + id + ", nombre=" + nombre + ", region=" + region + ", peregrinoParada=" + peregrinoParada
				+ ", estanciaParada=" + estanciaParada + ", carnetParada=" + carnetParada + "]";
	}

	@Override
	public int compareTo(Parada o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
