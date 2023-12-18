package Tema3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Fechas {

	public static void main(String[] args) {
				
				LocalDate ahora = LocalDate.now();
				System.out.println("Fecha con LocalDate: " + ahora);
				DateTimeFormatter formatLocalDate =  DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
				System.out.println("Fecha con LocalDate formateada: " + ahora.format(formatLocalDate));
				
				LocalDate ayer = LocalDate.parse("30/10/2023", formatLocalDate);
				System.out.println("La fecha de ayer fue: " + ayer.format(formatLocalDate));
				
				Date hoy = new Date();
				System.out.println("Fecha con Date: " + hoy);
				SimpleDateFormat formatDate = new SimpleDateFormat("'Son las' HH:mm:ss 'del día' dd/MM/yyyy");		
				System.out.println("Fecha con Date formateada: " + formatDate.format(hoy));
	}

}
