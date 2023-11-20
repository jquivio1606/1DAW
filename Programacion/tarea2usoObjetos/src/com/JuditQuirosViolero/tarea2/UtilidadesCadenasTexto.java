package com.JuditQuirosViolero.tarea2;

import org.apache.commons.lang3.StringUtils;

public class UtilidadesCadenasTexto {

	
	/**
	 * Devuelve true o false si la cadena es igual si se lee por delante o por detrás
	 * @param cadena1
	 * @return esPalindromo
	 */
	
		public static boolean EsPalindromo (String palabra1) throws Exception {
			
			boolean esPalindromo = false;
			String palabraInvertida = StringUtils.reverse(palabra1);
			if (palabra1.equalsIgnoreCase(palabraInvertida)) {
				esPalindromo = true;
			}
			
			if (palabra1.matches(".*\\d+.*")) {
	            throw new Exception ("Por favor introducza una palabra no un valor numérico");
	        } 
			return esPalindromo;
		}
	
	/**
	 * Devuelve true o false si no se repiten letras en la cadena
	 * @param cadena2
	 * @return esHeterograma
	 */
		
		public static boolean EsHeterograma (String palabra2) throws Exception {
			
			boolean esHeterograma = true;
			palabra2 = palabra2.toLowerCase();
			
			for (int index = 0; index < palabra2.length(); index++) {
				char charAct = palabra2.charAt(index);
				char proxChar= palabra2.charAt(index + 1);
				if (charAct == proxChar) {
					esHeterograma =false;
				}
				
			}
			
			if (palabra2.matches(".*\\d+.*")) {
	            throw new Exception ("Por favor introducza una palabra no un valor numérico");
	        }
			
			return esHeterograma;
		}
	
	/**
	 * Cuenta las vocales que hay en uan cadena 
	 * @param cad
	 * @return String
	 */
		public static String ContarVocales (String cad) throws Exception {
			
			int contA= 0;
			int contE= 0;
			int contI= 0;
			int contO= 0;
			int contU= 0;
			for (int index = 0; index < cad.length(); index ++) {
				
				if (cad.charAt(index) == 'a' || cad.charAt(index) == 'á') {
					contA++; 
				} else if (cad.charAt(index) == 'e' || cad.charAt(index) == 'é') {
					contE++;
				} else if (cad.charAt(index) == 'i' || cad.charAt(index) == 'í') {
					contI++;
				} else if (cad.charAt(index) == 'o' || cad.charAt(index) == 'ó') {
					contO++;
				} else if (cad.charAt(index) == 'u' || cad.charAt(index) == 'ú') {
					contU++;
				}
			
			}
			if (cad.matches(".*\\d+.*")) {
	            throw new Exception ("Por favor introducza una palabra no un valor numérico");
	        }
			
			String result = contA + " a \n" + contE + " e \n" + contI + " i \n" + contO + " o \n" + contU + " u \n";
			
			return result;
		}
		
	/**
	 * Cuenta las palabras que hay en uan cadena 
	 * @param cad
	 * @return String
	 */
		public static int ContarPalabras(String cad4) throws Exception{
			
			int cont = 1;
			
			for (int index = 0; index < cad4.length(); index ++) {
				if (cad4.charAt(index) == ' ') {
					cont++;
				}
			}
			
			if (cad4.matches(".*\\d+.*")) {
	            throw new Exception ("Por favor introducza una palabra no un valor numérico");
	        }
			
			return cont;
		}
}
