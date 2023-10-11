package Ejerciciosclase;

public class Ejercicio20 {

	public static void main(String[] args) {
		

		//EJERCICIO TIPO ENUMERADO
		
	/*	
		enum Día {LUNES , MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
		Día diaActual = Día.LUNES;
		switch (diaActual) {
case LUNES:
			
	System.out.println("Es entre semana");
			break;
case MARTES:
			
	System.out.println("Es entre semana");
			break;
case MIERCOLES:
	
	System.out.println("Es entre semana");
			break;
case JUEVES:
	
	System.out.println("Es entre semana");
			break;
case VIERNES:
	
	System.out.println("Es entre semana");
			break;
case SABADO:
	
	System.out.println("Es fin de semana");
			break;
case DOMINGO:
	
	System.out.println("Es fin de semana");
			break;
				
		}
		*/
		
		//SOLUCIÓN DOS
		enum Día {LUNES , MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
		Día diaActual = Día.LUNES;
		switch (diaActual) {
case LUNES:
case MARTES:
case MIERCOLES:
case JUEVES:
case VIERNES:
	
	System.out.println("Es entre semana");
			break;
case SABADO:
case DOMINGO:
	
	System.out.println("Es fin de semana");
			break;
		
		}

	}
}
