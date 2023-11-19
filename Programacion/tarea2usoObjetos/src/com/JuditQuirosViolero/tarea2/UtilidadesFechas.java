package com.JuditQuirosViolero.tarea2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilidadesFechas {

	/**
	 * Coge la fecha de nacimiento introducida por teclado y calcula tu edad.
	 * @param fechaNacString
	 * @return int anios
	 * @throws Exception
	 */
	
	public static int CalcularEdad (String fechaNacString)throws Exception {
			
		int anios = -1;
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat ("dd/MM/yyyy");
		
		try {
			Date fechaNac = formatoFecha.parse(fechaNacString);
			
			Calendar fechaNacCal = Calendar.getInstance();
            fechaNacCal.setTime(fechaNac);

            Calendar fechaActualCal = Calendar.getInstance();

            anios = fechaActualCal.get(Calendar.YEAR) - fechaNacCal.get(Calendar.YEAR);
            int meses = fechaActualCal.get(Calendar.MONTH) - fechaNacCal.get(Calendar.MONTH);
            int dias = fechaActualCal.get(Calendar.DAY_OF_MONTH) - fechaNacCal.get(Calendar.DAY_OF_MONTH);

            if (meses < 0 || (meses == 0 && dias < 0)) {
                anios--;
            }
			
		} catch (ParseException pe) {
			throw new Exception ("El formato de la fecha introducido no es el adecuado, por favor, introdúzcalo bien.");
		}
		
		return anios;
	}

	/**
	 * Coge un año introducida por teclado y comprueba si ese año es bisiesto o no.
	 * @param anio
	 * @return boolean esBisiesto
	 * @throws Exception
	 */
		
	public static boolean EsAnioBisiesto(String anio) throws Exception {
		
		boolean esbisiesto = false;
		int anioInt= -1;
		SimpleDateFormat formatoFecha = new SimpleDateFormat ("yyyy");
		
		try {
			Date anioDate = formatoFecha.parse(anio);
			Calendar anioCal = Calendar.getInstance();
            anioCal.setTime(anioDate);
   
            anioInt = anioCal.get(Calendar.YEAR);

		} catch (ParseException pe) {
			throw new Exception ("El formato de la fecha introducido no es el adecuado, por favor, introdúzcalo bien.");
		}
		
		if (anioInt % 4 == 0 || (anioInt % 100 == 0 && anioInt % 400 == 0)) {
			esbisiesto= true;	
		}
		
			
		return esbisiesto;
	}

	/**
	 * Coge dos fechas introducidas por teclado y calcula la diferencias entre ambas.
	 * @param fecha1, fecha2
	 * @return boolean esFechaPasada
	 * @throws Exception
	 */
	
	public static String CalcularDiferenciasFechas(String fecha1, String fecha2) throws Exception {
		
		SimpleDateFormat formatofechas = new SimpleDateFormat ("dd/MM/yyyy");
		int anios = Integer.MIN_VALUE;
		int meses = Integer.MIN_VALUE;
		int dias = Integer.MIN_VALUE;
		
		try {
			Date fecha1Date = formatofechas.parse(fecha1);
			Date fecha2Date = formatofechas.parse(fecha2);
			Calendar fecha1Cal = Calendar.getInstance();
			Calendar fecha2Cal = Calendar.getInstance();
			fecha1Cal.setTime(fecha1Date);
			fecha2Cal.setTime(fecha2Date);
			
			anios = fecha1Cal.get(Calendar.YEAR) - fecha2Cal.get(Calendar.YEAR);
			meses = fecha1Cal.get(Calendar.MONTH) - fecha2Cal.get(Calendar.MONTH);
			dias = fecha1Cal.get(Calendar.DAY_OF_MONTH) - fecha2Cal.get(Calendar.DAY_OF_MONTH);
			
			if (anios < 0) {
				anios = -anios;	
			} 
			if (meses < 0) {
				meses = -meses;
			}
			if (dias < 0) {
				dias = -dias;
			}
			
		} catch (ParseException pe) {
			throw new Exception ("El formato de la fecha introducido no es el adecuado, por favor, introdúzcalo bien.");
		}
		
		String diferenciaFechas = "Hay " + anios + " años, " + meses + " meses, y " + dias + " días de diferencia entre ambas fechas.";
		
		return diferenciaFechas;
	}
	
	/**
	 * Coge una fecha introducida por teclado y comprueba si es anterior o posterior a la fecha actual.
	 * @param fecha
	 * @return boolean esFechaPasada
	 * @throws Exception
	 */
	
	public static boolean EsFechaPasada (String fecha) throws Exception{
		
		boolean esFechaPasada = false;
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat ("dd/MM/yyyy");
		
		Date fechaAct = new Date ();
		
		try {
			Date fechaDate = formatoFecha.parse(fecha);
			
			if (fechaDate.after(fechaAct)){
				esFechaPasada = true;
			}
			
		} catch (ParseException pe) {
			throw new Exception ("El formato de la fecha introducido no es el adecuado, por favor, introdúzcalo bien.");
		}
		
		return esFechaPasada;
	}

	
}
