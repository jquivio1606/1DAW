package Tema5;

public class Baraja {
	private String tipo;
	private Carta[] baraja;
	final String[] numerosEspañola = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	final String[] numerosFracesa = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
	final String[] palosEspañola = {"oro" , "espada", "copa", "basto"};
	final String[] palosFracesa = {"picas" , "treboles", "corazones", "diamantes"};
	
	
	public Baraja(String tipo) {
		this.tipo = tipo;
		
		if (tipo.equalsIgnoreCase("española")) {
			
			this.baraja = new Carta [48];
	 		int index = 0;
			for (String palo : this.palosEspañola) {
				for (int num = 1; num <= 12; num++) {
		 			Carta carta = new Carta (palo, "" + num);
		 			this.baraja[index++] = carta;
				}
			}
		}
		
		if (tipo.equalsIgnoreCase("francesa")) {
			this.baraja = new Carta [52];
	 		int index2 = 0;
			for (String palo : this.palosFracesa) {
				for (int indexnum = 0; indexnum < this.numerosFracesa.length; indexnum++) {
		 			Carta carta = new Carta (palo, "" + this.numerosFracesa[indexnum]);
		 			this.baraja[index2++] = carta;
				}
			}
		}
		
	}
	

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * @return the baraja
	 */
	public Carta[] getBaraja() {
		return baraja;
	}
	
	/**
	 * @param baraja the baraja to set
	 */
	public void setBaraja(Carta[] baraja) {
		this.baraja = baraja;
	}

}
