package Tema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		System.out.println("----------------|MENÚ|--------------- \n" 
				+ "¿Qué tipo de dato quieres crear? \n"
				+ " 1. a\r\n"
				+ " 2. EsPrimo\r\n"
				+ " 3. Double\r\n"
				+ " 4. Boolean\r\n"
				+ " 5. Char\r\n"
				+ " 0. Salir\r\n"
				+ "------------------------------------ \n" 
				+ "Elige un valor:");
		
			Scanner scan = new Scanner(System.in);
			int opcion = scan.nextInt();
		do {
			
			switch (opcion) {	
				case 1: 
					
					
					break;
				
				case 2: 
					System.out.println("Introduce un número para saber si es primo o no:");
					int i = scan.nextInt();
					scan.close();
					if (UtilidadesEj10.EsPrimo(i)) {
						System.out.printf("El número %d es primo.\n", i);
					} else {
						System.out.printf("El número %d NO es primo.\n", i);			
					}
					
					break;
					
				case 3: 
					
					
					break;
					
				case 4: 
					
					break;
				case 5: 
					
					
					break;
					
				default:
						System.out.println("Hasta luego!");
					break;				
			}
			
		
			
	} while (opcion != 0);
	
	
		scan.close();
		
		
		
		
	}

}
