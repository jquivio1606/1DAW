package Tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Ejercicio 6:
		
		Scanner scan = new Scanner (System.in);
		
			
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int[] arrayTemp = new int [12];
		
		for ( int index = 0; index < meses.length; index++ ) {
			try {
				System.out.println("Introduce la temperatura media de cada mes: "+ meses[index]);
				arrayTemp[index]  = scan.nextInt();
				
								
			} catch (InputMismatchException ime) {
				arrayTemp [index]  = 0;
			}
		
		}
		
		
		for (int m = 0; m < 12 ; m++) {
			for (int t= 0; t < arrayTemp [m]; t++) {
				System.out.print("*");
			}
			System.out.println("\t"+ "\t|" + meses[m]);
		}
	
		
		scan.close();
	}

}
