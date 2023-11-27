package auto_loja.model;

public abstract class Veiculo {


	private int numeroC, tipo;
	private String nomeMarca;
	private float valor;
	
	
	public Veiculo(int numeroC, int tipo, String nomeMarca, float valor) {
		this.numeroC = numeroC;
		this.tipo = tipo;
		this.nomeMarca = nomeMarca;
		this.valor = valor;
		
		
	}


	public int getNumeroC() {
		return numeroC;
	}


	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getNomeMarca() {
		return nomeMarca;
	}


	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1 -> tipo = "Carro";
		case 2 -> tipo = "Moto";
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("	Dados do Veículo	");
		System.out.println("\n\n***********************************************************");
		System.out.println("Número de Cadastro do Veículo: " + this.numeroC);
		System.out.println("Marca do Veículo: " + this.nomeMarca);
		System.out.println("Tipo de Veículo: " + tipo);
		System.out.println("Preço de Revenda (Tabela FIPE): " + this.valor);
	}
	
}
