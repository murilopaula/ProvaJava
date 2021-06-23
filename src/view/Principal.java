package view;

import java.util.Scanner;

import controllers.Helpers;

public class Principal {

	public static void main(String[] args) {
		

		int opcao = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\n__Escolha uma opção__\n");
			System.out.println("1 - Cadastrar Retângulo");
			System.out.println("2 – Cadastrar Triângulo");
			System.out.println("3 – Cadastrar Circulo");
			System.out.println("4 – Listar todos");
			System.out.println("5 – Listar Retângulo");
			System.out.println("6 – Listar Triângulo");
			System.out.println("7 – Listar Circulo");
			System.out.println("0 – Sair");

			opcao = Helpers.lerInteiro("\nDigite a opção: ");

			switch (opcao) {

			case 1:
				CadastrarRetangulo.renderizaRetangulo();;
				break;
			case 2:
				CadastrarTriangulo.renderizaTriangulo();
				break;
			case 3:
				CadastrarCirculo.renderizaCirculo();
				break;
			case 4:
				ListarTodos.listarTodos();
				break;
			case 5:
				ListarRetangulo.listaRetangulo();
				break;
			case 6:
				ListarTriangulo.listarTriangulo();
				break;
			case 7:
				ListarCirculo.listaCirculo();
				break;
			case 0:
				System.out.println("Saiu.\n");
				break;
			default:
				System.out.println("Opção não encontrada.\n");
				break;
			}
		} while (opcao != 0);

		sc.close();

	}

}
