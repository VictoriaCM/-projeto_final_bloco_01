package auto_loja.controller;

import java.util.ArrayList;
import java.util.Optional;

import auto_loja.model.Veiculo;
import auto_loja.repository.VeiculoRepository;

public class VeiculoController implements VeiculoRepository {

	// Criando a Collection
	private ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	int numeroC = 0;

	@Override
	public void cadastrarVeiculo(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
		System.out.println("Veículo Chassi número " + veiculo.getNumeroC() + " cadastrado com sucesso!");

	}

	@Override
	public void listarTodosVeiculos() {
		for (var produto : listaVeiculos)
			produto.visualizar();

	}

	@Override
	public void consultarVeiculo(int numeroC) {
		Optional<Veiculo> veiculo = buscarNaCollection(numeroC);

		if (veiculo.isPresent())
			veiculo.get().visualizar();
		else
			System.out.println("Produto não encontrado!");

	}

	@Override
	public void atualizarVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarVeiculo(int numeroC) {
		//delet

	}

	public Optional<Veiculo> buscarNaCollection(int numeroC) {
		for (var veiculo : listaVeiculos) {
			if (veiculo.getNumeroC() == numeroC)
				return Optional.of(veiculo);
		}
		return null;
	}

	public int gerarId() {
		return ++numeroC;

	}

}
