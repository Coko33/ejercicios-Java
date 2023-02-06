package ej4;

import java.util.ArrayList;

public class Perchero {
	private ArrayList<Collar> collares;
	
	public Perchero() {
		this.collares = new ArrayList<Collar>();
	}
	
	public void agregarCollar(Collar collar) {
		this.collares.add(collar);
	}
	
	public Collar buscarCollar(String nombre) {
		Collar collarEncontrado = null;
		int i = 0;
		while(collarEncontrado == null && i < collares.size()) {
			if (collares.get(i).getNombreChapita() == nombre) {
				collarEncontrado = this.collares.remove(i);
			} else {
				i++;
			}
		}
		return collarEncontrado;
	}
	
	public void colgarCollar(Collar collar) {
		this.collares.add(collar);
	}
	
	public ArrayList<String> collaresToString() {
		ArrayList<String> collares = new ArrayList<String>();
		for (Collar c : this.collares) {
			collares.add(c.getNombreChapita());
		}
		return collares;
	}
}
