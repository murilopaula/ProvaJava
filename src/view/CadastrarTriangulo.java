package view;

import java.util.Scanner;

import controllers.FormaController;
import controllers.Helpers;
import models.Triangulo;

public class CadastrarTriangulo extends Principal {

	public static void renderizaTriangulo() {
		
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo;
		
		System.out.println("\n".repeat(15));
		triangulo = new Triangulo();
		
		triangulo.setBaseTriangulo(Helpers.lerInteiro("\nDigite a base do triângulo: "));
		triangulo.setAlturaTriangulo(Helpers.lerInteiro("\nDigite a altura do triangulo: "));
		triangulo.setCalcularArea(FormaController.calcularAreaTriangulo(triangulo.getBaseTriangulo(), triangulo.getAlturaTriangulo()));
		
		FormaController.cadastrarForma(triangulo);
		
	}

}
