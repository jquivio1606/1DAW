package EjerciciosClaseTema1;

public class Ejercicio21 {

	public static void main(String[] args) {
		
		// Crea un programa que muestre la tabla del siete usando un bucle for.
		
		
		System.out.println("A continuación verás la tabla del siete:\n");
			
	/* 
		 	for (int cont = 0 ; cont <= 10 ; cont ++ ) {
			System.out.println(" 7 x "+ cont + " = " + 7 * cont);
		}
	*/
		
		// Crea un programa que muestre la tabla del siete usando un bucle while.
		 
		
		int factor = 0;
		while ( factor <= 10) {
			System.out.println(" 7 x "+ factor + " = " + 7 * factor);	
			factor++;
		}
		
	}

}
