package EjerciciosClaseTema1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		
		
	// Act 8.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un valor para a: ");
		int a = scan.nextInt();
		System.out.println("Introduce un valor para b: ");
		int b = scan.nextInt();
		System.out.println("Introduce un valor para c: ");
		int c = scan.nextInt();
		int mayor, med, menor; 
		scan.close();
		
		
		
		if (a >= b) {
			
			if (a >= c) {
				mayor = a;
				
				if (b >= c) {
					menor = c;
					med = b;
				} else {
					med = c;
					menor = b;
				}
				
			} else {
				mayor = c;
				med =  a;
				menor = b;
			}
			
			
		} else {
			
			if (b >= c) {
				mayor = b;
				
				if (a >= c) {
					med = a;
					menor = c;
				} else {
					med = c;
					menor = a;
				}
				
			} else {
				mayor = c;
				med = b;
				menor = a;
			}
			
			System.out.println("EL orden de los números de menor a mayor es: " + menor + " , " + med + " , " + mayor + " .");
			
		}

		
		
		

	}

}
