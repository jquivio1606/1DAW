package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean correcto = false;
		int x, y, opcion;
		do {
			
			System.out.println("Selecciona un número de opción siendo las opciones :" + "\n 1. Suma" +  "\n 2. Resta" + "\n 3. Multiplicación" + "\n 4. División");
			opcion = scan.nextInt();
			
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
				correcto = true;
							
			} else {
				System.out.println("Introduce bien los valores de opción.");
			}
		  
		} while (!correcto);
		 	
		
		System.out.println("Seleciona un valor para x: ");
		x = scan.nextInt();
		System.out.println("Seleciona un valor para y: ");
		y = scan.nextInt();
		scan.close();
		
		switch (opcion) {
		case 1:
			System.out.println("La suma de " + x + " + " + y + " = " + (x+y));
			break;
		case 2:
			System.out.println("La resta de " + x + " - " + y + " = " + (x-y));
			break;
		case 3: 
			System.out.println("La multiplicación de " + x + " x " + y + " = " + (x*y));
			break;
		case 4: 
			System.out.println("La división de " + x + " / " + y + " = " + (x/y));
			break;
		default:
			break;
		}
			
	}

}
