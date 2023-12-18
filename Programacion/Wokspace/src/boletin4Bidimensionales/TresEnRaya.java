package boletin4Bidimensionales;

import java.util.Scanner;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class TresEnRaya {

	public static void main(String[] args) {
		// Ejercicio 6: TRES EN RAYA

		Scanner scan = new Scanner (System.in);
		String [][] tablero = new String [3][3];
		
		final String jugador = "O";
		final String ordenador = "X";
		boolean jugadorGana = false;
		boolean maquinaGana = false;
		boolean salir = false;
		
			
			for (int fila = 0; fila <= 2; fila++) {
			
				for (int columna = 0; columna <= 2; columna++) {
					tablero [fila][columna]= "-";
					}	
			
			}
			
			
			
//		do {
			
			Pintartablero(tablero);
			
			int fila;
			int columna;
			
//			do {
			
				System.out.println("Introduce unas coordenadas del 0-2. Primero las del eje x:  ");
				int filaJugador = scan.nextInt();
				System.out.println("Ahora las del eje y. Del 0-2: ");
				int columnaJugador = scan.nextInt();
				
		
		
			
		
		
		
					
//		
//			} while (jugadorGana && );
//		
//			do {
//				
//				int filaMaquina = (int) (Math.random() * 3);
//				int columnaMaquina = (int) (Math.random() * 3); 
//				
//				
//				
//			} while ();
			
			
			
//		} while (!salir);
		
//		scan.close();
		
	}

	public static void Pintartablero(String [][] tablero) {
		
		for (int fila  = 0; fila < 3; fila++) {
			System.out.print(fila + "\t");
			for (int col = 0; col < 3; col++) {
				System.out.print(tablero[fila][col] + "\t");
			}
			System.out.print("\n\n");
		}
		System.out.println("\t1\t2\t3\n");
		
		
	}
}
