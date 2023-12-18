package boletin3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		  EJERCICIO 3 - Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner), calcula A/B y muestra 
		  el resultado por pantalla. Se deberán tratar de forma independiente las dos posibles excepciones, InputMismatchException 
		  y ArithmeticException, mostrando un mensaje de error indicativo del error en cada caso.
	  
	 */

	Scanner scan = new Scanner(System.in);

	System.out.println("Vamos a realizar la operacion A/B. \n" + "Introduce un valor para A: ");

	try {

		int A = scan.nextInt();
		System.out.println("Introduce un valor para B: ");
		int B = scan.nextInt();
		double result = A / B;
		System.out.printf("%d / %d = %f", A, B, result);

	} catch (InputMismatchException ime) {

		System.out.println("Tanto A como B deben ser números enteros.");

	} catch (ArithmeticException ae) {

		System.out.println("B no puede ser 0, no existe solución real a una división entre 0.");
	}

	scan.close();

	}

}
