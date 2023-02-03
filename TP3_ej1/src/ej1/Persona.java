package ej1;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private String domicilio;
	
	public Persona(String nombre, int edad, int dni, String domicilio) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return this.dni;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getDomicilio() {
		return this.domicilio;
	}
}
