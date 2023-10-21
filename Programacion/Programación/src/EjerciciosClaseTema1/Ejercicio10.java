package EjerciciosClaseTema1;


public class Ejercicio10 {

	public static void main(String[] args) {
		
		double num = Math.random()*100;
		
		/*
		String msg = (num >= 0 && num < 20) ? 
				" El número está entre 0 y 20, 20 no incluido" : 
				" El número NO está entre 0 y 20, 20 no incluido";
		
		System.out.println("Ha salido "+ (int)num + ":"+ msg);
		
		
		String msg = (num >= 20 && num <= 50) ? 
				" El número está entre 20 y 50, ambos incluidos" : 
				" El número NO está entre 20 y 50, ambos incluidos";
		
		System.out.println("Ha salido "+ (int)num + ":"+ msg);

	
		
		String msg = (num > 50 && num < 75) ? 
				" El número está entre 50 y 75, ninguno incluido" : 
				" El número NO está entre 50 y 75, ninguno incluido";
		
		System.out.println("Ha salido "+ (int)num + ":"+ msg);
		
		*/
		
		String msg = (num > 75 && num <= 100) ? 
				" El número está entre 75 y 100, 100 incluido" : 
				" El número NO está entre 75 y 100, 10 incluido";
		
		System.out.println("Ha salido "+ (int)num + ":"+ msg);
		
	}

}
