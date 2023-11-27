package auto_loja;

import java.io.IOException;
import auto_loja.controller.VeiculoController;
import auto_loja.model.Carro;
import auto_loja.model.Moto;

import java.util.InputMismatchException;
import java.util.Scanner;

import auto_loja.util.*;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      
		VeiculoController veiculos = new VeiculoController();

		int opcao, numeroC, tipo;
		String nomeMarca, modeloCar, modeloMot, prosseg;
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
			System.out.println("            3 - Buscar Veículo por número de Cadastro");
			System.out.println("            4 - Atualizar Dados do Veículo           ");
			System.out.println("            5 - Excluir Veículo                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 100;
			}

			if (opcao == 6) {
				System.out.println("\nAuto Store - Revendas!");
				sobre();
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Veículo\n\n");
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
					veiculos.cadastrarVeiculo(new Carro(veiculos.gerarId(), tipo, nomeMarca, valor, modeloCar));

					break;

				case 2:
					System.out.println("Nome do Modelo da Moto: ");
					sc.skip("\\R?");
					modeloMot = sc.nextLine();
					veiculos.cadastrarVeiculo(new Moto(veiculos.gerarId(), tipo, nomeMarca, valor, modeloMot));

				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os Veículos\n\n");
				veiculos.listarTodosVeiculos();

				keyPress();
				break;

			case 3:
				System.out.println("Buscar Veículo por número de Cadastro\n\n");
				System.out.println("Digite o número de Cadastro do produto: ");
				
				numeroC = sc.nextInt();
				
				veiculos.consultarVeiculo(numeroC);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do Veículo\n\n");

				System.out.print("Digite o número de Cadastro do veículo: ");
				numeroC = sc.nextInt();
				
				if (veiculos.buscarNaCollection(numeroC).isPresent()) {
					System.out.println("Digite os novos dados do Veículo: \n");
					
					System.out.print("Digite a marca do Veículo: ");
					sc.skip("\\R?");
					nomeMarca = sc.nextLine();
					
					System.out.print("Digite o preço do Veículo: ");
					valor = sc.nextFloat();
					
					tipo = veiculos.retornaTipo(numeroC);
					
					switch(tipo){
					case 1:
						System.out.print("Nome do modelo do Carro: ");
						sc.skip("\\R?");
						modeloCar = sc.nextLine();
						veiculos.atualizarVeiculo(new Carro(numeroC, tipo, nomeMarca, valor, modeloCar));
						break;
					case 2:
						System.out.print("Nome  do modelo da Moto: ");
						sc.skip("\\R?");
						modeloMot = sc.nextLine();
						veiculos.atualizarVeiculo (new Moto (numeroC, tipo, nomeMarca, valor, modeloMot));
						break;
					}
					
				}

				keyPress();
				break;
				
			case 5:
				System.out.println("Excluir Veículo\n\n");
				
				System.out.print("Digite o número de Cadastro do veículo: ");
				numeroC = sc.nextInt();
				veiculos.consultarVeiculo(numeroC);
				
				System.out.println("\nATENÇÃO");
				System.out.println("Você está tentando  excluir o veículo do catálogo! Deseja prosseguir? (S/N)");
				sc.skip("\\R?");
				prosseg = sc.nextLine();
				
				if (prosseg.equalsIgnoreCase("S"))
					veiculos.deletarVeiculo(numeroC);
				else 
					System.out.println("Produto não deletada");

				keyPress();
				break;

			}

				}
			}
		

	public static void sobre() {
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:  ");
		System.out.println("Victória Maria de Moraes Cândidop - victoria.candido.mm@gmail.com");
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