package EjerciciosClase;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un valor para x: ");
		int x = scan.nextInt();
		System.out.println("Introduce un valor para y, que sea mayor que x: ");
		int y = scan.nextInt();
		String multiplos = "";
		String result = "Los multiplos de siete entre: " + x + " y " + y + " son: " + multiplos;
		boolean existen = false;
		scan.close();
		
		
		if (x < 0 || y < 0 || x > y ) {
			System.out.println("Los datos introducidos son erróneos. Introdúcelos bien: ");
		
		} else {
			
			for (int cont = x ; cont <= y ; cont ++) {
				if (cont % 7 == 0) {
					multiplos += "\n" + cont;
					System.out.println(cont);
					existen = true;
				}
					
			} if (!existen) {
					result = result + x + " y " + y + " son: " + multiplos;
			} 
			System.out.println(result);
		}
		
	}

}
