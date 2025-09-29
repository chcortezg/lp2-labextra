package labextra.frete;

// classe para representar um entregador autônomo ou um funcionário
public class Entregador {
	protected String nome;
	
	// construtor
	public Entregador(String nome) {
		super();
		this.nome = nome;
	}

	// getter
	public String getNome() {
		return nome;
	}	
}