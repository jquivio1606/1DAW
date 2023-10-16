package com.JuditQuirosViolero.tarea2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/* 1. Escribe un programa con una cadena de texto que contenga una contraseña cualquiera. 
		 * Después se pedirá al usuario que introduzca la contraseña, con 3 intentos. 
		 * Cuando acierte mostrará un mensaje de éxito. Si excede el número de intentos, 
		 * avisa del error y termina el programa. 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String contraseña = "abcd";
		
		int intentos = 3;
				
		while (intentos > 0) {
		
			System.out.println("Introduce la contraseña: ");
			String intento = scan.nextLine();
		
				if (intento != contraseña) {
					System.out.println("Has acertado la contrseña, puedes continuar.");
					break;
				} else {
					System.out.println("Esa no es la contraseña. Te quedan: " + (--intentos) + " intentos.Prueba denuevo:");
				}
		
		} if (intentos == 0) {
			System.out.println("Esa no es la contraseña. Has agotado los intentos.");
		}
			
		scan.close();

		
	//NO ESTÁ TERMINADO
	
		
		
	}	
}
