package entidades;

import java.time.LocalDate;

public class Carnet {

	private long idPeregrino;
	private LocalDate fechaExp;
	private double distancia = 0.0;
	private int nvips;

	public long getIdPeregrino() {
		return idPeregrino;
	}

	public void setIdPeregrino(long idPeregrino) {
		this.idPeregrino = idPeregrino;
	}

	public LocalDate getFechaExp() {
		return fechaExp;
	}

	public void setFechaExp(LocalDate fechaExp) {
		this.fechaExp = fechaExp;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getNvips() {
		return nvips;
	}

	public void setNvips(int nvips) {
		this.nvips = nvips;
	}

	public Carnet() {
	}

	public Carnet(long idPeregrino, LocalDate fechaExp, double distancia, int nvips) {
		super();
		this.idPeregrino = idPeregrino;
		this.fechaExp = fechaExp;
		this.distancia = distancia;
		this.nvips = nvips;
	}

	@Override
	public String toString() {
		return "Carnet [idPeregrino=" + idPeregrino + ", fechaExp=" + fechaExp + ", distancia=" + distancia + ", nvips="
				+ nvips + "]";
	}

}
