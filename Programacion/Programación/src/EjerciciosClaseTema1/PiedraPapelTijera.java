package EjerciciosClaseTema1;

import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		
		final String PIEDRA = "PIEDRA"; //0
		final String PAPEL = "PAPEL"; 	//1
		final String TIJERAS = "TIJERAS";	//2
		int computer = (int) (Math.random() * 3);
		
		String computerString = (1 == computer)? PAPEL : (2 == computer)? TIJERAS : PIEDRA;
		
		final String msgComputerChoice  = "La computadora elige: " + computerString.toLowerCase() + "/n";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		
		System.out.println("Hola " + nombre + " elige piedra, papel o tijeras.");
		String player = scan.nextLine(); 
		
		boolean correcto = player.equalsIgnoreCase(PIEDRA)	|	player.equalsIgnoreCase(PAPEL)	|	player.equalsIgnoreCase(TIJERAS);
		String msg = !correcto ? "ERROR! debes escoger entre piedra, papel, o tijeras" :"";
		boolean terminado = !correcto ? true : false;
		boolean empate = !terminado  && computerString.equals(player.toUpperCase());
		terminado = empate;
		
		msg = correcto && empate && terminado ? msgComputerChoice + "Empate! ambos han elegido: " + computerString.toLowerCase() : msg;
		
		msg = (correcto && !empate && !terminado) ? 
			  (computerString.equals(PIEDRA) && player.equalsIgnoreCase(PAPEL)) ?
			msgComputerChoice + "Ganaste!"
			
			: (computerString.equals(PAPEL) && player.equals(TIJERAS)) ?
			msgComputerChoice + "Ganaste!"
			
			: (computerString.equals(TIJERAS) && player.equals(PIEDRA)) ?
			msgComputerChoice + "Ganaste!" : msgComputerChoice + "Perdiste!" : msg;
		
		System.out.println(msg);
		scan.close();
		
		
	}

}
