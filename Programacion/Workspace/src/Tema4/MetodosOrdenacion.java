package Tema4;

public class MetodosOrdenacion {

	public static void main(String[] args) {
		// ORDENACION 
		
		// METODO DE LA BURBUJA ----> Ordenación alfabéticamente.
		
		String [] array= {"Alfa" , "Beta" , "Gamma" , "delta"};
		
		boolean intercambio;
		int n = array.length;
		
		// TODO: Mirar para que sirve el compareTo de la clase String.
		
		
		do {
			
			intercambio= false;
			
			for (int i = 0; i < n - 1; i++ ) {
				if(array[i].compareTo(array[i + 1]) > 0) {
					String aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					
					intercambio = true;
				}
			}
			
		} while (intercambio);
		
		// METODO DE INSERCIÓN  ------>  
		
		
		
		
		
		// METODO DE BARAJA (METODO DE DESORDENACIÓN)  -------->
		
		
		
		
		
		
		
	}

}
