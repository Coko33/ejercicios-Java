package ej3;

public class Test {

	public static void main(String[] args) {
		Inmobiliaria rucci = new Inmobiliaria();
		Barrio almagro = new Barrio("Almagro");
		Barrio balvanera = new Barrio ("Balvanera");
		Propiedad propiedad1 = new Propiedad("Alsina 11", 70000, TipoPropiedad.Casa);
		Propiedad propiedad2 = new Propiedad("Belgrano 4200", 120000, TipoPropiedad.Casa);
		Propiedad propiedad3 = new Propiedad("Rawson 230", 90000, TipoPropiedad.PH);
		Propiedad propiedad4 = new Propiedad("Castro Barros 820", 99000, TipoPropiedad.PH);
		Propiedad propiedad5 = new Propiedad("Virrey Liniers 300", 87000, TipoPropiedad.Casa);
		rucci.agregarBarrio(almagro);
		rucci.agregarBarrio(balvanera);
		almagro.agregarPropiedad(propiedad1);
		almagro.agregarPropiedad(propiedad2);
		almagro.agregarPropiedad(propiedad3);
		balvanera.agregarPropiedad(propiedad4);
		balvanera.agregarPropiedad(propiedad5);
//		almagro.mostrarPropiedades(TipoPropiedad.PH);
//		rucci.mostrarBarrioMaxProp();
//		rucci.cambiarPropiedadDebarrio("Virrey Liniers 300", almagro);
		rucci.mostrarPropiedades();
		rucci.borrarPropiedad("Alsina 11");
		rucci.mostrarPropiedades();
	}

}
