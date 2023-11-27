package auto_loja;

import java.io.IOException;
import auto_loja.model.Veiculo;
import  auto_loja.model.Carro;
import auto_loja.model.Moto;

import java.util.InputMismatchException;
import java.util.Scanner;

import auto_loja.util.*;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao, numeroC, tipo;
		String nomeMarca,modeloCar, modeloMot;
		float valor;

		while (true) {

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Auto_Store                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar veiculo                    ");
			System.out.println("            2 - Listar todos                         ");
			System.out.println("            3 - Buscar Veículo por Chassi            ");
			System.out.println("            4 - Atualizar Dados do Veículo           ");
			System.out.println("            5 - Excluir Veículo                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = sc.nextInt();
			
			try {
				opcao = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao=0;
			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAuto Store - revendas!");
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar Veículo\n\n");
				System.out.print("Digite o tipo do produto (1-Carro / 2-Moto): ");
					tipo = sc.nextInt();
					
				System.out.print("Digite a Marca do produto: ");
				sc.skip("\\R?");
				nomeMarca = sc.nextLine();
				
				System.out.println("Digite o Valor do Produto: ");
				valor = sc.nextFloat();
				
				switch (tipo) {
				case 1:
					System.out.println("Nome do Modelo do Carro: ");
					sc.skip("\\R?");
					modeloCar = sc.nextLine();
					
					break;
				

				case 2:
					System.out.println("Nome do Modelo da Moto: ");
					sc.skip("\\R?");
					modeloMot = sc.nextLine();
					
				}
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os Veículos\n\n");
				
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Veículo por Chassi\n\n");
				numeroC = sc.nextInt();
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do Veículo\n\n");
				
				System.out.print("Digite o Chassi do produto: ");
				numeroC = sc.nextInt();
				
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Excluir Veículo\n\n");
				
				keyPress();
				break;

			}

		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:  ");
		System.out.println("Victória Maria de Moraes Cândido - victoria.candido.mm@gmail.com");
		System.out.println("github.com/VictoriaCM");
		System.out.println("*********************************************************");
		System.out.println(Cores.TEXT_RESET);
	}
	

	public static void keyPress() {

		try {

			System.out.println(
					Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "Você pressionou uma tecla diferente de enter!");
		}
}
}