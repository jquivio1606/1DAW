package EjerciciosClase;

import java.util.Scanner;

public class Ejercicio03NumeroPrimo {

	public static void main(String[] args) {
		// calcular si un número introducido por teclado es primo o no.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un múmero para saber si es primo o no:");
		int num= scan.nextInt();
		scan.close();
		boolean esPrimo = true;
		int index = 2;
		
		while (index < num && esPrimo) {
			if (num % index == 0) {
				esPrimo = false;
			}
			
			index++;
		}
		
		
		if (esPrimo) {
			System.out.printf("El número %d es primo." , num);
		} else {
			System.out.printf("El número %d no es primo" , num);
			}
		
		
				
				
				
			
	}

}
