package controllers;

import java.util.ArrayList;

import models.Forma;
import models.Retangulo;
import models.Triangulo;

public class FormaController {

	private static ArrayList<Forma> formas = new ArrayList<Forma>();
	private static ArrayList<Triangulo> triangulo = new ArrayList<Triangulo>();
	private static ArrayList<Retangulo> retangulo = new ArrayList<Retangulo>();

	public static void cadastrarForma(Forma forma) {
		formas.add(forma);
		if (forma.getTipoForma() == "Tri�ngulo") {
			triangulo.add((Triangulo) forma);
		} else if (forma.getTipoForma() == "Ret�ngulo"){
			retangulo.add((Retangulo) forma);
		}
	}

	public static ArrayList<Forma> listarTodos() {
		return formas;
	}

	/* ############## TRI�NGULO ####################### */

	public static double calcularAreaTriangulo(int base, int altura) {

		double area = 0.0;

		area = (base * altura) / 2;

		return area;

	}

	public static ArrayList<Triangulo> listarTriangulo() {

		for (Triangulo formaCadastrada : triangulo) {
			if (formaCadastrada.getTipoForma().equals("Tri�ngulo")) {
				return triangulo;
			}
		}
		return null;

	}

	/* ############## RET�NGULO ####################### */

	public static double calcularAreaRetangulo(int altura, int largura) {

		double area = 0.0;

		area = altura * largura;

		return area;

	}

	public static ArrayList<Retangulo> listarRetangulo() {

		for (Retangulo formaCadastrada : retangulo) {
			if (formaCadastrada.getTipoForma().equals("Ret�ngulo")) {
				return retangulo;
			}
		}
		return null;

	}

}
