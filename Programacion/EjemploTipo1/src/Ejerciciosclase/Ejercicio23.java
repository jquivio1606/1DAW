package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce tu nombre, por favor: ");
		String nombre = scan.nextLine();		
		scan.close(); 
		
		String saludo = devuelveSaludo(nombre);
	    System.out.println(saludo);
	}
	
	public static String devuelveSaludo (String nombre) {
		String salida = "Hola " + nombre + "!";
		return salida;
	}

}
