package Tema3;



public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Ejercicio 3:
		
		int[] arrayInt = UtilidadesArrays.ObtenerNum(10);
		
		// 3. Recorremos el array y mostramos los elementos.
		
		int indMax = IndiceMaximo(arrayInt);
		int indMin = IndiceMinimo(arrayInt);
		
		System.out.println("Los valores introducidos son: ");
		
		for (int index = 0; index < arrayInt.length; index++) {					
				
			if (indMax == indMin) {
				System.out.println(arrayInt[index] + " Máximo y Mínimo");
			} else {
							
				if (index == indMax) {
					System.out.println(arrayInt[index] + " Máximo");
				} 
				
				if (index == indMin) {
					System.out.println(arrayInt[index] + " Mínimmo");
				} 
				
				if (index != indMax && index != indMin) {
					System.out.println(arrayInt[index]);
				}
			}
			
		}
		
		
	}

	
	private static int IndiceMaximo (int[] array) {
		int indiceMax = Integer.MIN_VALUE;
		for (int i= 0; i < array.length; i++) {
			if (array[i] > indiceMax) {
				indiceMax = i;
			}
		}
		
		return indiceMax;
	}
	
	private static int IndiceMinimo (int[] array) {
		int indiceMin = Integer.MAX_VALUE;
		for (int i= 0; i < array.length; i++) {
			if (array[i] < indiceMin) {
				indiceMin = i;
			}
		}
		
		return indiceMin;
	}
	
	
}
