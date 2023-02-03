package ej3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public boolean agregarPropiedad(Propiedad propiedad) {
		return propiedades.add(propiedad);
	}
	
	public void mostrarPropiedades(TipoPropiedad tipo) {
		for (Propiedad p : this.propiedades) {
			if (p.getTipo() == tipo) {
				System.out.println(p.getDomicilio() + " $" + p.getPrecio());
			}
		}
	}
	
	public ArrayList<Propiedad> getPropiedades() {
		return this.propiedades;
	}
	public String getNombre() {
		return this.nombre;
	}
	public Propiedad removerPropiedad(int i) {
		return this.propiedades.remove(i);
	}
}
