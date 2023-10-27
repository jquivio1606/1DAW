package EjerciciosPruebas;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el ancho del rectangulo: ");
		int ancho = scan.nextInt();
		System.out.println("Introduce el alto del rectangulo: ");
		int alto = scan.nextInt();
		
		Dimension dim = new Dimension (ancho, alto);
		Point punto = new Point();
		Rectangle rect = new Rectangle (punto, dim);
		punto.y = (alto);
		punto.x = -(ancho);
		
		System.out.println("La esquina superior izquierda está en el punto: " + punto);
		
		scan.close();

	}

}
