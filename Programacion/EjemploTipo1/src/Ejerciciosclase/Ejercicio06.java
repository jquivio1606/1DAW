package Ejerciciosclase;

public class Ejercicio06 {

	public static void main(String[] args) {
		
	/*	SOLUCIÓN A
	 * 
		String msg = "La casa de";
	
		System.out.println(msg);
		msg = msg + " Juan es";
		System.out.println(msg);
		msg = msg + " el número";
		System.out.println(msg);
		msg = msg + " 25";
		System.out.println(msg);
	*/
	
	
 
   // SOLUCIÓN B
		
		String msg = "La casa de Juan es el número 25";
   
   		System.out.println(msg.substring(0, 10));
   		System.out.println(msg.substring(0, 19));
   		System.out.println(msg.substring(0, 29));
   		System.out.println(msg);
	}
	
}
