package Tema4;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int [][] array= new int[9][9];
		
		for (int i= 0; i < 9; i++) {
			for (int j= 0; j < 9; j++) {
				array[i][j]= (int) (Math.random() * 401) + 500;	
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n\n");
		
		
		int max = 500;
		int min = 900;
		int suma= 0;		
		
		//  Diagonal de la fila 9 columna 1 pa arriba.
		for (int i = 0; i < 9; i++) {
			
			int num = array[8 - i][i];
			System.out.print(num + "\t");
			
			if(max < num) {
				max= num;
			}
			if (min > num) {
				min= num;
			}
			suma += num;
		}
	
		System.out.println("\n\n");
		
		System.out.println("máximo. " + max);
		System.out.println("mínimo. " + min);
		System.out.println("media. " + (double) suma/9);
		
		
		
	}

}
