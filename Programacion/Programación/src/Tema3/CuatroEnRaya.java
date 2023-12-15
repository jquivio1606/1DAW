package Tema3;

import java.util.Scanner;

public class CuatroEnRaya {

	public static void main(String[] args) {
		//TODO Solo deja poner 12 O en el tablero al 13 ya pone que nos hemos pasado del indice del array.
		
		final String ROJO = "\u001B[31m";
		final String VERDE = "\u001B[32m";
		final String RESET = "\u001B[0m";
		final String jugador1 = ROJO + "O" + RESET + "\t";
		final String jugador2 = VERDE + "X" + RESET + "\t";
		String jugadorActual = jugador1;
		boolean salida = false;

		Scanner scan = new Scanner(System.in);
		String[][] tablero = new String[6][7];

		for (int fila = 0; fila < 6; fila++) {
			for (int columna = 0; columna < 7; columna++) {
				tablero[fila][columna] = "-";
			}
		}
		
		do {
			
			pintarTablero(tablero);
			System.out.printf("Jugador %s. Introduce una columna: \n ",jugadorActual);
			int eleccionColumna = scan.nextInt();
			boolean espacioLibre = false;
			int index = 5;
			
			if (eleccionColumna < 0 || eleccionColumna > 6) {
				
				System.out.println("La columna no existe");
				
			} else if (!"-".equals(tablero[0][eleccionColumna])) {
				
				System.out.println("La columna está completa. ");
				
			} else {
				
				while (!espacioLibre) {
					if ("-".equals(tablero[index][eleccionColumna])) {
						tablero[index][eleccionColumna] = jugadorActual;
						espacioLibre = true;
					}
					
					index--;
				}
				
				if (Gana(tablero,jugadorActual)) {
					System.out.println("Jugador " + jugadorActual + " Ha ganado!! Enhorabuena!!");
					salida= true;
					
				} else if (Empate(tablero)) {
					System.out.println("Habeis quedado EMPATE!! ");
					salida= true;
					
				} else {
					if (jugadorActual.equals(jugador1)) {
						jugadorActual = jugador2;
					} else {
						jugadorActual = jugador1;
					}
				}
				
			}
			
		} while (!salida);
		System.out.println("\n");
		
		pintarTablero(tablero);
	
		System.out.println("\n\nHasta la próxima!!");
		
		scan.close();
	}

	public static void pintarTablero(String[][] tablero) {
		System.out.println("\n");
		for (int row = 0; row < 6; row++) {
			System.out.print("\t");
			for (int col = 0; col < 7; col++) {
				System.out.print(tablero[row][col] + "\t");
			}
			System.out.print("\n\n");
		}
		System.out.print("\t0\t1\t2\t3\t4\t5\t6\t");
		System.out.print("\n\n");
	}
	
	public static boolean Gana(String [][] tablero, String jugadorActual){
		boolean gana = false;
		
		for (int indexF = 0; indexF < 6; indexF++) {
			for (int indexC = 0; indexC < 7; indexC++) {
// Horizontal				
				if (jugadorActual.equals(tablero[indexF][indexC]) &&
					jugadorActual.equals(tablero[indexF][indexC + 1]) &&
					jugadorActual.equals(tablero[indexF][indexC + 2]) &&
					jugadorActual.equals(tablero[indexF][indexC + 3])){
					
					gana = true;
// Vertical			
				} else if (jugadorActual.equals(tablero[indexF][indexC]) &&
					jugadorActual.equals(tablero[indexF + 1][indexC]) &&
					jugadorActual.equals(tablero[indexF + 2][indexC]) &&
					jugadorActual.equals(tablero[indexF + 3][indexC])){
					
					gana = true;
// Diagonal 1		
				} else if (jugadorActual.equals(tablero[indexF][indexC]) &&
						jugadorActual.equals(tablero[indexF + 1][indexC + 1]) &&
						jugadorActual.equals(tablero[indexF + 2][indexC + 2]) &&
						jugadorActual.equals(tablero[indexF + 3][indexC + 3])){
						
						gana = true;
// Diagonal 2				
				} else if (jugadorActual.equals(tablero[indexF][indexC]) &&
						jugadorActual.equals(tablero[indexF + 1][indexC - 1]) &&
						jugadorActual.equals(tablero[indexF + 2][indexC - 2]) &&
						jugadorActual.equals(tablero[indexF + 3][indexC - 3])){
						
						gana = true;
				}
		
			}
		}
	return gana;
	}
	
	 public static boolean Empate(String[][] tablero) {
		 boolean empate = true;
		 for (int fila = 0; fila < 6; fila++) {
				for (int col = 0; col < 7; col++) {
					if("-".equals(tablero[fila][col])) {
						empate= false;
					}
				}
			}
		return empate; 
		 
	 }


}
