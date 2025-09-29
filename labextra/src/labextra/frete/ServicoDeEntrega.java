package labextra.frete;

import java.util.ArrayList;
import java.util.List;

// classe para representar o serviço de entrega
public class ServicoDeEntrega {
	private List<Fretavel> itens;
	
	// construtor
	public ServicoDeEntrega() {
		this.itens = new ArrayList<>();
	}
	
	// método para adicionar um item (carro, motocicleta, funcionário, autônomo)
	public void adicionarItem(Fretavel item) {
		itens.add(item);
	}
	
	// método para calcular o custo total do frete
	public double calcularCustoTotal(double distanciaEmKm) {
		double total = 0;
		for (Fretavel item : itens) {
			total += item.calcularCustoFrete(distanciaEmKm);
		}
		return total;
	}
}