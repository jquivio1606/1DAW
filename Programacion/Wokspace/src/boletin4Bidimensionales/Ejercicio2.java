package boletin4Bidimensionales;

import Tema4.UtilidadesArrays;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		
		//EJERCICIO2:
		
		int filas = 4;
		int columnas = 5;
		
		// final String RESET= "\u001B[0m"
		// final String ROJO = "\u001B[30m"
		
		// Reutilizamos el método de obtener enteros por entrada estándar
		int numerosTotales = filas * columnas;
		int[] numeros = UtilidadesArrays.NumAleatorio(numerosTotales, 100, 999);
		int[][] tabla = new int[filas][columnas];
		int[] sumaColumnas = new int[columnas];
		int indexNum = 0;
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				tabla[fila][columna] = numeros[indexNum++];
			}
		}

		System.out.print("\n\n\n");
		Thread.sleep(500);
		int sumaTotal = 0;
		for (int fila = 0; fila < filas; fila++) {
			int sumaFila = 0;
			for (int columna = 0; columna < columnas; columna++) {
				System.out.print(tabla[fila][columna] + "\t");
				sumaFila += tabla[fila][columna];
				sumaColumnas[columna] += tabla[fila][columna];
			}
			sumaTotal += sumaFila;
			Thread.sleep(500);
			System.out.println(sumaFila);
			Thread.sleep(500);
		}
		for (int i : sumaColumnas) {
			Thread.sleep(500);
			System.out.print(i + "\t");
			Thread.sleep(500);
			sumaTotal += i;
		}
		Thread.sleep(1500);
		System.out.print(sumaTotal);
		
		
		
		
		
		
		
	}

}
