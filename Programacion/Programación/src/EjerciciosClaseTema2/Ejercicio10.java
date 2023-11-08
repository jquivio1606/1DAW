package Tema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		System.out.println("----------------|MENÚ|--------------- \n" 
				+ "¿Qué tipo de dato quieres crear? \n"
				+ " 1. EsCapicua\r\n"
				+ " 2. EsPrimo\r\n"
				+ " 3. SiguientePrimo\r\n"
				+ " 4. Potencia\r\n"
				+ " 5. Digitos\r\n"
				+ " 0. Salir\r\n"
				+ "------------------------------------ \n" 
				+ "Elige un valor:");
		
			Scanner scan = new Scanner(System.in);
			int opcion = scan.nextInt();
		do {
			
			switch (opcion) {	
				case 1: 
					System.out.println("Introduce un número para saber si es capicua o no:");
					int num = scan.nextInt();
					scan.close();
					
					if (UtilidadesEj10.EsCapicua(num)) {
						System.out.printf("El número %d es capicua.\n", num);
					} else {
						System.out.printf("El número %d NO es capicuo.\n", num);			
					}
				
					
					break;
				
				case 2: 
					System.out.println("Introduce un número para saber si es primo o no:");
					long i = scan.nextInt();
					scan.close();
					
					if (UtilidadesEj10.EsPrimo(i)) {
						System.out.printf("El número %d es primo.\n", i);
					} else {
						System.out.printf("El número %d NO es primo.\n", i);			
					}
					break;
					
				case 3: 
					System.out.println("Introduce un número para saber el siguiente número primo:");
					int inicio = scan.nextInt();
					scan.close();
				
					long siguientePrimo= UtilidadesEj10.SiguientePrimo(inicio);
				
					System.out.printf("El siguiente número primo despues de %d es: %d \n", inicio, siguientePrimo);
					
					break;
					
				case 4: 
					System.out.println("Introduce el número base :");
					int base = scan.nextInt();
					System.out.println("Introduce el exponente :");
					int exponente = scan.nextInt();
					scan.close();
					
					long result= UtilidadesEj10.Potencia(base, exponente);
					System.out.printf("El resultado de hacer %d elevado a %d es igual a: %d \n", base, exponente, result);
					
					break;
					
				case 5: 
					System.out.println("Introduce un número para saber la cantidad de digitos que contiene:");
					int num1 = scan.nextInt();
					scan.close();
					
					int digitos = UtilidadesEj10.Digitos(num1);
					System.out.printf("El número de digitos que tiene %d es: %d \n", num1, digitos);
					
					break;
					
				default:
						System.out.println("Hasta luego!");
					break;				
			}
			
		
			
	} while (opcion != 0);
	
	
		scan.close();
		
		
		
		
	}


}
