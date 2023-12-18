package Tema3;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int cant = 20;
		int[] numerosAl = UtilidadesArrays.NumAleatorio(cant, 0, 100);
		int [] ordenado = new int[numerosAl.length];
		int [] numImpares = new int[numerosAl.length];
		int cuentaPares= 0;
		int cuentaImpares= 0;
		
		
		System.out.print("[");
		
		for (int index= 0; index < numerosAl.length; index++) {
			int actual = numerosAl[index];
			if(Ejercicio07.EsPar(numerosAl[index])) {
				ordenado[cuentaPares++] = actual;
			} else {
					numImpares[cuentaImpares++] = actual;
									
			}
			System.out.print(numerosAl[index] + ", ");
		}
		
		System.out.println("]");
		
	}

	

	
}
