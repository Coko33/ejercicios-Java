package ej2;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Sector> sectores;
	
	public Empresa() {
		this.sectores = new ArrayList<Sector>();
	}
	
	public boolean agregarSector(Sector sector) {
		return this.sectores.add(sector);
	}
	
	public void mostrarEmpleados() {
		for (Sector s : sectores) {
			System.out.println("*** Sector " + s.getNombre() + " ***" );
			for (Oficina o: s.getOficinas()) {
				System.out.println("- Oficina " + o.getNombre() + " -");
				for (Empleado e: o.getEmpleados()) {
					System.out.println(e.getNombre());
				}
			}
		}
		
	}
}
