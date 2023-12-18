package Tema3;



public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Ejercicio 4:
		
		
		int[] arrayInt = UtilidadesArrays.ObtenerNum(15);
		RotaDerecha (arrayInt);
		
		System.out.println("El array rotado a la derecha es: ");
		
		for (int arrayDer : arrayInt) {
			System.out.println(arrayDer);
		}
	/*	
		RotaIzquierda (arrayInt);
		
		System.out.println("El array rotado a la izquierda es: ");
		
		for (int arrayIzq : arrayInt) {
			System.out.println(arrayIzq);
		
		}
	*/
	}
		
	

	private static void RotaDerecha (int[] arrayInt) {
		
		int aux = arrayInt [0];
		
		for (int index = 0; index < arrayInt.length; index++) {
			
			if (index <= 13) {
				arrayInt [index] = arrayInt [index + 1];
			} else {
				arrayInt [index] = aux;
			}
			
		}
		
	}
		/* private static void RotaIzquierda (int[] arrayInt) {
			
			int aux = arrayInt [arrayInt.length - 1];
			
			for (int index = arrayInt.length - 1; index > arrayInt.length; index--) {
				
				if (index >= 13) {
					arrayInt [index] = arrayInt [arrayInt.length - 1 - index];
				} else {
					arrayInt [index] = aux;
				}
				
			}
		
	}
	
	*/
	
	
}
