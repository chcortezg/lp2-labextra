package labextra.frete;

public class Funcionario extends Entregador implements Fretavel {
	
	// construtor
	public Funcionario(String nome) {
		super(nome);
	}

	// sobrecarga de método da interface
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return 5; // custo fixo de uma entrega feita por um funcionário
	}
}