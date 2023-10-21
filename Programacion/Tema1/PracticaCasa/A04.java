package PracticaCasa;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		// ActividadesExtras. Ejercicio 16:
		/* 
   			16. Escribe un programa que muestre en tres columnas: el propio número, el
		 	 cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se 
		 	 introduce por teclado.
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = scan.nextInt();
		
		for (int numIntro = num ; numIntro < num + 5 ; numIntro++) {
			System.out.println(numIntro + "\t" + numIntro * numIntro + "\t" + numIntro * numIntro * numIntro);
		}
		
		scan.close();
		
	}

}
