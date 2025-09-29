package labextra.frete;

public class Carro extends Veiculo implements Fretavel {
	
	// contrutor
    public Carro(String placa, int ano) {
        super(placa, ano);
    }
    
    // sobrecarga de método da interface
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
    	return distanciaEmKm * 1.25;
    }
}
