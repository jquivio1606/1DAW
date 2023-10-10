package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un valor para x: ");
		int x = scan.nextInt();
		System.out.println("Introduce un valor para y, que sea mayor que x: ");
		int y = scan.nextInt();
		scan.close();
		
		
		if (x < 0 || y < 0 || x > y ) {
			System.out.println("Los datos introducidos son erróneos. Introdúcelos bien: ");
		}
		
		
		for (int cont = x ; cont <= y ; cont ++) {
			if (cont % 7 == 0) {
				System.out.println("Los números multiplos de 7 entre" +  x + "e" + y + "son: \n " + cont);
			}
						
		}
		
		
		/*
		 else {
				System.out.println("No hay ningún multiplos entre: " + x + " e " + y);
			}
		 */
		
		
		
		
		
		
		
		

		
		

	}

}
