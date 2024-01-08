package Tema5;

public class Baraja {
	private String tipo;
	private Carta[] baraja;
	final String[] palosEspaniola = {"oros", "copas", "espadas", "bastos"};
	final String[] palosFrancesa = {"corazones", "picas", "diamantes", "tréboles"};
	final String[] numerosEspaniola = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	final String[] numerosFrancesa = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
	
	public Baraja(String tipo) {
		this.tipo = tipo;
		if(tipo.equalsIgnoreCase("española")) {
			this.baraja = new Carta[48];
			int index = 0;
			for (String palo : this.palosEspaniola) {
				for (int num = 1; num <= 12; num++) {
					Carta c = new Carta(palo, "" + num);
					this.baraja[index++]= c;
				}
			}
		} if(tipo.equalsIgnoreCase("francesa")) {
			this.baraja = new Carta[52];
			int index = 0;
			for (String palo : this.palosFrancesa) {
				for (int indexNum = 0; indexNum < this.numerosFrancesa.length; indexNum++) {
					Carta c = new Carta(palo, this.numerosFrancesa[indexNum]);
					this.baraja[index++]= c;
				}
			}
		}
	}
	
	
	public Baraja( Baraja baraja, int num) {
		this.tipo = baraja.getTipo();
		this.baraja=  new Carta[num] ;
		
		
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

	
	
	public Baraja[] repartoMentiroso (int numJugadores) {
		Baraja [] manos= new Baraja [numJugadores];
		
		
		
		return manos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







