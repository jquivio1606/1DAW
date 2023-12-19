package boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		  EJERCICIO 4 - Implementa un programa con tres funciones:
                    - void imprimePositivo(int p): Imprime el valor p. Lanza ˜Exceptiones si p < 0
                    - void imprimeNegativo(int n): Imprime el valor n. Lanza ˜Exceptiones si p >= 0
                    - La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con distintos valores, 
                    hacer un bucle para pedir valores por teclado y pasarlos a las funciones. Maneja las posibles excepciones.
	  
		 */
		Scanner scan = new Scanner (System.in);
		
		
		
		while (true) {
			
			try {				
				System.out.println("Introduce un número negativo: ");
				imprimenegativo(scan.nextInt());
				
				System.out.println("Introduce un número positivo: ");
				imprimepositivo(scan.nextInt());
					
			} catch (InputMismatchException ime) {
				System.out.println("Solo se pueden introducir número enteros.");
				scan.next();
			} catch (Exception e) {
				System.out.printf("ERROR. %s \n", e.getMessage());				
			}
			

			scan.close();
		}
			
	}
	
	private static void imprimepositivo (int p) throws Exception {
		if ( p < 0) {
			throw new Exception("El número debe ser positivo \n");
		} else {
			System.out.println(p);
		}
		
	}
        
	private static void imprimenegativo (int n) throws Exception {
		if ( n >= 0) {
			throw new Exception("El número debe ser negativo \n");
		} else {
			System.out.println(n);
		}
	}
	

}
