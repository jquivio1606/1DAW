package Tema2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 		EJERCICIO 6 - Crea una clase y llámala UtilidadesEj03. Dentro de esta clase crea un método para cada tipo de dato primitivo llamado 
		 		introduce[TIPO]	que recibirá una cadena de texto como parámetro para poder pedir que se introduzcan desde teclado un valor de tipo:
					 int
					 float
					 double
					 boolean
					 char
				Estos métodos deberán de ser estáticos para poderlos llamar desde la clase. Se accederán a los métodos mediante un menú y pasaremos 
				un mensaje que se muestre al usuario antes de recoger la información por teclado. Los métodos deben de devolver el dato que se ha 
				recogido por teclado si no se ha producido un error con el tipo correspondiente.
				En caso de que se produzca un error, se volverá a pedir que se introduzca un valor. 
		 
		 */

		
		int opcion;
		Scanner scan = new Scanner (System.in);
			
		do {
			
			System.out.println("----------------|MENÚ|--------------- \n" 
					+ "¿Qué tipo de dato quieres crear? \n"
					+ " 1. Entero\r\n"
					+ " 2. Float\r\n"
					+ " 3. Double\r\n"
					+ " 4. Boolean\r\n"
					+ " 5. Char\r\n"
					+ " 0. Salir\r\n"
					+ "------------------------------------ \n" 
					+ "Elige un valor:");
			
				boolean datoCorrecto = false;
				opcion = scan.nextInt();
				
				switch (opcion) {	
					case 1: 
						
						while (!datoCorrecto) {
							int entero = 0;
							
							try {
								
								System.out.println("Has elegido crear un entero. Introduce su valor:");
								entero = UtilidadesEj09.introduceInt (scan.next());
								
								datoCorrecto = true;
								
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							
							System.out.printf("Has creado un entero con el valor %d \n ", entero);
						}	
						
						break;
					
					case 2: 
						
						while (!datoCorrecto) {
							float decimalFloat = 0;
							
							try {
								
								decimalFloat = UtilidadesEj09.introduceFloat (scan.next());
								datoCorrecto = true;
								
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							
							System.out.printf("Has creado un entero con el valor %d", decimalFloat);
						}
						
						break;
						
					case 3: 
						
						while (!datoCorrecto) {
							Double decimalDouble = 0d;
							
							try {
								
								decimalDouble = UtilidadesEj09.introduceDouble (scan.next());
								datoCorrecto = true;
								
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							
							System.out.printf("Has creado un entero con el valor %d", decimalDouble);
						}	
						
						break;
						
					case 4: 
						
						while (!datoCorrecto) {
							boolean booleano = false;
							
							try {
								
								booleano = UtilidadesEj09.introduceBoolean (scan.next());
								datoCorrecto = true;
								
							} catch (Exception e) {
								System.out.println(e.getMessage());
							}
							
							System.out.printf("Has creado un entero con el valor %d", booleano);
						}
						
						break;
						
					default:
							System.out.println("Hasta luego!");
						break;				
				}
				
			
				
		} while (opcion != 0);
		
		scan.close();
			
	}
	
}
