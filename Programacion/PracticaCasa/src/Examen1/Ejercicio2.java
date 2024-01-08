package Examen1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio2
		
		int cont = 4;
		for (int i = 100; i > 0; i--) {
			if (i %2 != 0) {
				System.out.println(i);
			} else {
				if (i == 100 || cont == 0) {
					System.out.println(i);
					cont = 4;
				}
				cont--;
			}
			
						
		}
		
		

	}

}
