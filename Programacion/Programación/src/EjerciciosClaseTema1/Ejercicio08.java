package EjerciciosClaseTema1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una cantidad en $: ");
		double dolar = scan.nextDouble();
		System.out.println("Introduce el equivalente: ");
		double equiv = scan.nextDouble();
		double conversion = dolar * equiv;
		System.out.println(dolar + "$ equivalen a " + conversion + "€");
		scan.close();
		
	}

}
