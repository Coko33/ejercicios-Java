package ej1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona persona1 = new Persona("Mario", 34, 32456987);
//		Persona persona2 = new Persona("Josefina", 33, 34758911);
		Agenda agenda1 = new Agenda();
		System.out.println(agenda1.agregarPersona("Mario", 34, 32456987, "Peru 453"));
		System.out.println(agenda1.agregarPersona("Josefina", 33, 34758911, "Rawson 493"));
		System.out.println(agenda1.agregarPersona("Mauricio", 34, 39872456, "Ignacio Rivas 1203"));
//		System.out.println(agenda1.removerPersona(34758911).getNombre());
//		System.out.println(agenda1.buscarPersona(34758911).getDomicilio());
//		System.out.println(agenda1.modificarDomicilio(34758911, "Viedma 394"));
//		System.out.println(agenda1.buscarPersona(34758911).getDomicilio());
//		System.out.println(agenda1.devolverUltimo());
		agenda1.listarNombres();
		agenda1.eliminarTodosElementosAMano();
		agenda1.listarNombres();
		
	}

}
