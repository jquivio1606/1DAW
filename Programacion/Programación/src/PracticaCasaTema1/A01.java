package PracticaCasaTema1;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		
		// Boletín 2. Ejercicio 2:
		
		
	Scanner scan = new Scanner(System.in);
		
	boolean salir = false; 
	
	System.out.println("A continuación vamos a realizar una ecuación de primer grado --> ax +b = 0");
	
		do {
			System.out.println("Introduce un valor para a:");
			int a = scan.nextInt();
			System.out.println("Introduce un valor para b:");
			int b = scan.nextInt();
			
				if (a == 0) {
					System.out.println("Para a = 0 no hay una solución real.");
				} else {
					System.out.println("x = " + -b + "/" + a + " = " + ((double) -b / (double) a));
			
				}
		System.out.println("\n" + "¿Desea calcular algo más? \n" + "- Para hacerlo pulse 1. \n" + "- Para salir pulse 0.");
		int acabar = scan.nextInt();
		
			if (acabar == 0) {
				salir = true;
			}
	
		} while (!salir);
	
	
	
	scan.close();
	
	}

}
