package boletin3;

public class UtilidadesEj7 {


	
	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
	 * 
	 * @param num
	 * @return esCapicua
	 */
	
	public static boolean EsCapicua(int num) {
		
		boolean esCapicua = true;
		
		
		
		return esCapicua;
		
	}
	
	/**
	 *  Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
	 * 
	 * @param i
	 * @return esPrimo
	 */
	
	public static boolean EsPrimo(long i) {
		
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
	
	/**
	 *   Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param i
	 * @return siguientePrimo
	 */
	
	public static long SiguientePrimo(int inicio) {
		
		boolean esPrimo = false;
		long incremento= 1l;
		while (!esPrimo) {
			esPrimo = EsPrimo(inicio + incremento++);
			
		}
		
		return inicio + incremento -1;		
	}
	
	/**
	 *    Dada una base y un exponente devuelve la potencia.
	 * 
	 * @param base, exponente
	 * @return result
	 */
	
	public static long Potencia(int base, int exponente) {

		long result= 1;
		
		if (exponente < 0) {
				for (int i = 0; i > exponente; i-- ) {
					result*= base;	
				}
				
			result = 1/ result;
			
			} else {
				for (int i = 0; i < exponente; i++ ) {
					result*= base;	
				}
			}
		
		return result;		
	}
	
	/**
	 *   Cuenta el número de dígitos de un número entero.
	 * 
	 * @param num1
	 * @return digitos
	 */
	
	public static int Digitos(int num1) {

		int digitos= 0;
		int aux= num1;
		
		while (aux != 0) {
			aux= aux / 10;
			digitos++;
		}
		
		return digitos;		
	}
	
	/**
	 *   Le da la vuelta a un número.
	 * 
	 * @param num2
	 * @return result
	 */
	
	 public static int VoltearNum(int num2) {

			int numVolteado= 0;
			int aux= num2;
		        while (aux != 0) {
	            int ultimoDigito = aux % 10;
	            numVolteado = numVolteado * 10 + ultimoDigito;
	            aux /= 10;
		        }
			
			return numVolteado;		
		} 

	/* public static int DigitoN(int posicionN, int digito) {
		
		// NO SE COMO HACER LA CUENTA PA Q FUNCIONE
			
			
		 return digitoN;
	 }
	*/
	 
 	/**
	 *   Introduce el DNI y devuelve el NIF asociado.
	 * 
	 * @param DNI
	 * @return LetraDNI
	 */
 
 	public static String LetraDNI (int DNI) {
 		String LetraDNI= "";
 		
 		int division = DNI % 23;
 		
 		switch (division) {
		case 0:
			LetraDNI= "T";
			break;
		case 1:
			LetraDNI= "R";		
			break;
		
		case 2:
			LetraDNI= "W";
			break;
		
		case 3:
			LetraDNI= "A";
			break;
		
		case 4:
			LetraDNI= "G";
			break;
		
		case 5:
			LetraDNI= "M";
			break;
		
		case 6:
			LetraDNI= "Y";
			break;
		
		case 7:
			LetraDNI= "F";
			break;
		
		case 8:
			LetraDNI= "P";
			break;
			
		case 9:
			LetraDNI= "D";
			break;
			
		case 10:
			LetraDNI= "X";		
			break;
		
		case 11:
			LetraDNI= "B";
			break;
		
		case 12:
			LetraDNI= "N";
			break;
			
		case 13:
			LetraDNI= "J";
			break;
		
		case 14:
			LetraDNI= "Z";
			break;
		
		case 15:
			LetraDNI= "S";
			break;
		
		case 16:
			LetraDNI= "Q";
			break;
		
		case 17:
			LetraDNI= "V";
			break;
		
		case 18:
			LetraDNI= "H";
			break;
			
		case 19:
			LetraDNI= "L";
			break;
		
		case 20:
			LetraDNI= "C";
			break;
		
		case 21:
			LetraDNI= "K";
			break;

		case 22:
			LetraDNI= "E";
			break;

		default:
			
			break;
		}	
 		
 		return LetraDNI;
 	}
 	

 	/**
	 *   Introduce el DNI y la letra, y te dice si el NIF es el asociado o no.
	 * 
	 * @param DNI, LetraNif
	 * @return nifCorrecto
	 */
 	
 	public static boolean NifCorrecto (int Dni, String LetraNif) {
 		
 		boolean nifCorrecto = false;
 		String LetraNifCorrecta = LetraDNI(Dni);
 		
 		if (LetraNif.equalsIgnoreCase(LetraNifCorrecta)) {
 			nifCorrecto = true;
 		}
 		
 		return nifCorrecto;
 	}

 	/**
	 *   Introduce el radio y devuelve el área del círculo.
	 * 
	 * @param radio
	 * @return areaCirculo
	 */
 	
 	public static double AreaCirculo (double radio) {
 		double areaCirculo= 0d;
 		final double numPi = Math.PI;
 		
 		areaCirculo= numPi * (radio * radio);
 		
 		return areaCirculo;
 	}
 	
 	/**
	 *   Introduce la base y la altura y devuelve el área del rectangulo.
	 * 
	 * @param base1, altura
	 * @return areaRectangulo
	 */
 	
 	public static float AreaRectangulo (float base1, float altura) {
 		float areaRectangulo= base1 * altura;
 		
 		return areaRectangulo;
 	}
 	
 	/**
	 *   Introduce un número y devuelve el factorial.
	 * 
	 * @param numF
	 * @return resultado
	 */
 	
 	public static long Factorial (int numF) {
 		
 		long resultado = 1L;
 		int aux = numF;	
 		
 		for (int cont = 1; cont <= aux; cont++) {
 			resultado *= cont;
 			
 		}
 			 		
 		return resultado;
 	}

}
