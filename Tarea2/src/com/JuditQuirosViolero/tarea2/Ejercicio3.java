package com.JuditQuirosViolero.tarea2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

/* 		3. Realizar un programa que muestre en pantalla el siguiente menú:
					~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~
					1 - Suma
					2 - Resta
					3 - Multiplicación
					4 – División
					5 - Raíz cuadrada
					6 – Potencia
					0 - Salir del programa
					~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		- Posteriormente se quedará a la espera de que el usuario introduzca un valor numérico.
		- Si introduce un 0 el programa mostrará un mensaje de despedida, que habrá que confirmar pulsando cualquier 
		tecla y después finalizará.
		- Si se pulsa un valor comprendido entre 1 y 6 pedirá al usuario dos números y devolverá el resultado de la 
		operación escogida.
		- Si se pulsa cualquier otra cosa el programa volverá a mostrar el menú tras un mensaje de error instando a 
		introducir un valor correcto.
		
*/	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~~~ "
				+ "\n" + "1 - Suma" + "\n" + "2 - Resta" + "\n" + "3 - Multiplicación" + "\n" + "4 – División" 
				+ "\n" + "5 - Raíz cuadrada" + "\n" + "6 – Potencia" + "\n" + "0 - Salir del programa"
				+ "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
				+ "\n" + "Selecciona la operación que quieras realizar: ");
		int operacion = scan.nextInt();
		
		
		
		
		if (operacion == 1 || operacion == 2 || operacion == 3 || operacion == 4 || operacion == 5 || operacion == 6 || operacion == 0) {
			
			if ( operacion == 0) {
				System.exit(0);
				
			} else  if (operacion == 5){
				
					System.out.println("A continuación selecciona los valores que vayas a utilizar en la operación:");
					String valorX = "Elije el valor para x: ";
					System.out.println(valorX);
					double x = scan.nextInt();
					double raizCuadrada = Math.sqrt(x);
					System.out.println("La raíz cuadrada de " + x +  " = " + (raizCuadrada));
				
			} else {
			
				System.out.println("A continuación selecciona los valores que vayas a utilizar en la operación:");
				String valorX = "Elije el valor para x: ";
				String valorY = "Elije el valor para y: ";
				System.out.println(valorX);
				double x = scan.nextInt();
				System.out.println(valorY);
				double y = scan.nextInt();
			
			
				switch (operacion) {
		
					case 1:
						System.out.println("La suma de " + x + " + " + y + " = " + (x + y));
						break;
					case 2:
						System.out.println("La resta de " + x + " - " + y + " = " + (x - y));			
						break;
					case 3:
						System.out.println("La multiplicación de " + x + " x " + y + " = " + (x * y));
						break;
					case 4:
						System.out.println("La división de " + x + " / " + y + " = " + (x / y));			
						break;
					case 5:
						break;
					case 6:
						double potencia = Math.pow(x, y);					
						System.out.println("La potencia de " + x + " elevado a " + y + " = " + (potencia));	
						break;
					default:
						break;
					}
				}
		} else {
			System.out.println("Introduce uno de los numeros en pantalla.");
		}
		
		scan.close();
			
		
	}

}
