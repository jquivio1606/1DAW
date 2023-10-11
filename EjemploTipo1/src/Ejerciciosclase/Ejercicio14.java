package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Ejercicio if/else. Comprobar si un número es par.
		
		/** Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int num = scan.nextInt();
		if ( num % 2 == 0) {
			System.out.println("El número " + num + " es par.");
		} else {
			System.out.println("El número " + num + " es impar");
		}
		
		scan.close();
		*/
		
		// Ejercicio de solo if. Pasar las horas a formato 12 horas.
		
		/** 
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();	
		System.out.println("Introduce el minuto: ");
		int min = scan.nextInt();
		System.out.println("Introduce el segundo: ");
		int seg = scan.nextInt();
		String amPm = " a.m.";
		if ( hora >12 ) {
			hora -= 12;
			amPm = "p.m.";
		}
		
		System.out.println("Son las " + hora + ":" + min + ":" + seg + " " + amPm);
		scan.close();
		
		*/
		
		
		// Ejercicio tipo switch. Te dice en que mes estamos:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número del mes que quieras: ");
		int mesNum = scan.nextInt();
		
		switch (mesNum) {
	case 1: 
			System.out.println("Enero");
		break;
		
	case 2: 
			System.out.println("Febrero");
		break;
		
	case 3: 
			System.out.println("Marzo");
		break;
		
	case 4: 
			System.out.println("Abril");
		break;
		
	case 5: 
			System.out.println("Mayo");
		break;
		
	case 6: 
			System.out.println("Junio");
		break;
		
	case 7: 
			System.out.println("Julio");
		break;
		
	case 8: 
			System.out.println("Agosto");
		break;
		
	case 9: 
			System.out.println("Septiembre");
		break;
		
	case 10: 
			System.out.println("Octubre");
		break;
		
	case 11: 
			System.out.println("Noviembre");
		break;
		
	case 12:
			System.out.println("Diciembre");
		break;
		
	default:
			System.out.println("Ese número no tiene un mes asignado");
		}
				
		scan.close();
		
	}	
}
