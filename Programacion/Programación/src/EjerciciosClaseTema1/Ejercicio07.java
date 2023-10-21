package EjerciciosClaseTema1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		

		/*   OPCIÓN A
		  
		  double equiv = 1.06; 
		  double euros = 235; 
		  double conversion = euros * equiv;
		  System.out.println(euros + " € equivalen a " + conversion + "$");
		 
		 */
		
		//	OPCIÓN B
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce el número de euros (€): ");
		double euros = scanner.nextDouble();
		System.out.println("Introduce el cambio actual de dólares ($) a euros (€): ");
		double equiv = scanner.nextDouble();
		double conversion = euros * equiv;
		System.out.println(euros + "€ equivalen a " + conversion + "$");
		scanner.close();
		
		
		
	}

}
