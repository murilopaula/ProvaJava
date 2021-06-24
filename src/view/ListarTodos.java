package view;

import controllers.FormaController;
import models.Forma;

public class ListarTodos {

	public static void listarTodos() {

		System.out.println("\n".repeat(15));
		System.out.println("__Listar todas as formas__ \n");
		for (Forma formaCadastrada : FormaController.listarTodos()) {
			System.out.println(formaCadastrada);
		}

	}

}
