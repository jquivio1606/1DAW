package Tema3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Ejercicio 6: TRES EN RAYA

		Scanner scan = new Scanner (System.in);
		boolean salir = false;
		
		// do {
			
		System.out.println("Introduce unas coordenadas, por ejemplo, 2b (debe estar desocupada): ");
		String jugadaJugador= scan.next();
		scan.close();
		
		char numero = jugadaJugador.charAt(0);
		char letra = jugadaJugador.charAt(1);
		
		
			
		for (char fila = 'a'; fila <= 'c'; fila++) {
			System.out.print("" + fila + "\t");
			for (char columna = '1'; columna <= '3'; columna++) {
				
				if (numero == columna && letra == fila) {
					System.out.print("X\t");
				} else {
					System.out.print("-\t");
				}	
			}
			System.out.print("\n");
		}
		System.out.println("\t1\t2\t3");
		
		
		
		
		// } while (!salir);
		
		
		
	}

}
