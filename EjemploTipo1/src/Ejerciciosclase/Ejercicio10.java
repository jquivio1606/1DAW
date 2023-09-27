package Ejerciciosclase;


public class Ejercicio10 {

	public static void main(String[] args) {
		
		double num = Math.random()*100;
			
		String msg = (num >= 0 && num < 20) ? 
				" El número está entre 0 y 20, 20 no incluido" : 
				" El número NO está entre 0 y 20, 20 no incluido";
		
		System.out.println("Ha salido "+ (int)num + ":"+ msg);
		

	}

}
