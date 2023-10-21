package EjerciciosClaseTema1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el día en que naciste: ");
		int dia =  scan.nextInt();
		System.out.println("Introduce el mes en que naciste en número del 1 al 12: ");
		int mes =  scan.nextInt();
		boolean correcto = true;
		String horoscopo = null;
		scan.close();
		
		switch (mes) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: 
			if (dia >=1 && dia <=31) {
				correcto = true;
			}
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11:
			if (dia >=1 && dia <=30) {
				correcto = true;
			}
			break;
		case 2: 
			if (dia >=1 && dia <=29) {
				correcto = true;
			}
			break;
		default: 
			System.out.println("El mes introducido no existe, inserte un mes del 1 al 12: ");
				correcto = false;
		}
		
		if (correcto) {
			switch (mes) {
			case 1:
				if (dia < 21) {
				horoscopo = "a";
			}
				else {
					horoscopo = "b";
				}
				break;
			case 2:
				if (dia < 21) {
				horoscopo = "c";
			}
				else {
					horoscopo = "d";
				}
				break;
			case 3:
				if (dia < 21) {
				horoscopo = "e";
			}
				else {
					horoscopo = "f";
				}
				break;
			case 4:
				if (dia < 21) {
				horoscopo = "g";
			}
				else {
					horoscopo = "h";
				}
				break;
			case 5:
				if (dia < 21) {
				horoscopo = "i";
			}
				else {
					horoscopo = "j";
				}
				break;
			case 6:
				if (dia < 21) {
				horoscopo = "k";
			}
				else {
					horoscopo = "l";
				}
				break;
			case 7:
				if (dia < 21) {
				horoscopo = "m";
			}
				else {
					horoscopo = "n";
				}
				break;
			case 8:
				if (dia < 21) {
				horoscopo = "ñ";
			}
				else {
					horoscopo = "o";
				}
				break;
			case 9:
				if (dia < 21) {
				horoscopo = "p";
			}
				else {
					horoscopo = "q";
				}
				break;
			case 10:
				if (dia < 21) {
				horoscopo = "r";
			}
				else {
					horoscopo = "s";
				}
				break;
			case 11:
				if (dia < 21) {
				horoscopo = "t";
			}
				else {
					horoscopo = "u";
				}
				break;
			case 12:
				if (dia < 21) {
				horoscopo = "v";
			}
				else {
					horoscopo = "w";
				}
				break;
			default:
				break;
			}
				System.out.println("Tu signo es: " + horoscopo);
			}
		
		else {
					System.out.println("El número de dia que has metido no existe: ");
				}
				
				
		}
	
	}


