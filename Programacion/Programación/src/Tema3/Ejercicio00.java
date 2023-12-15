package Tema3;

public class Ejercicio00 {

	public static void main(String[] args) {
		// Introducción a los arrays
		
		// Iniciación de un array con datos
		int aux= 9;
		
		int [] arrayConDatos =  {1, aux, 7, 23, 5, -100};
		
		//Iniciar un array vacio
		
		int [] arrayVacio = new int [6];
		
		// Añadir valores en el array
		
		arrayVacio[0] = 1;
		arrayVacio[1] = aux;
		arrayVacio[2] = 7;
		arrayVacio[3] = 23;
		arrayVacio[4] = 5;
		arrayVacio[5] = -100;
		
		//Leer los datos del array
		
		System.out.println("La primera posición del array inicializado con datos es: " + arrayConDatos[0]);
		
		System.out.println("El array inicializado Vacío tiene: " + arrayVacio.length + " elementos");
		 
		//Recorrer los datos de un array con un for
		System.out.println("Los elementos del array con for normal son: ");
		for (int index = 0; index < arrayVacio.length; index++ ) {
			System.out.println(arrayVacio[index]);
			
		}
		
		
		// Recorrer el array con un for each
		System.out.println("Los elementos del array con for each son: ");
		for (int i : arrayConDatos) {
			System.out.println(i);
		}

		// Se pueden sumar:
		System.out.println("La suma del primer y último número del array vacio es: " + (arrayVacio[0] + arrayVacio.length));
		
		//Ejemplo con array de caracteres
		
		char[] arrayChar = {'s', 'Ñ', '@', '?', 'm'};
		
		//Con for normal
		System.out.println("Los elementos del array con for normal son: ");
		for (int index = 0; index < arrayChar.length; index++) {
			System.out.println(arrayChar[index]);
		}
		
		//Con for each
		System.out.println("Los elementos del array con for each son: ");
		for (char caracter : arrayChar) {
			System.out.println(caracter);
		}
		
		// Ejemplo con String
		
		String[] arrayString = new String [4];
		arrayString [1] = "Hola";
		int indice = 0;
		for (String string : arrayString) {
			indice++;
			System.out.printf("La cadena en la posicion %d es --%s--: \n", indice, string);
		}
		
		// Actividad clase: Hacer los arrays y recorrerlos:
		
		
		// array entero con los siguientes valores: [1,10,99, , , 7]
			int [] arrayInt = new int [6];
			arrayInt[0] = 1;
			arrayInt[1] = 10;
			arrayInt[2] = 99;
			arrayInt[5] = 7;
			int posicion = 0;
			System.out.printf("Los valores del array son: \n");
			
			for (int entero : arrayInt) {
				posicion++;
				System.out.printf("En la posición %d: %d \n", posicion, entero);
			}
		
			// array de caracteres con los siguientes valores: ['i', '0', , 'A']
						
			Character [] arrayCaract = new Character [4];
						arrayCaract[0] = 'i';
						arrayCaract[1] = '0';
						arrayCaract[3] = 'A';
						
						for (char caract : arrayCaract) {
							System.out.println("Los valores del array  de caracteres son: " +  caract);
						}
	
		
	}

}
