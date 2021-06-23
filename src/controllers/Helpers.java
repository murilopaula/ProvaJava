package controllers;

import java.util.Scanner;

public class Helpers {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int lerInteiro(String msg) {
		int valor = 0;
		boolean eInteiro = false;
		
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				eInteiro = true;
			} catch (Exception e) {
				System.out.println("\nApenas números\n");
			}
		} while (!eInteiro);
		
		return valor;
	}
	
	public static double lerDouble(String msg) {
		double valor = 0;
		boolean valorLido = false;
		do {
			try {
				System.out.println(msg);
				valor = Double.parseDouble(sc.next());
				valorLido = true;
			} catch (NumberFormatException e) {
				System.out.println("\nApenas numeros\n");
			}
		}while(!valorLido);
		return valor;
	}
	
}
