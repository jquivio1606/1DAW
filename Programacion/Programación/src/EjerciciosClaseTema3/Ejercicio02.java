package Tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Ejercicio 1:
		
		
		Scanner scan = new Scanner (System.in);
		
		// Pasos:
		// 1. Hacemos un array. 
		
		
		int[] arrayInt = new int [10];
		
		// 2. Hacemos un bucle que pida 10 num.
				
		for ( int index = 9; index >= 0; index-- ) {
			System.out.println("Introduce un número por teclado hasta llegar a 10 números. Quedan " + (index +1) + " números por introducir." );
			
			try {
				arrayInt [index]  = scan.nextInt();
				
			} catch (InputMismatchException ime) {
				arrayInt [index]  = 0;
			}
			
		}
		
		// 3. Recorremos el array y mostramos los elementos.
		
		System.out.println("Los valores introducidos son: ");
		int posicion= 0;
		for (int num : arrayInt) {
			
			posicion++;
			System.out.println("En la posición " + posicion + ": " + num);
			
		}
		
		
		scan.close();
		

	}

}
