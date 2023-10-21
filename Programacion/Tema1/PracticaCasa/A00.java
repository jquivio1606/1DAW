package PracticaCasa;

import java.util.Scanner;

public class A00 {

	public static void main(String[] args) {

		//Boletín 2. Ejercicio 1:

		Scanner scan = new Scanner(System.in);
		boolean salir = false; 
		
		System.out.println(" \n" + "En este programa podrá calcular el sueldo correspondiente a las horas trabajadas.  \n");
		
		do {		
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		int horas = scan.nextInt();
					
			if (horas <= 40) {
				System.out.println("El sueldo semanal que le corresponde es de: " + (horas * 12));
				
			} else {
				int horasExtra = horas - 40;
				int horasOrd = horas - horasExtra;
				
				System.out.println("El sueldo semanal que le corresponde es de: " + (horasExtra * 16 + horasOrd * 12 ));
			}
		
		System.out.println("\n" + "¿Desea calcular algo más? \n" + "Para hacerlo pulse 1. \n" + "Para salir pulse 0.");
		int acabar = scan.nextInt();
		
			if (acabar == 0) {
				salir = true;
			}
	
		} while (!salir);
		
		
		scan.close();
		

	}
}
