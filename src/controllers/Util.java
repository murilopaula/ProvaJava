package controllers;

import java.util.Scanner;

public class Util {
	
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
	
}
