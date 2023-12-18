package Tema3;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Ejercicio 2:
		
		
		
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
