package controllers;

import java.util.ArrayList;

import models.Forma;

public class FormaController {
	
	private static ArrayList<Forma> formas = new ArrayList<Forma>();
	
	public static void cadastrarForma(Forma forma) {
		formas.add(forma);
	}
	
	public static double calcularAreaTriangulo(int base, int altura) {
		
		double area = 0.0;
		
		area = (base*altura)/2;
		
		return area;		
	}
	
	public static ArrayList<Forma> listarTriangulo(){
		for (Forma formaCadastrada : formas) {
			if (formaCadastrada.getTipoForma().equals("Triângulo")) {
				return formas;
			}
		}
		return null;
	}
	
}
