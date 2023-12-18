package boletin3;

public class UtilidadesEj8 {


	
	public static boolean EsPalindromo (String cadena1) {
		
		boolean esPalindromo = true;
		boolean salir= false;
		
		while (salir) {
			int longitudcad = cadena1.length();
			char ultimochar = cadena1.charAt(longitudcad - 1);
			char primerchar = cadena1.charAt(1);
			
			if (ultimochar != primerchar) {
				primerchar++;
				ultimochar--;
			} else {
				salir = true;
				esPalindromo= false;
			}
		}
		
		
		return esPalindromo;
	}
	
	
	public static boolean EsHeterograma (String cadena2) {
		
		boolean esHeterograma= false;
		boolean salir= false;
		
		while (salir) {
			int longitudcad = cadena2.length();
			char ultimochar = cadena2.charAt(longitudcad - 1);
			char primerchar = cadena2.charAt(1);
			
			if (ultimochar == primerchar) {
				esHeterograma = true;
				salir = true;
			
			} else {
				primerchar++;
				ultimochar--;
			}
		}
		
		return esHeterograma;
	}
}
