package ej1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;

	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}

	public Persona buscarPersona(int dni) {
		Persona personaBuscada = null;
		int i = 0;
		while (i < this.personas.size() && personaBuscada == null) {
			if (this.personas.get(i).getDni() == dni) {
				personaBuscada = this.personas.get(i);
			} else {
				i++;
			}
		}
		return personaBuscada;
	}
	
	public boolean agregarPersona(String nombre, int edad, int dni, String domicilio) {
		boolean addOk = false;
		if (this.buscarPersona(dni) == null) {
			Persona nuevaPersona = new Persona(nombre, edad, dni, domicilio);
			this.personas.add(nuevaPersona);
			addOk = true;
		}
		return addOk;
	}
	
	public Persona removerPersona(int dni) {
		Persona personaRemovida = this.buscarPersona(dni);
		if (personaRemovida != null) {
			this.personas.remove(personaRemovida);
		}
		return personaRemovida;
	}
	
	public boolean modificarDomicilio(int dni, String domicilio) {
		boolean modificacionOk = false;
		Persona personaBuscada = this.buscarPersona(dni);
		if (personaBuscada != null) {
			personaBuscada.setDomicilio(domicilio);
			modificacionOk = true;
		}
		return modificacionOk;
	}
	
	public Persona devolverUltimo() {
		Persona personaBuscada = null;
		if (!this.personas.isEmpty()) {
			personaBuscada = personas.get(personas.size() - 1);
		}
		return personaBuscada;
	}

	public void eliminarTodosElementosAMano() {
		int cantidad = this.personas.size();
		int i = 0;
		while (i < cantidad) {
			this.personas.remove(0);
			i++;
		}
	}
	
	public int devolverCantidad() {
		return this.personas.size();
	}
	
	public void listarNombres() {
		System.out.println("*LISTA DE NOMBRES*");
		for (Persona p : this.personas) {
			System.out.println(p.getNombre());
		}
	}
}
