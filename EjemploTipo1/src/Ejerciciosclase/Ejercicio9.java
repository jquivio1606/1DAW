package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double iva = 21d;
		System.out.println("Introduce la base imponible: ");
		double baseImp = scan.nextDouble();
		double precio = ((baseImp * iva) / 100) + baseImp;
		System.out.println("El precio final con el IVA es: " + precio);
		scan.close();
		

	}

}
