package Examen1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio3:
		
		Scanner scan = new Scanner (System.in);
		boolean salir = false;
		
		do {
			System.out.println("Por favor, introduzca su sueldo actual para saber el incremento y el nuevo sueldo.");
			double sueldoAct = scan.nextDouble();
			double incremento= -1;
			
			
			if (sueldoAct >= 0 && sueldoAct <= 9000) {
				incremento = sueldoAct * 20 / 100;
				
			} else if (sueldoAct <= 15000) {
				incremento = sueldoAct * 10 / 100;
				
			} else if (sueldoAct <= 20000) {
				incremento = sueldoAct * 5 / 100;
				
			} else if (sueldoAct > 20000) {
				incremento = sueldoAct * 1 / 100;
				
			} else {
				System.out.println("Introduce un valor válido; el sueldo tiene que ser mayor que 0");
			}
			
			
			double sueldoNv = incremento + sueldoAct;
			
			if (sueldoAct > 0) {
				System.out.println("----------------------------------" 
						+ "\nSueldo Actual: " + sueldoAct
						+ "\nIncremento: " + incremento
						+ "\nNuevo Sueldo: " + sueldoNv
						+ "\n----------------------------------"
						+ "\n¿Desea Salir S/N?");
			
				if ("s".equalsIgnoreCase(scan.next())) {
					salir = true;
				}			
			}
			
		} while (!salir);
		System.out.println("Hasta luego!!");
		scan.close();

	}

}
