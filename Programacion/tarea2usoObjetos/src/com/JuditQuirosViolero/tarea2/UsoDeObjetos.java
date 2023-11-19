package com.JuditQuirosViolero.tarea2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsoDeObjetos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean salir = true;
	try {
		
		do {
				System.out.println("-------------------|MENÚ|------------------ \n" 
						+ "¿Qué tipo de operación quieres realizar? \n"
						+ " 1. LetraDNI\r\n"
						+ " 2. NifCorrecto\r\n"
						+ " 3. AreaCirculo\r\n"
						+ " 4. Factorial\r\n"
						+ " 5. EsPalindromo\r\n"
						+ " 6. EsHeterograma\r\n"
						+ " 7. ContarVocales\r\n"
						+ " 8. ContarPalabras \r\n"
						+ " 9. Calcularedad\r\n"
						+ " 10. EsAnioBisiesto\r\n"
						+ " 11. CalcularDiferenciasFechas\r\n"
						+ " 12. EsFechaPasada\r\n"
						+ " 0. Salir\r\n"
						+ "------------------------------------------ \n" 
						+ "Elige un valor:");
							
			
			
			int opcion = scan.nextInt();
				
			switch (opcion) {	
				case 1: 
					System.out.println("Introduce el DNI sin letra, para saber tu letra asociada:");
					int DNI= scan.nextInt();
					
					String LetraDNI = UtilidadesMatematicas.LetraDNI(DNI);
					System.out.printf("Para el DNI %d el NIF es: %s \n", DNI, LetraDNI);
					
					break;
				
				case 2: 
					System.out.println("Introduce el DNI sin letra:");
					int Dni= scan.nextInt();
					scan.nextLine();
					System.out.println("Introduce la letra de tu DNI:");
					String LetraNif = scan.nextLine();
					
					boolean nifCorrecto = UtilidadesMatematicas.NifCorrecto(Dni,LetraNif);
					
					if (nifCorrecto) {
						System.out.printf("Es correcto. El NIF %s corresponde al DNI: %d \n", LetraNif, Dni);
					} else {
						System.out.printf("El NIF %s no corresponde con el DNI %d \n", LetraNif, Dni );
					}
					
					break;
				
				case 3: 
					System.out.println("Introduce el radio del círculo para calcular el área:");
					double radio= scan.nextDouble();
					
					double areaCirculo = UtilidadesMatematicas.AreaCirculo(radio);
					System.out.printf("El área de un círculo cuyo radio es %f es igual a: %f \n", radio, areaCirculo);
					
					break;
	
				case 4:
					System.out.println("Introduce un número para saber el factorial:");
					int numF = scan.nextInt();
					
						if (numF < 0) {
							System.out.println("No se puede introducir un número negativo.");
						} else {
							long resultado = UtilidadesMatematicas.Factorial(numF);
							System.out.printf("El factorial del número %d es: %d \n", numF, resultado);
						}
					
					break;
				
				case 5:
					System.out.println("Escribe una cadena de texto para saber si es un palindromo. ");
					String palabra1 = scan.next();
										
					boolean esPalindromo = UtilidadesCadenasTexto.EsPalindromo(palabra1);
					if (esPalindromo) {
						System.out.printf("La palabra \"%s\" es un Palindromo. \n", palabra1);
					} else {
						System.out.printf("La palabra \"%s\" No es un Palindromo. \n", palabra1);
					}
					
			        break;
			        
				case 6: 
					System.out.println("Escribe una cadena de texto para saber si es un heterograma. ");
					String palabra2 = scan.next();
					
					
					if (UtilidadesCadenasTexto.EsPalindromo(palabra2)) {
						System.out.printf("La cadena \"%s\" No un Heterograma. \n", palabra2);
					} else {
						System.out.printf("La cadena \"%s\" es es un Heterograma. \n", palabra2);
					}
					
					break;
			
				case 7: 
					System.out.println("Escribe una palabra o cadena de texto para saber si cuantas vocales tiene: ");
					String cad = "El murciélago zanquilargo vuela hacia el cielo azul."; // Si se hace con el scan.next solo coge la primera palabra, y con scan.nextLine sale un error.
					
					System.out.printf("La cadena \"%s\" tiene: \n%s" , cad , UtilidadesCadenasTexto.ContarVocales(cad));
					
					break;
					
				case 8: 
					System.out.println("Escribe una cadena para saber cuantos palabras tiene.");		
					String cad4= "Hola buenos días a todo el mundo, menos a uno.";
					
					System.out.printf("La cadena: \"%s\" Tiene %d palabras. \n", cad4, UtilidadesCadenasTexto.ContarPalabras(cad4));
										
					break;
				
				case 9: 
					
					try {
						System.out.println("Escribe tu fecha de nacimiento con formato (dd/MM/yyyy): ");
						String fechaNacString = scan.next();					
					
						System.out.printf("Tienes %d años.\n", UtilidadesFechas.CalcularEdad(fechaNacString));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
				
				case 10:
					
					try {
						System.out.println("Introduce un año para saber si es bisiesto o no: ");
						String anio = scan.next();
										
						if (UtilidadesFechas.EsAnioBisiesto(anio)) {
							System.out.printf("El año %s es un año bisiesto. \n", anio);
						} else {
							System.out.printf("El año %s NO es un año bisiesto. \n", anio);					
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
			
				case 11:
					
					try {
						System.out.println("Introduce una fecha. ");
						String fecha1 = scan.next();
						System.out.println("Introduce otra fecha para compararla con la anterior.");
						String fecha2 = scan.next();
					
						System.out.println(UtilidadesFechas.CalcularDiferenciasFechas(fecha1, fecha2));
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
									
					break;
					
				case 12: 
					
					try {
						 System.out.println("Introduce una fecha para saber si ya ha pasado o no.");
						 String fecha = scan.next();
						
						if (UtilidadesFechas.EsFechaPasada(fecha)) {
							System.out.printf("La fecha %s es posterior a la fecha actual. \n", fecha);
						} else {
							System.out.printf("La fecha %s es anterior a la fecha actual. \n", fecha);					
						}
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				
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

	} catch (InputMismatchException ime) {
		System.out.println("No has introducido un valor numérico. Por favor, introduce uno");
	}


		
	
	}

}
