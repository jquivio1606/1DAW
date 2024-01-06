package com.JuditQuirosViolero.tarea3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RuletaSuerte {

	public static void main(String[] args) {
	/* Opción 1:
		
		String[] platos = new String[10];
		platos[0] = "Risotto con setas y parmesano";
		platos[1] = "Pollo al curry con arroz basmati";
		platos[2] = "Pescado en salsa de limón y alcaparras";
		platos[3] = "Ensalada de quinoa con aguacate y aderezo cítrico";
		platos[4] = "Ternera estofada con patatas y zanahorias";
		platos[5] = "Sushi de salmón y aguacate fresco";
		platos[6] = "Pizza con mozzarella y albahaca";
		platos[7] = "Lasaña de carne con ricotta y espinacas";
		platos[8] = "Tarta de chocolate con ganache y frambuesas";
		platos[9] = "Tacos de carnitas con salsa de mango";
	*/

	// Opción 2: 
		String [] platos = {"Risotto con setas y parmesano", "Pollo al curry con arroz basmati", 
				"Pescado en salsa de limón y alcaparras", "Ensalada de quinoa con aguacate y aderezo cítrico", 
				"Ternera estofada con patatas y zanahorias", "Sushi de salmón y aguacate fresco", 
				"Pizza con mozzarella y albahaca", "Lasaña de carne con ricotta y espinacas", 
				"Tarta de chocolate con ganache y frambuesas", "Tacos de carnitas con salsa de mango"};

		Scanner scan = new Scanner (System.in);
		boolean terminar = false;
		try {
			do {
				System.out.println("\n|MENÚ|------------------|\n"
						+ "| 1 - Jugar\t\t|\n"
						+ "| 2 - Finalizar Juego\t|\n"
						+ "|-----------------------|");
				System.out.println("Selecciona una opción, por favor.");	
				int option = scan.nextInt();
				
				switch (option) {
				
				case 1:  	//Empieza el juego:
					
					// Elige aleatoriamente uno de los elementos del array
					int aleatorio = (int) (Math.random()*10);
					int longitud = platos [aleatorio].length();
					char [] frase = platos [aleatorio].toCharArray();
					// Creamos un auxiliar para no modificar el array original
					char [] aux = Arrays.copyOf(frase, longitud);
					
					// Crea un array con guiones y espacios de la frase que se escogió aleatoriamente 
					System.out.println("La palabra es: \n");
					for (int i = 0; i < longitud; i++) {
						if (frase [i]== ' ') {
							aux [i] = ' ';
						} else {
							aux [i] = '-';						
						}
					}
					MostrarGiones(aux, longitud);
					
					boolean salir = false;
					
					while (!salir) {
						
						System.out.println("\n-*- \t Ahora puedes: \t\t-*-\n"
								+ " C - Comprar letra\n"
								+ " R - Resolver frase\n"
								+ " S - Salir\n"
								+ "-*- ¿Qué acción deseas relizar? -*-\n");
						
						// Cambiamos la opcion de string a array para que no se necesario escribir C mayuscula o minuscula para seleccionar una opcion.
						String opcion2Str = scan.next();
						int opcion2 = -1;
						
						if ("C".equalsIgnoreCase(opcion2Str)) {
							opcion2 = 1;
						} else if ("R".equalsIgnoreCase(opcion2Str)) {
							opcion2 = 2;
						} else if ("S".equalsIgnoreCase(opcion2Str)) {
							opcion2 = 3;
						} else {
							System.out.println("Por favor introduce una de las opciones del menú");
						}
						
						switch (opcion2) {
						
						case 1:     // Opcion: Compra letra
							
							System.out.println("Introduce la letra, que desees revelar.");
							char letra = scan.next().charAt(0);
							
							// en el array aux guardamos la letra si es que hay comparando con el array original, y lo que no lo dejamos igual
							for (int j = 0; j < longitud; j++) {
								if (frase [j] == letra) {
									aux [j] = letra;
								} else if (frase [j]== ' ') {
									aux [j] = ' ';
								} else if (frase [j] != '-'){
									
								} else {
									aux [j] = '-';
								}
							}
							
							MostrarGiones(aux, longitud);
							
							scan.nextLine();
							break;
						case 2: 	// Opcion: Revolver
							scan.nextLine();
							System.out.println("Introduce la frase, para resolver.");
							String posibleSol = scan.nextLine();
							
							// Si la solucion que hemos puesto es igual a la frase original ganamos, sino volvemos a intentar, con otra palabra.
							if (posibleSol.equalsIgnoreCase(platos[aleatorio])) {
								System.out.println("Enhorabuena, has acertado!!");
							} else {
								System.out.println("Lo sentimos, esa no era la frase. La frase era: " + platos[aleatorio] 
										+ "\nInténtalo de nuevo");
							}
							
							salir= true;
							break;
						case 3: 	// Salimos al menú principal.
							salir = true;
							System.out.println("Estás devuelta al menú principal");
							break;
							
						}
					}
					
					break;
				case 2: // Salimos del juego
					terminar = true;
					System.out.println("Hasta la próxima!!");
					break;
				default: // Mensaje de error
					System.out.println("Por favor introduce una de las opciones del menú");
					break;
				}
			} while(!terminar);
			
			scan.close();
			
		} catch (InputMismatchException ime) {
			System.out.println("Por favor, Introduce un valor válido de acuerdo a lo requerido");
		}
		
	}
/**
 * Muestra el array auxiliar luego de las modificaciones sufridas
 * 
 * @param aux
 * @param longitud
 */
	
	public static void MostrarGiones (char[] aux, int longitud) {
		for (int i= 0; i < longitud; i++) {
			System.out.print(aux [i]);
		}
		System.out.println("");
		
	}
	
}