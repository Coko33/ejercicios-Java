package ej3;

import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Barrio> barrios;
	
	public Inmobiliaria() {
		this.barrios = new ArrayList<Barrio>();
	}
	
	public boolean agregarBarrio (Barrio barrio) {
		return this.barrios.add(barrio);
	}
	
	public void mostrarPropiedades() {
		for (Barrio b : this.barrios) {
			System.out.println("---" + b.getNombre() + "---");
			for (Propiedad p : b.getPropiedades()) {
				System.out.println(p.getDomicilio() + " $" + p.getPrecio());
			}
		}
	}
	
	public ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> barriosMax = new ArrayList<Barrio>();
		int maxProp = 0;
		for (Barrio b : this.barrios) {
			if (b.getPropiedades().size() > maxProp) {
				maxProp = b.getPropiedades().size();
			}
		}
		for (Barrio b : this.barrios) {
			if (b.getPropiedades().size() == maxProp) {
				barriosMax.add(b);
			}
		}
		return barriosMax;		
	}
	
	public void mostrarBarrioMaxProp() {
		for(Barrio b : this.obtenerBarrioMaxProp()) {
			System.out.println(b.getNombre());
		}
	}
	 public void cambiarPropiedadDebarrio(String domicilio, Barrio nuevoBarrio) {
		 Propiedad propiedadAMover = null;
		 for (Barrio b : this.barrios) {
			 if (propiedadAMover == null) {
				 int i = 0;
				 while(i < b.getPropiedades().size() && propiedadAMover == null) {
					 if (b.getPropiedades().get(i).getDomicilio() == domicilio) {
						 propiedadAMover = b.removerPropiedad(i);
					 } else {
						 i++;
					 }
				 }
			 }
		 }
		 nuevoBarrio.getPropiedades().add(propiedadAMover);
	 }
	 public boolean borrarPropiedad(String domicilio) {
		 boolean borradoOk = false; 
		 int j = 0;
		 while (!borradoOk && j < this.barrios.size()) {
				 int i = 0;
				 while(i < barrios.get(j).getPropiedades().size() && !borradoOk) {
					 if (barrios.get(j).getPropiedades().get(i).getDomicilio() == domicilio) {
						 barrios.get(j).removerPropiedad(i);
						 borradoOk = true;
					 } else {
						 i++;
					 }
				 }
			 j++;
		 }
		 return borradoOk;
	 }
}
