package com.JuditQuirosViolero.tarea2;

public class UtilidadesMatematicas {

	/**
	 * Introduce el DNI sin la letra, y te dice cual es el NIF qur tiene asociado el DNI.
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
	 * Introduce el DNI y la letra, y te dice si el NIF es el asociado o no.
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
	 * Introduce un número y devuelve el factorial.
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
