package Examen1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Ejercicio1
		Scanner scan = new Scanner (System.in);
		boolean salir = false;
		double notaProg = -1;
		double notaLM = -1;
		
		do {
			System.out.println("---------------|MENÚ PRINCIPAL|---------------\n"
					+ " 1 - Módulo de Programación\n"
					+ " 2 - Módulo de Lenguaje de Marcas\n"
					+ " 0 - Resumen y salida del programa\n"
					+ "----------------------------------------------");
			System.out.println("Selecciona una opción, por favor.");	
			int option = scan.nextInt();
			
			switch (option) {
			
			case 1:
				System.out.println("Por favor, introduzca una nota de Programación");
				
				if (notaLM < 0 && notaLM > 10) {
					System.out.println("La nota tiene que estra entre 0 y 10");
				} else {
					notaProg = scan.nextDouble();
				}
				
				break;
			case 2:
				System.out.println("Por favor, introduzca una nota de Lenguaje de Marcas");
				notaLM = scan.nextDouble();
				if (notaLM < 0 && notaLM > 10) {
					System.out.println("La nota tiene que estra entre 0 y 10");
				}
				
				break;
			case 0: 
				salir = true;
				break;
			default:
				System.out.println("Por favor introduce una de las opciones del menú");
				break;
			}
		} while(!salir);
		
		System.out.println("Calificaciones DAW:");
		if (notaProg == -1) {
			System.out.println("Módulo de Programación: NOEV");
		} else {
			System.out.println("Módulo de Programación: " + notaProg);
		}

		if (notaLM == -1) {
			System.out.println("Módulo de Lenguaje de Marcas: NOEV");
		} else {
			System.out.println("Módulo de Lenguaje de Marcas: " + notaLM);
		}
		
		
		scan.close();
	}

}
