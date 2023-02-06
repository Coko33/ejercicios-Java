package ej4;

public class Perro {
	private String nombre;
	private Collar collar;
	private boolean moviendoCola;
	
	public Perro(String nombre) {
		this.nombre = nombre;
		this.collar = null;
		this.moviendoCola = false;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void responderLLamado() {
		this.moviendoCola = true;
	}
	
	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	
	public Collar soltarCollar() {
		Collar collar = this.collar;
		this.collar = null;
		return collar;
	}
	
	public String tieneCollar() {
		String collar = "no tiene.";
		if (this.collar != null) {
			collar = this.collar.getNombreChapita();
		}
		return collar;
	}
}

