package ej4;

import java.util.ArrayList;

public class Duenio {
	private String nombre;
	private Perchero perchero;
	private ArrayList<Perro> perros;
	private boolean paseando;
	
	public Duenio(Perchero perchero) {
		this.nombre = "Juan";
		this.perchero = perchero;
		this.perros = new ArrayList<Perro>();
		this.paseando = false;
	}
	
	public void agregarPerro(Perro perro) {
		this.perros.add(perro);
	}
	
	public Perro llamarPerro(String nombrePerro) {
		Perro perroBuscado = null;
		int i = 0;
		while(perroBuscado == null && i < this.perros.size()) {
			if (this.perros.get(i).getNombre() == nombrePerro) {
				perroBuscado = this.perros.get(i);
			} else {
				i++;
			}
		}
		perroBuscado.responderLLamado();
		return perroBuscado;
	}
	
	public boolean colocarCollar(String nombrePerro) {
		boolean collarColocado = false;
		Collar collarBuscado = this.perchero.buscarCollar(nombrePerro);
		Perro perroBuscado = this.llamarPerro(nombrePerro);
		if (collarBuscado != null && perroBuscado != null) {
			perroBuscado.setCollar(collarBuscado);
			collarColocado = true;
		}
		return collarColocado;
	}
	
	public boolean pasear(String nombrePerro) {
		boolean collarColocado = this.colocarCollar(nombrePerro);
		if (collarColocado) {
			this.paseando = true;
		}
		return this.paseando;
	}
	
	public void terminarPaseo() {
		for (Perro p : this.perros) {
			Collar collar = p.soltarCollar();
			if (collar != null) {
				this.perchero.colgarCollar(collar);
			}
		}
	}
	
	public void mostrarEstado() {
		System.out.println("*En el perchero*");
		
	}
}
