package auto_loja.model;

public class Carro extends Veiculo{
	
	private String modeloCar;

	public Carro(int numeroC, int tipo, String nomeMarca, float valor, String modeloCar) {
		super(numeroC, tipo, nomeMarca, valor);
		
		this.modeloCar = modeloCar;
		
	}

	public String getModeloCar() {
		return modeloCar;
	}

	public void setModeloCar(String modeloCar) {
		this.modeloCar = modeloCar;
	}

	 @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Modelo do Carro: " + this.modeloCar);
		}
}
