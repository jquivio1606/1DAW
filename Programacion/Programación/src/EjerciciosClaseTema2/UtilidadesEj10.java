package EjerciciosClaseTema2;

public class UtilidadesEj10 {

	
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
		long incremento= 1L;
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

		long result=1;
		
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

		int digitos = 0;
		int aux = num1;
		
		while (aux != 0) {
			aux = aux / 10;
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
	


}
