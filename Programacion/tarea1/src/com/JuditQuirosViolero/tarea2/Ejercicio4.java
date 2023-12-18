package com.JuditQuirosViolero.tarea2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/* 	4 .Pedir números al usuario hasta que el usuario introduzca un -1. Al terminar, mostrará lo siguiente:
				 mayor número introducido
				 menor número introducido
				 suma de todos los números
				 media aritmética de todos los números
			El número -1 no contara como número. 															 */

		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		int cantNum = 0;
		
		do {
			
			System.out.println("Introduce un número. Para acabar escribe -1");
				num = scan.nextInt();
		
				 if (num != -1) {
		                if (num > mayor) {
		                    mayor = num;
		                }
		                if (num < menor) {
		                    menor = num;
		                }
		                suma += num;
		                cantNum++;
				}
		} while (num != -1);
		
			if (num == -1){
				System.out.println("El mayor número introducido es: " + mayor);
				System.out.println("El menor número introducido es: " + menor);
				System.out.println("la suma de todos los números es: " + suma);
				System.out.println("La media de todos los números es: " + (suma / cantNum));
			}
		
		scan.close();
	}
}
		
		  
	

















/*
Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una serie de números. Para terminar la serie escribe -1. ");
		int num = scan.nextInt();
		
		int mayor = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		int suma = 0;
		int CantNum = 0;
		
		do {
			
			
			
			if (num != -1) {
				
				if	(num < mayor) {
					num = mayor;
					
				} 
				if (num > menor){
					num = menor;
				}
				
			suma += num;
			CantNum ++;
			}
	
		} while (num != -1);
		
		if (num == -1) {
			
			System.out.println("El mayor número introducido es : " + mayor);
			System.out.println("El menor número introducido es : " + menor);
			System.out.println("La suma de todos los número es: " + suma);
			System.out.println("La media de todos los números es: " + (suma / CantNum));
			
		} else {
			System.out.println("Los caracteres introducidos no son correctos.");
		}
		scan.close();	
 */

