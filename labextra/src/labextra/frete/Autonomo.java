package labextra.frete;

public class Autonomo extends Entregador implements Fretavel {
	
	// construtor
	public Autonomo(String nome) {
		super(nome);
	}

	// sobrecarga de método da interface
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {
		return distanciaEmKm * 0.95; // custo variável de uma entrega feita por um autônomo
	}
}