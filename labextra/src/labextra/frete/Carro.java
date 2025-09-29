package labextra.frete;

// classe para representar um carro utilizado para entregas
public class Carro extends Veiculo implements Fretavel {
	
	// contrutor
    public Carro(String placa, int ano) {
        super(placa, ano);
    }
    
    // sobrecarga de método da interface
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
    	return distanciaEmKm * 1.25; // cálculo de frete para carro
    }
}
