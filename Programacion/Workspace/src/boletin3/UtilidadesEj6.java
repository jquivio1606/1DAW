package boletin3;

public class UtilidadesEj6 {
		
		public static int introduceInt (String cadena) throws Exception  {
			int res;
			
			try {
				res = Integer.parseInt(cadena);
			} catch (NumberFormatException nfe) {
				
				throw new Exception ("La cadena no es un valor entero.");
			}
			return res;
		}
		
		
		
		public static float introduceFloat (String cadena) throws Exception {
			float res;
			
			try {
				res = Float.parseFloat(cadena);
			} catch (NumberFormatException nfe) {
				
				throw new Exception ("La cadena no es un valor decimal.");
			}
			return res;
		}
		
		public static double introduceDouble (String cadena) throws Exception {
			double res;
			
			try {
				res = Double.parseDouble(cadena);
			} catch (NumberFormatException nfe) {
				
				throw new Exception ("La cadena no es un valor decimal.");
			}
			return res;
		}
		
		
		
		public static boolean introduceBoolean (String cadena) throws Exception {
			boolean res;
			
			try {
				res = Boolean.parseBoolean(cadena);
			} catch (NumberFormatException nfe) {
				
				throw new Exception ("La cadena no es un valor booleano.");
			}
			return res;
	}

}
