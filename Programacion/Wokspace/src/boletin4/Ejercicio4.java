package boletin4;

import Tema4.UtilidadesArrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/* Ejercicio 4: Escribe un programa que lea 15 números por teclado y que los almacene en un
			array. Rota los elementos de ese array una posición a la derecha, es decir, el
			elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El
			número que se encuentra en la última posición debe pasar a la posición 0.
			Finalmente, muestra el contenido del array.
		 */
		
		
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
