package EjerciciosClaseTema2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean salir = true;
	
		do {
		
			System.out.println("-------------------|MENÚ|------------------ \n" 
				+ "¿Qué tipo de operación quieres realizar? \n"
				+ " 1. Calcularedad\r\n"
				+ " 2. esAnioBisiesto\r\n"
				+ " 3. calcularDiferenciasFechas\r\n"
				+ " 4. esFechaPasada\r\n"
				+ " 5. obtenerDiaSemana\r\n"
				+ " 6. sumarDias\r\n"
				+ " 7. restarDias\r\n"
				+ " 8. obtenerMes\r\n"
				+ " 9. formatearFecha\r\n"
				+ " 10. esFechaValida\r\n"
				+ " 0. Salir\r\n"
				+ "------------------------------------------ \n" 
				+ "Elige un valor:");
		
		
		int opcion = scan.nextInt();
		
		switch (opcion) {	
			case 1: 
				try {
				System.out.println("Escribe tu fecha de nacimiento con formato (dd/MM/yyyy): ");
				String fechaNacString = scan.next();
				
				System.out.printf("Tienes %d años.\n", UtilidadesEj12.CalcularEdad(fechaNacString));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			
			case 2: 
				System.out.println("Introduce un año para saber si es bisiesto o no: ");
				String anio = scan.next();
				
			try {
				if (UtilidadesEj12.EsAnioBisiesto(anio)) {
					System.out.printf("El año %s es un año bisiesto. \n", anio);
				} else {
					System.out.printf("El año %s NO es un año bisiesto. \n", anio);					
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
				break;
		
			case 3: 
				System.out.println("Introduce una fecha. ");
				String fecha1 = scan.next();
				System.out.println("Introduce otra fecha para compararla con la anterior.");
				String fecha2 = scan.next();
				
				try {
					System.out.println(UtilidadesEj12.CalcularDiferenciasFechas(fecha1, fecha2));
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				break;
				
			case 4: 
				
				 System.out.println("Introduce una fecha para saber si ya ha pasado o no.");
				 
				String fecha = scan.next();
				
				try {
					if (UtilidadesEj12.EsFechaPasada(fecha)) {
						System.out.printf("La fecha %s es posterior a la fecha actual. \n", fecha);
					} else {
						System.out.printf("La fecha %s es anterior a la fecha actual. \n", fecha);					
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				break;
				
			case 5: 
				
				break;
				
			case 6: 
				
				break;
				
			case 7: 
				
				break;
				
			case 8: 
				
				break;
				
			case 9: 
				
				
				break;
				
			case 10: 
				
				
				break;
			
			case 11: 
				
				
				break;
				
			case 12:
				
				
				break;
				
			case 0: 
				salir = false;
				
				break;	
				
			default:

				break;				
		}
		
		
		
		
	} while (salir);
		
		scan.close();
	
		System.out.println("Hasta luego!");
		
		
		
		
		

	}

}
