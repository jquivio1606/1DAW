package Tema2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
	
		/*	  EJERCICIO 1 -	Crea una aplicación que muestre el siguiente menú:
				1.- Añadir
				2.- Borrar
				3.- Modificar
				4.- Mostrar por pantalla
				5.- Finalizar
				
				Este menú se mostrará indefinidamente tras la elección de opción hasta que se pulse finalizar, o bien se introduzca una opción no contemplada, 
				de lo cual informará y mostrará de nuevo el menú.
				El menú debe de estar en un método que se llame mostrarMenu que devolverá el número con la última opción seleccionada y que será llamado 
				desde el main.
		*/
		
		
		/*
			  EJERCICIO 2 -  Crea un método adicional en el ejercicio anterior que sea capaz de insertar 10 saltos de línea en la salida estándar. 
			  Utilízalo cuando creas que es necesario en la aplicación.
		
		 */
		
					
		
		int opcion= 0;
		
		do {			
			opcion = mostrarMenu();
			
			switch (opcion) {
			
			case 1: 
			System.out.println("La opción elegida es AÑADIR \n");
				
				break;
			case 2: 
				System.out.println("La opción elegida es BORRAR \n");
				
				break;
			case 3:
				System.out.println("La opción elegida es MODIFICAR \n");
				
				break;
			case 4:
				System.out.println("La opción elegida es MOSTRAR PANTALLA \n");
				
				break;
			case 5: 
				
				saltosDeLinea(5);
				System.out.println("Adiós!!");
				break;
			default:
				saltosDeLinea(3);
				System.err.println("Opción no válida, por favor eliga otra. \n");
				
				break;	
			}
			
			
			
		} while (opcion !=5);
		
		
		
		
	}
	

	private static int mostrarMenu() {
		
		int opcionseleccionada = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------|Menú|----------- \r\n"
				+ " 1.- Añadir\r\n"
				+ " 2.- Borrar\r\n"
				+ " 3.- Modificar\r\n"
				+ " 4.- Mostrar por pantalla\r\n"
				+ " 5.- Finalizar\r\n"
				+ "---------------------------- \n"
				+ "Elige una opción");
		opcionseleccionada = scan.nextInt();
			
		
		
		return opcionseleccionada;
		
	}
	
	private static void saltosDeLinea (int saltos) {
	 		
		for (int i = 1 ; i <= saltos ; i++) {
			System.out.println("");
			
		}
		
		
	}

}
