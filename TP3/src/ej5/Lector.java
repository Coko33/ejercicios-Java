package ej5;

import java.util.Calendar;
import java.util.Date;

public class Lector {

	public static Date variarFecha(Date fecha, int campo, int valor){
	      if (valor==0) return fecha;
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); 
	      calendar.add(campo, valor); 
	      return calendar.getTime(); 
	}
}
