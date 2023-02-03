package ej2;

import java.util.ArrayList;

public class Oficina {
	private ArrayList<Empleado> empleados;
	private String nombre;
	
	public Oficina(String nombre) {
		this.empleados = new ArrayList<Empleado>();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean agregarEmpleado(Empleado empleado) {
		 return this.empleados.add(empleado);
	}
	
	public ArrayList<Empleado> getEmpleados () {
		return this.empleados;
	}
}
