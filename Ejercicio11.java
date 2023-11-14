package Tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean salir = true;
	
		do {
		
			System.out.println("-------------------|MENÚ|------------------ \n" 
				+ "¿Qué tipo de operación quieres realizar? \n"
				+ " 1. esPalindromo\r\n"
				+ " 2. esHeterograma\r\n"
				+ " 3. conteoVocales\r\n"
				+ " 4. invertirCadena\r\n"
				+ " 5. eliminarEspacios\r\n"
				+ " 6. eliminarEspaciosDuplicados\r\n"
				+ " 7. esAnagrama\r\n"
				+ " 8. contarPalabras\r\n"
				+ " 9. mayusculasMinusculas\r\n"
				+ " 10. reemplazarCaracter\r\n"
				+ " 11. esNumero\r\n"
				+ " 0. Salir\r\n"
				+ "------------------------------------------ \n" 
				+ "Elige un valor:");
		
		
		int opcion = scan.nextInt();
		
		switch (opcion) {	
			case 1: 
				
				System.out.println("Escribe una cadena de texto para saber si es un palindromo. ");
				String cadena1 = scan.nextLine();
				scan.next();
				
				boolean esPalindromo = UtilidadesEj11.EsPalindromo(cadena1);
				if (esPalindromo) {
					System.out.printf("La cadena %s no es un Palindromo. \n", cadena1);
				} else {
					System.out.printf("La cadena %s es un Palindromo. \n", cadena1);
				}
				
				
				break;
			
			case 2: 
				
				System.out.println("Escribe una cadena de texto para saber si es un heterograma. ");
				String cadena2 = scan.nextLine();
				scan.next();
				
				boolean esHeterograma = UtilidadesEj11.EsPalindromo(cadena2);
				if (esHeterograma) {
					System.out.printf("La cadena %s es un Heterograma. \n", cadena2);
				} else {
					System.out.printf("La cadena %s no es un Heterograma. \n", cadena2);
				}
				
				
				break;
				
			case 3: 
				
				
				break;
				
			case 4: 
				
				
				break;
				
			case 5: 
				
				
				break;
				
			case 6: 
				
				
				break;
				
			case 7: 
							
				
				break;
				
			case 8: 
				
				
				break;
				
			case 9: 
				
				
				break;
				
			case 10: 
				
				
				break;
			
			case 11: 
				
				
				break;
				
			case 12:
				
				
				break;
				
				
				
				
			case 0: 
				salir = false;
				
				break;	
				
			default:

				break;				
		}
		
		
		
		
} while (salir);
		
		scan.close();
	
		System.out.println("Hasta luego!");
		

	}

}
