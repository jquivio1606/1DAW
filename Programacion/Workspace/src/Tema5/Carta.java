package Tema5;

public class Carta {
	private String numero;
	private String palo;
	final String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
	
	public Carta (String palo,  String numero) {
		
		/*
		 * if (!palo.equals("oro") && !palo.equals("copa") && !palo.equals("espada") && !palo.equals("basto")) { 
		 * throw new Exception ("El palo de la carta tiene que ser oro, copa, espada, o basto."); 
		 * }
		 * 
		 * if (numero < '1' || numero > '12') { 
		 * throw new Exception("El numero de la carta tiene que estar entre 1 y 12"); 
		 * }
		 */
		
		this.palo= palo;
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}
	
	public String getNumero() {
		return numero;
	}


	public void setPalo(String palo)  {
		
		/*
		 * if (!palo.equals("oro") && !palo.equals("copa") && !palo.equals("espada") && !palo.equals("basto")) { 
		 * throw new Exception ("El palo de la carta tiene que ser oro, copa, espada, o basto."); 
		 * }
		 */
		
		this.palo = palo;
	}
	
	
	public void setNumero(String numero)  {
		
		/* if (numero < '1' || numero > '12') { 
		 * throw new Exception("El numero de la carta tiene que estar entre 1 y 12"); 
		 * }
		 */
		
		this.numero = numero;
	}

	@Override
	public String toString() {
		return this.numero + " de " + this.palo;
	}

	

	
	
	
}
