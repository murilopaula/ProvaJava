package view;

import controllers.FormaController;
import models.Forma;

public class ListarTriangulo {

	public static void listarTriangulo() {
		
		System.out.println("\n".repeat(15));
		System.out.println("__Listar triângulos__ \n");
		for (Forma formaCadastrada : FormaController.listarTriangulo()) {
			System.out.println(formaCadastrada);
		}
	}

}
