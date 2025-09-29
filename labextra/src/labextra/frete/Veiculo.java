package labextra.frete;

// classe abstrata para representar qualquer veículo
public abstract class Veiculo {
	protected String placa;
	protected int ano;
	
	// construtor
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
}