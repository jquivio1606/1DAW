package EjerciciosClaseTema2;

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
				String palabra1 = scan.next();
				
				
				boolean esPalindromo = UtilidadesEj11.EsPalindromo(palabra1);
				if (esPalindromo) {
					System.out.printf("La palabra %s es un Palindromo. \n", palabra1);
				} else {
					System.out.printf("La palabra %s No es un Palindromo. \n", palabra1);
				}
				
				
				break;
			
			case 2: 
				
				System.out.println("Escribe una cadena de texto para saber si es un heterograma. ");
				String palabra2 = scan.next();
				
				
				if (UtilidadesEj11.EsPalindromo(palabra2)) {
					System.out.printf("La cadena %s No un Heterograma. \n", palabra2);
				} else {
					System.out.printf("La cadena %s es es un Heterograma. \n", palabra2);
				}
				
				
				break;
		
			case 3: 
				System.out.println("Escribe una palabra o cadena de texto para saber si cuantas vocales tiene: ");
				String cad = scan.next(); // Si se hace con el scan.next solo coge la primera palabra, y con scan.nextLine sale un error.
				
				System.out.printf("La cadena %s tiene: \n%s" , cad , UtilidadesEj11.ContarVocales(cad));
				
				break;
				
			case 4: 
				System.out.println("Escribe una palabra o cadena para revertirla:");
				String cad1 = "Hola";   // Si se hace con el scan.next solo coge la primera palabra, y con scan.nextLine sale un error.
				
				
				System.out.printf("La cadena \"%s\" invertida es: %s \n", cad1, UtilidadesEj11.Invertircadena(cad1));
				break;
				
			case 5: 
				 System.out.println("Escribe una cadena u oración para que salga sin ningún espacio.");
				String cad2 = "  Hola        buenos		 días   a 	  todos"; // Si se hace con el scan.next solo coge la primera palabra, y con scan.nextLine sale un error.
				
				
				System.out.println("La cadena sin espacio es: " + UtilidadesEj11.EliminarEspacios(cad2));
				
				break;
				
			case 6: 
				System.out.println("Escribe una cadena u oración para que salga sin ningún espacio.");
				String cad3 = "  Hola        buenos		 días   a 	  todos"; // Si se hace con el scan.next solo coge la primera palabra, y con scan.nextLine sale un error.
				
				
				System.out.println("La cadena sin espacio es: " + UtilidadesEj11.EliminarEspaciosDobles(cad3));
				
				break;
				
			case 7: 
				
				break;
				
			case 8: 
				System.out.println("Escribe una cadena para saber cuantos palabras tiene.");		
				String cad4= "Hola buenos días a todo el mundo, menos a uno.";
				
				System.out.printf("La cadena: \"%s\" Tiene %d palabras. \n", cad4, UtilidadesEj11.ContarPalabras(cad4));
				
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
