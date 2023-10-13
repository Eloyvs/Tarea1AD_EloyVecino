package entidades;

import java.time.LocalDate;

public class Estancia {

	private long id;
	private LocalDate fecha;
	private boolean vip = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public Estancia() {
	}

	public Estancia(long id, LocalDate fecha, boolean vip) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Estancia [id=" + id + ", fecha=" + fecha + ", vip=" + vip + "]";
	}

}
