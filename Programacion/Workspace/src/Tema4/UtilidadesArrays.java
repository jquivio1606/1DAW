package Tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilidadesArrays {

	public static int[] ObtenerNum(int num) {
		Scanner scan = new Scanner(System.in);
		
		int[] arrayInt = new int [num];
		
		for ( int index = 0; index < arrayInt.length; index++ ) {
			System.out.println("Introduce un número por teclado hasta llegar a 10 números. Quedan " + (num - index) + " números por introducir." );
			
			try {
				arrayInt [index]  = scan.nextInt();
				
			} catch (InputMismatchException ime) {
				arrayInt [index]  = 0;
			}
			
		}
		scan.close();
		
		return arrayInt;
	}
	
	public static int[] NumAleatorio(int cant, int limInf, int limsup) {
		  int[] arrayNum = new int [cant];
		  
		  for (int index = 0; index < cant; index++) { 
			  int numAl = (int) (Math.random() * ((limsup - limInf + 1) + limsup));
			  arrayNum[index] = numAl;
		  }
		  
		  
		return arrayNum;
		
	}
}
