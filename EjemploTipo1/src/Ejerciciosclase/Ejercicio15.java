package Ejerciciosclase;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		
		//Examen tipo test (notas)
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de preguntas: ");
		int preg =  scan.nextInt();
		System.out.println("Introduce el número de preguntas acertadas: ");
		int aciertos =  scan.nextInt();
		int errores = (preg - aciertos);
		
		
		float nota = 0f;
		int notaEntera = 0;
		String calificacion = "";
		
		nota = ((aciertos - (errores / 2f))*10f) / preg;
				
		
		notaEntera = Math.round(nota);		
				
			switch (notaEntera) {
			case 0:
			case 1:  
			case 2: 
			case 3: 
			case 4: 
				calificacion = "INSUFICIENTE";
			break;
			case 5:
			case 6:
				calificacion = "SUFICIENTE";
			break;
			case 7:
			case 8:
				calificacion = "NOTABLE";
			break;
			case 9: 
			case 10:
				calificacion = "SOBRESALIENTE";
			break;
			
			}
				
		System.out.println("Tu nota es: " + notaEntera + " ." + calificacion);
			
		scan.close();
		
		
	}

}
