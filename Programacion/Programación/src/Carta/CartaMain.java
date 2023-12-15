package Carta;

public class CartaMain {

	public static void main(String[] args) {

//		Carta [] baraja = new Carta [48];
//		String[] palos = {"oro" , "espada", "copa", "basto"};
// 		int index = 0;
//		for (String palo : palos) {
//			for (int num = 1; num <= 12; num++) {
//	 			Carta carta = new Carta (palo, num);
//	 			baraja[index++] = carta;
//			}
//		}
		
		Baraja b = new Baraja("española");
		
		for (Carta carta : b.getBaraja()) {
			System.out.println(carta);
		}
		
		Baraja f = new Baraja("francesa");
		
		for (Carta carta: f.getBaraja()) {
			System.out.println(carta);
		}
	}

}
