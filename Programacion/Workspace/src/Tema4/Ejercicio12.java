package Tema4;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array= new int[10][10];
		
		for (int i= 0; i < 10; i++) {
			for (int j= 0; j < 10; j++) {
				array[i][j]= (int) (Math.random() * 101) + 200;	
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n\n");
		
		
		int max = 200;
		int min = 300;
		int suma= 0;		
		
		
		for (int di = 0; di < 10; di++) {
			int num = array[di][di];
			System.out.print(num + "\t");
			
			if(max <= num) {
				max= num;
			}
			if (min >= num) {
				min= num;
			}
			
			suma += num;
		}
	
		System.out.println("\n\n");
		
		System.out.println("máximo: " + max);
		System.out.println("mínimo: " + min);
		System.out.println("media: " + (double) suma/9);
	}

}
