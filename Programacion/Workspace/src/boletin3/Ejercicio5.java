package boletin3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 5 - Crea una aplicación que nos pida por teclado que introduzcamos
		 * nuestra fecha de cumpleaños y nos indique por pantalla cuantos meses, semanas
		 * y días nos faltan para celebrar nuestro cumpleaños.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		Date hoy = new Date();
		Date cumple = new Date();
		boolean fechaCorrecta = false;

		while (!fechaCorrecta) {
			System.out.print("Introduce tu fecha de cumpleaños con formato (dd/MM/yyyy): ");
			String fechaCumpleStr = scan.nextLine();
			try {
				cumple = obtenerFechaProxCumple(fechaCumpleStr);
				fechaCorrecta = true;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		scan.close();
// Se calcula la diferencia entre el cumpleaños y hoy
		long diferencia = cumple.getTime() - hoy.getTime();
		long meses = diferencia / (1000l * 60 * 60 * 24 * 30);
		long semanas = (diferencia - meses * (1000l * 60 * 60 * 24 * 30)) / (1000l * 60 * 60 * 24 * 7);
		long dias = (diferencia - meses * (1000l * 60 * 60 * 24 * 30) - semanas * (1000l * 60 * 60 * 24 * 7))
				/ (1000l * 60 * 60 * 24);
		System.out.println(diferencia);
		System.out.printf("Faltan %d meses, %d semanas y %d días para tu cumpleaños", meses, semanas, dias);
	}

	/**
	 * Obtiene la fecha del próximo cumpleaños a partir de la fecha de nacimiento.
	 * 
	 * @param fechaStr
	 * @return fechaProxCumpleanios
	 * @throws Exception
	 */
	public static Date obtenerFechaProxCumple(String fechaStr) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento = null;

		try {
			fechaNacimiento = dateFormat.parse(fechaStr);
		} catch (ParseException e) {
			throw new Exception("El formato no es el adecuado, por favor introduce una fecha correcta.");
		}

//TODO: Lo que hay que calcular es si según la fecha que es el cumpleaños es en el año actual o en el siguiente.
// para ello habrá que comparar los meses y modificar el año de la fecha de nacimiento
//TODO: Podrían hacerse cálculos como en casos anteriores con los milisegundos de las fechas, pero en este caso se 
// realizarán estos cálculos usando la clase Calendar. Ver documentación --> https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html

// Un objeto calendar se inicializaliza de la siguiente manera

		Calendar calHoy = Calendar.getInstance();

		Calendar calFechaNac = Calendar.getInstance();
		calFechaNac.setTime(fechaNacimiento);
		Calendar fechaCumple = calFechaNac;

		if ((calFechaNac.get(Calendar.MONTH) > calHoy.get(Calendar.MONTH))
				|| (calFechaNac.get(Calendar.MONTH) > calHoy.get(Calendar.MONTH)
						&& calFechaNac.get(Calendar.DATE) >= calHoy.get(Calendar.DATE))) {
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR));
		} else {
			fechaCumple.set(Calendar.YEAR, calHoy.get(Calendar.YEAR) + 1);
		}

		System.out.println("La fecha del cumple es: " + dateFormat.format(fechaCumple.getTime()));

		return fechaCumple.getTime();

	}

}
