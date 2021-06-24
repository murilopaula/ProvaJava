package view;

import java.util.Scanner;

import controllers.FormaController;
import controllers.Helpers;
import models.Retangulo;

public class CadastrarRetangulo {

	public static void renderizaRetangulo() {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo;
		
		System.out.println("\n".repeat(15));
		retangulo = new Retangulo();
		
		retangulo.setAltura(Helpers.lerInteiro("\nDigite a ALTURA do ret�ngulo: "));
		retangulo.setLargura(Helpers.lerInteiro("\nDigite a LARGURA do ret�ngulo: "));
		retangulo.setCalcularArea(FormaController.calcularAreaRetangulo(retangulo.getAltura(), retangulo.getLargura()));
		
		FormaController.cadastrarForma(retangulo);
		
	}
	
}
