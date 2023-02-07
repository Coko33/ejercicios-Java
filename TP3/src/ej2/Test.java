package ej2;

public class Test {

	public static void main(String[] args) {
		Empresa laSuipachense = new Empresa();
		Sector logistica = new Sector("Logística");
		Sector finanzas = new Sector("Finanzas");
		Oficina pagos = new Oficina("Pagos");
		Oficina cobros = new Oficina("Cobranzas");
		Oficina reparto = new Oficina("Reparto");
		Oficina packaging = new Oficina("Packaging");
		Empleado empleado1 = new Empleado("Norberto Norbert", 23984637);
		Empleado empleado2 = new Empleado("Micaela Mics", 29849533);
		Empleado empleado3 = new Empleado("Ricardo Richi", 32398463);
		Empleado empleado4 = new Empleado("Pliar Pila", 19237361);
		Empleado empleado5 = new Empleado("Santiago Sanchez", 26323997);
		Empleado empleado6 = new Empleado("Lucas Lucs", 82312834);
		Empleado empleado7 = new Empleado("Romina Roma", 89237473);
		Empleado empleado8 = new Empleado("Lorena lorenz", 81236733);
		
		laSuipachense.agregarSector(finanzas);
		laSuipachense.agregarSector(logistica);
		finanzas.agregarOficina(cobros);
		finanzas.agregarOficina(pagos);
		logistica.agregarOficina(packaging);
		logistica.agregarOficina(reparto);
		cobros.agregarEmpleado(empleado8);
		cobros.agregarEmpleado(empleado7);
		pagos.agregarEmpleado(empleado6);
		pagos.agregarEmpleado(empleado5);
		packaging.agregarEmpleado(empleado4);
		packaging.agregarEmpleado(empleado3);
		reparto.agregarEmpleado(empleado2);
		reparto.agregarEmpleado(empleado1);
		
		laSuipachense.mostrarEmpleados();
	}

}
