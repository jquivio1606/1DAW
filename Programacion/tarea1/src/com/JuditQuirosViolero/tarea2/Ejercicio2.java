package com.JuditQuirosViolero.tarea2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	/*	2. Construye un programa que simule el juego de la adivinanza de un número. 
		  El ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene 
		  cinco oportunidades para acertarlo. 
		  Después de cada intento el programa debe indicarle al usuario si el número 
		  introducido por él es mayor, menor o igual al número a adivinar, y el número de
		  intentos restantes.
		 
		  Nota: para generar el valor aleatorio puede emplearse la sentencia:
		  int aleatorio = (int) (100*Math.random()+1);											*/

		System.out.println("El ordenador generará un número aleatorio de 1-100 y tienes 5 intentos para acertalo.");
		
		int aleatorio = (int) (100*Math.random()+1);
		
		Scanner scan = new Scanner(System.in);
		
		int intentos = 5;
		
		do {
		
			System.out.println("Inserte un número: ");
			int num = scan.nextInt();
			
		if (aleatorio == num) {
			System.out.println("Has acertado el número elegido por el ordenador era: " + aleatorio);
			break;
		} else { 
			if (num < aleatorio) {
				intentos--;
				System.out.println( num + " es más pequeño que el número elegido por el ordenador. Te quedan " + intentos + " intentos restantes");
				
			} else {
				intentos--;
				System.out.println( num + " es más grande que el número elegido por el ordenador. Te quedan " + intentos + " intentos restantes");
				
			}
		}
		} while (intentos > 0); 
		
		
		if (intentos == 0) {
            System.out.println("Agotaste tus intentos. El número a adivinar era: " + aleatorio);
		}
		scan.close();
	}
}
			
		
	


