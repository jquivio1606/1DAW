package Ejerciciosclase;

/**
 * 
 */
/**
 * 
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
   public static void main(String[] args) {
		
		double d1 = 10;
        double d2 = 20;
        double resul;
        
        //1.Restamos 4 al doble de d1
        resul = -4 + d1 * 2;
        System.out.println("1.Restamos 4 al doble de d1: " + resul);
        
        //2.Restamos 4 a d1 y calculamos el doble
        resul = (-4 + d1) * 2;
        System.out.println("2.Restamos 4 a d1 y calculamos el doble: " + resul);
        
        //3.Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2
        resul = (2 + d1) / 12 + d2;
        System.out.println("3.Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2: " + resul);
       
        //4.Dividimos d2 entre d1, y todo ello dividido entre 2.
        resul = d1 / d2 / 2;
        System.out.println("4.Dividimos d2 entre d1, y todo ello dividido entre 2: " + resul);
        
        //5.Dividimos d2 entre la mitad de d1.
        resul = (d1 / 2) / d2;
        System.out.println("5.Dividimos d2 entre la mitad de d1: " + resul);
        
        //6.Restamos a d2 un cuarto de d1.
        resul = d1 / 4 -d2;
        System.out.println("6.Restamos a d2 un cuarto de d1: " + resul);
       
        //7.Restamos d1 a d2, y todo ello lo dividimos entre 4.
        resul = (d1 - d2) / 4;
        System.out.println("7.Restamos d1 a d2, y todo ello lo dividimos entre 4: " + resul);
        
        //8.Dividimos d2 entre d1, y todo ello lo multiplicamos por 2.
        resul = d2 / d1 * 2;
        System.out.println("8.Dividimos d2 entre d1, y todo ello lo multiplicamos por 2: " + resul);
        
        //9.Dividimos d2 entre el doble de d1.
        resul = (d1 * 2) / d2;
        System.out.println("9.Dividimos d2 entre el doble de d1: " + resul);
        
        //10.Restamos al doble de d2 un cuarto de d1.
        resul = 2 * d2 - d1 / 4;
        System.out.println("10.Restamos al doble de d2 un cuarto de d1: " + resul);
        
        //11.Multiplicamos d2 por 100 menos d1.
        resul =  d2 * (100 - d1);
        System.out.println("11.Multiplicamos d2 por 100 menos d1: " + resul);
        
        //12.Multiplicamos d2 por 50 mas d1, y todo ello lo dividimos por 10.
	    resul = d2 * (50 + d1) / 10;
        System.out.println("12.Multiplicamos d2 por 50 mas d1, y todo ello lo dividimos por 10: " + resul);
   }

}
