package Tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Ejercicio 3:
		
		Scanner scan = new Scanner(System.in);
		
		int[] arrayInt = new int [10];
		
		for ( int index = 0; index < 10; index++ ) {
			System.out.println("Introduce un número por teclado hasta llegar a 10 números. Quedan " + (10 - index) + " números por introducir." );
			
			try {
				arrayInt [index]  = scan.nextInt();
				
			} catch (InputMismatchException ime) {
				arrayInt [index]  = 0;
			}
			
		}
		
		// 3. Recorremos el array y mostramos los elementos.
		
		int indMax = IndiceMaximo(arrayInt);
		int indMin = IndiceMinimo(arrayInt);
		
		System.out.println("Los valores introducidos son: ");
		
		for (int index = 0; index < arrayInt.length; index++) {						
				
			if (indMax == indMin) {
				System.out.println(arrayInt[index] + " Máximo y Mínimo");
			} else {
							
				if (index == indMax) {
					System.out.println(arrayInt[index] + " Máximo");
				} 
				
				if (index == indMin) {
					System.out.println(arrayInt[index] + " Mínimmo");
				} 
				
				if (index != indMax && index != indMin) {
					System.out.println(arrayInt[index]);
				}
			}
			
		}
		
		scan.close();
	}
		
	
	private static int IndiceMaximo (int[] array) {
		int indiceMax = Integer.MIN_VALUE;
		for (int i= 0; i < array.length; i++) {
			if (array[i] > indiceMax) {
				indiceMax = i;
			}
		}
		
		return indiceMax;
	}
	
	private static int IndiceMinimo (int[] array) {
		int indiceMin = Integer.MAX_VALUE;
		for (int i= 0; i < array.length; i++) {
			if (array[i] < indiceMin) {
				indiceMin = i;
			}
		}
		
		return indiceMin;
	}
	
	
}
