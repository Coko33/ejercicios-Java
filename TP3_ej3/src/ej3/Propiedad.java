package ej3;

public class Propiedad {
	private String domicilio;
	private int precio;
	private TipoPropiedad tipo;
	
	public Propiedad(String domicilio, int precio, TipoPropiedad tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}
	public String getDomicilio() {
		return this.domicilio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public TipoPropiedad getTipo() {
		return this.tipo;
	}
}
