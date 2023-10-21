package PracticaCasa;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
		// ActividadesExtras. Ejercicio 17:

		/*
			17. Escribe un programa que diga si un número introducido por teclado es o no
		 	  primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 	  unidad.
		
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para saber si es primo o no");
		int num = scan.nextInt();
		
			if ( !(num / num == 1) &&  !(num / 1 == num) ) {
				System.out.println(num + " no es un número primo.");
				
			} else {
				System.out.println(num + " es un número primo.");
			}
		
			
			
		scan.close();
			
		
		
	}
}
