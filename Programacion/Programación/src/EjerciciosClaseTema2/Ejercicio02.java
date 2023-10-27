package EjerciciosPruebas;

public class Ejercicio02 {

	public static void main(String[] args) {

		/* 
		 * se le da al proyecto, click derecho, y build Path add libraries, y te apañas como puedes porque no ha explicado mucho más.
		 * 
		 * 
		 * 
		 * 
		 * Para añadir una libreria nueva se le da a botón derecho en JRE System Library, 
		 * y se selecciona properties, intalled JREs, a add, se le da a alguna de las 3 opciones, 
		 * y a add externals JARs y le das al que te has descargado.
		*/
		
		String nombre= "Judit";
		int edad = 18;
		System.out.println("Hola me llamo " + nombre + " y tengo " + edad + " años.");
		//Otra manera de imprimir el texto pero con  formato. Como printf no tiene salto de linea tenemos que ponerlo nosotros.
		System.out.printf("Hola me llamo %s y tengo %d años. \n" , nombre,  edad);
		
		
		
	}

}
