package auto_loja.model;

public class Moto extends Veiculo {
	
	private String ModeloMot;

	public Moto(int numeroC, int tipo, String nomeMarca, float valor, String modeloMot) {
		super(numeroC, tipo, nomeMarca, valor);

	}

	public String getModeloMot() {
		return ModeloMot;
	}

	public void setModeloMot(String modeloMot) {
		ModeloMot = modeloMot;
	}
	
	  @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Modelo da Moto: " + this.ModeloMot);
		}

}
