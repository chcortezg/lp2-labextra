package labextra.frete;
 
public class Motocicleta extends Veiculo implements Fretavel {
	
	// construtor
    public Motocicleta(String placa, int ano) {
        super(placa, ano);
    }

    // sobrecarga de método da interface
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
    	return distanciaEmKm * 0.45; // cálculo de frete para motocicleta
    }
}