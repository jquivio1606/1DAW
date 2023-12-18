package boletin4;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* Ejercicio 2: Define tres arrays de 20 números enteros cada una, con nombres numero,
			cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
			En el array cuadrado se deben almacenar los cuadrados de los valores que hay
			en el array numero. En el array cubo se deben almacenar los cubos de los
			valores que hay en numero. A continuación, muestra el contenido de los tres
			arrays dispuesto en tres columnas.
		 */
		
		int [] num = new int [20];
		int [] cuadrado = new int [20];
		int [] cubo = new int [20];
		
		
		for (int index = 0; index < 20; index++) {
			int aleatorio = (int) (Math.random() * 101);
			num [index] = aleatorio;
			cuadrado [index] = aleatorio * aleatorio;
			cubo [index] = (int) Math.pow(aleatorio, 3);
		}
		
				
		for (int index= 0; index < 20; index++) {
			System.out.printf("%d \t%d \t%d \n" , num[index], cuadrado[index], cubo [index]);
		}
		
		
		
		
		
		
		
		
	}

}
