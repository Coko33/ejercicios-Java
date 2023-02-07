package ej2;

import java.util.ArrayList;

public class Sector {
	private ArrayList<Oficina> oficinas;
	private String nombre;

	public Sector(String nombre) {
		this.oficinas = new ArrayList<Oficina>();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public boolean agregarOficina(Oficina oficina) {
		return this.oficinas.add(oficina);
	}

	public ArrayList<Oficina> getOficinas() {
		return this.oficinas;
	}
}
