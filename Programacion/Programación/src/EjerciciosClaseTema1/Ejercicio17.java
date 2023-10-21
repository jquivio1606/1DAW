package EjerciciosClaseTema1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
	
		/* Act 6.Escribe un programa que dada una hora determinada (horas y minutos), 
		 calcule los segundos que faltan para llegar a la medianoche
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce la hora, del 0 al 23: ");
		int hora =  scan.nextInt();
		System.out.println("Introduce los minutos, del 0 al 59: ");
		int min =  scan.nextInt();
		scan.close();
		
		int seg = 0;
		
		if (hora >= 1 && hora < 24 && min >= 0 && min < 60) {
			seg =  (23 - hora)* 36000 + (60 - min) * 60;
			System.out.println("Faltan " + seg + " segundos para media noche.");
			
			
		}
		
		else {
			System.out.println("Error introduce bien los datos: ");
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
