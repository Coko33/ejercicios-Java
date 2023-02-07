package ej4;

public class Test {

	public static void main(String[] args) {

		Collar collar1 = new Collar("Pichichus");
		Collar collar2 = new Collar("Sultan");
		Perro pichichus = new Perro("Pichichus");
		Perro sultan = new Perro("Sultan");
		Perchero perchero1 = new Perchero();
		perchero1.agregarCollar(collar1);
		perchero1.agregarCollar(collar2);
		Duenio juan = new Duenio(perchero1);
		juan.agregarPerro(pichichus);
		juan.agregarPerro(sultan);
		
		juan.pasear("Pichichus");
		juan.pasear("Sultan");
		
		System.out.println("*Collares en el perchero*");
		System.out.println(perchero1.collaresToString());
		System.out.println("*Collares en perros*");
		System.out.println("Pichichus: " + pichichus.tieneCollar());
		System.out.println("Sultan: " + sultan.tieneCollar());
		
		juan.terminarPaseo();
		
		System.out.println("*Collares en el perchero*");
		System.out.println(perchero1.collaresToString());
		System.out.println("*Collares en perros*");
		System.out.println("Pichichus: " + pichichus.tieneCollar());
		System.out.println("Sultan: " + sultan.tieneCollar());
	}

}
