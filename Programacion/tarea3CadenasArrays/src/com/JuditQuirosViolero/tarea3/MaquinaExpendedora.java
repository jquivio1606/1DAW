package com.JuditQuirosViolero.tarea3;

import java.util.Scanner;

public class MaquinaExpendedora {

	public static void main(String[] args) {

		//TODO: Terminar de ver las condiciones al final del ejercicio y cambiar algo si es necesario
		
		Scanner scan = new Scanner (System.in);
		boolean terminar = false;
		int Posicionbebida = -1;
		int fila =  -1;
		int columna = -1;
		int ventas = 0;
		String[][] productos = {
				{"Coca-Cola", "Sprite", "Fanta naranja"},
				{"Fanta limón", "Red Bull", "Monster"},
				{"Pepsi", "Schweppes tónica", "Agua mineral"},
				{"Cruzcampo", "Heineken", "Zumo de piña"}
				};
		
		int[][] cantidad = { {5, 5, 5},
							 {5, 5, 5},
							 {5, 5, 5},
							 {5, 5, 5}	};
		do {
			
			System.out.println("\n|MENÚ|------------------|\n"
					+ "| 1 - Pedir Bebida\t|\n"
					+ "| 2 - Mostrar Bebidas\t|\n"
					+ "| 3 - Rellenar Bebidas\t|\n"
					+ "| 4 - Apagar Máquina\t|\n"
					+ "|-----------------------|\n" 
					+ "Selecciona una opción, por favor.");	
			int option = scan.nextInt();
			
			switch (option) {
			case 1:
				scan.nextLine();
				System.out.println("Introduce la posición de la bebida que deseas adquirir. (Ejm: Agua: está en f3 c3. Introduce 33)");
				Posicionbebida = scan.nextInt();
				// TODO: ver si puedo hacer  un método o algo para no tener que estar calculando la fila y la columna cada vez que pido la posicion de la bebida
				fila = (Posicionbebida / 10) -1;
				columna = (Posicionbebida % 10) -1;
				
				if (cantidad[fila][columna]== 0) {
					System.out.println("Lo sentimos, no quedan más " + productos[fila][columna]);
				} else {
					System.out.println("Ahí tiene su " + productos [fila][columna]);
					cantidad [fila][columna]--;
					ventas++;
				}
				
				
				break;
			case 2:
				
				for (int i = 0; i < 4; i++) {
					for( int j = 0; j < 3; j++) {
						if (cantidad[i][j] != 0) {
							System.out.print("cd:" + (i + 1) + "" + (j + 1) + "  " + productos[i][j] + "\t\t\t");	
						} else {
							System.out.print("\t\t\t\t\t");
						}
					}
					System.out.println(" ");
					System.out.println("---------------------------------------------------------------------------------------------------");
				}
				
				break;
			case 3:
				scan.nextLine();
				final String password = "MaquinaExpendedora2024";
				System.out.println("Esta acción sólo está disponible para el técnico, para realizarla introduzca la contraseña, por favor.");
				String intento = scan.nextLine();	
				
				if (password.equals(intento)) {
					System.out.println("Introduce la posición de la bebida que deseas adquirir. (Ejm: Agua: está en f3 c3. Introduce 33)");
					Posicionbebida = scan.nextInt();
					// TODO: ver si puedo hacer  un método o algo para no tener que estar calculando la fila y la columna cada vez que pido la posicion de la bebida
					fila = (Posicionbebida / 10) -1;
					columna = (Posicionbebida % 10) -1;
					
					System.out.println("Introduce la cantidad que vas a rellenar:");
					int cantRellena = scan.nextInt();
					
					cantidad [fila][columna] += cantRellena;
				
				} else {
					System.out.println("Esa no es la contraseña, no puede realizar esta acción.");
				}
				break;
			case 4:
				terminar = true;
				System.out.println("Las ventas han sido: " + ventas
						+ "\nHasta la próxima!!");
				break;
				
			default:
				System.out.println("Por favor introduce una de las opciones del menú");
				break;
			}
		
		} while (!terminar);
	
		scan.next();
		scan.close();

	}
	
}


