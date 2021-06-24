package view;

import controllers.FormaController;
import models.Forma;

public class ListarRetangulo {

	public static void listaRetangulo() {

		System.out.println("\n".repeat(15));
		System.out.println("__Listar retângulos__ \n");
		for (Forma formaCadastrada : FormaController.listarRetangulo()) {
			System.out.println(formaCadastrada);
		}

	}

}
