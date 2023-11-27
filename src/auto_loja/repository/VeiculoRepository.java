package auto_loja.repository;

import auto_loja.model.Veiculo;

public interface VeiculoRepository {
	
	
	//CRUD do Produto
	public void cadastrarVeiculo(Veiculo veiculo);
	public void listarTodosVeiculos();
	public void consultarVeiculo(int numeroC);
	public void atualizarVeiculo(Veiculo veiculo);
	public void deletarVeiculo(int numeroC);
	

}


