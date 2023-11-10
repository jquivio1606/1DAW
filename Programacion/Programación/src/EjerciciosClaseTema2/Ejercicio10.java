
package EjerciciosClaseTema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
			boolean salir = true;
		
			do {
			
				System.out.println("\n" + "-------------------|MENÚ|------------------ \n" 
				+ "¿Qué tipo de operación quieres realizar? \n"
				+ " 1. EsCapicua\r\n"
				+ " 2. EsPrimo\r\n"
				+ " 3. SiguientePrimo\r\n"
				+ " 4. Potencia\r\n"
				+ " 5. Digitos\r\n"
				+ " 6. VoltearNum\r\n"
				+ " 7. DigitoN\r\n"
				+ " 8. LetraDNI\r\n"
				+ " 9. NifCorrecto\r\n"
				+ " 10. AreaCirculo\r\n"
				+ " 11. AreaRectangulo\r\n"
				+ " 0. Salir\r\n"
				+ "------------------------------------------ \n" 
				+ "Elige un valor:");
					
			
			int opcion = scan.nextInt();
			
			switch (opcion) {	
				case 1: 
					System.out.println("Introduce un número para saber si es capicua o no:");
					int num = scan.nextInt();
					
					
					if (UtilidadesEj10.EsCapicua(num)) {
						System.out.printf("El número %d es capicua.\n", num);
					} else {
						System.out.printf("El número %d NO es capicuo.\n", num);			
					}
					
					break;
				
				case 2: 
					System.out.println("Introduce un número para saber si es primo o no:");
					long i = scan.nextInt();
					
					
					if (UtilidadesEj10.EsPrimo(i)) {
						System.out.printf("El número %d es primo.\n", i);
					} else {
						System.out.printf("El número %d NO es primo.\n", i);			
					}
					break;
					
				case 3: 
					System.out.println("Introduce un número para saber el siguiente número primo:");
					int inicio = scan.nextInt();
					
				
					long siguientePrimo= UtilidadesEj10.SiguientePrimo(inicio);
				
					System.out.printf("El siguiente número primo despues de %d es: %d \n", inicio, siguientePrimo);
					
					break;
					
				case 4: 
					System.out.println("Introduce el número base :");
					int base = scan.nextInt();
					System.out.println("Introduce el exponente :");
					int exponente = scan.nextInt();
					
					
					long result= UtilidadesEj10.Potencia(base, exponente);
					System.out.printf("El resultado de hacer %d elevado a %d es igual a: %d \n", base, exponente, result);
					
					break;
					
				case 5: 
					System.out.println("Introduce un número para saber la cantidad de digitos que contiene:");
					int num1 = scan.nextInt();
					
					
					
					int digitos = UtilidadesEj10.Digitos(num1);
					System.out.printf("El número de digitos que tiene %d es: %d \n", num1, digitos);
					
					break;
					
				case 6: 
					System.out.println("Introduce un número para voltearlo:");
					int num2 = scan.nextInt();
					
					int numVolteado = UtilidadesEj10.VoltearNum(num2);
					System.out.printf("El número %d volteado es: %d", num2, numVolteado);
					
					break;
					
				case 7: 
					System.out.println("Introduce un número para saber la cantidad de digitos que contiene:");
					
					
					break;
					
				case 0: 
					salir = false;
					
					break;	
					
				case 8: 
					System.out.println("Introduce el DNI sin letra, para saber tu letra asociada:");
					int DNI= scan.nextInt();
					
					String LetraDNI = UtilidadesEj10.LetraDNI(DNI);
					System.out.printf("Para el DNI %d el NIF es: %s", DNI, LetraDNI);
					
					break;
				
				case 9: 
					System.out.println("Introduce el DNI sin letra, para saber tu letra asociada:");
					int Dni= scan.nextInt();
					scan.nextLine();
					System.out.println("Introduce la letra de tu DNI:");
					String LetraNif = scan.nextLine();
					
					boolean nifCorrecto = UtilidadesEj10.NifCorrecto(Dni,LetraNif);
					
					if (nifCorrecto) {
						System.out.printf("Es correcto. El NIF %s corresponde al DNI: %d", LetraNif, Dni);
					} else {
						System.out.printf("El NIF %s no corresponde con el DNI %d", LetraNif, Dni );
					}
					break;
				
				case 10: 
					System.out.println("Introduce el radio del círculo para calcular el área:");
					double radio= scan.nextDouble();
					
					double areaCirculo = UtilidadesEj10.AreaCirculo(radio);
					System.out.printf("El área de un círculo cuyo radio es %f es igual a: %f", radio, areaCirculo);
					
					break;
				
				case 11: 
					System.out.println("Introduce la base del rectangulo para calcular el área:");
					float base1 = scan.nextFloat();
					System.out.println("Introduce la altura del rectangulo para calcular el área:");
					float altura= scan.nextFloat();
					
					float areaRectangulo = UtilidadesEj10.AreaRectangulo(base1, altura);
					System.out.printf("El área de un regtangulo con %f de base y %f de altura es igual a: %f", base1, altura, areaRectangulo);
					
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
