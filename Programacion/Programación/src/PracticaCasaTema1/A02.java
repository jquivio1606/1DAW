package PracticaCasaTema1;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// Boletín 2. Ejercicio 3:
		
		
		System.out.println("Con este programa podrá calcular el tiempo que tardara un objeto en caer desde una altura h.");
		
		Scanner scan = new Scanner(System.in);
		
		final double g = 9.81;
		
		System.out.println("Seleccione un valor en metros para la altura: ");
		double h = scan.nextDouble();
		
		
			if (h < 0) {
				System.out.println("Una altura no puede ser negativa, por favor introduzca otro valor para h");
							
			} else {
				double raizCuadrada = Math.sqrt(2 * h / g);
				System.out.println("El tiempo en segundos que tardara en caer el objeto es:  " + (raizCuadrada));
			}
	
		
		scan.close();

	}

}
