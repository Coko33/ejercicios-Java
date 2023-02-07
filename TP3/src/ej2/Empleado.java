package ej2;

public class Empleado {
	private String nombre;
	private int dni;

	public Empleado ( String nombre, int dni ) {
		this.nombre = nombre;
		this.dni = dni;
	}
		
	public String getNombre() {
		return this.nombre;
	}
}
