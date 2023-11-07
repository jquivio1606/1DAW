package Tema2;

public class UtilidadesEj10 {

	public static void EsCapicua() {
		
		
		
		
	}
	
	public static boolean EsPrimo(int i) {
		
		boolean esPrimo = true;
		int index = 2;
		while (index < (i/2 + 1) && esPrimo) {
			if (i % index == 0) {
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
		
		
		
	}
	

}
