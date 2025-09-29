package labextra.frete;

public class Main {
	public static void main(String [] args) {

		// simulando uma entrega de 10km de carro feita por um funcionário
		ServicoDeEntrega entrega1 = new ServicoDeEntrega();
		entrega1.adicionarItem(new Carro("M3NG0", 1981)); // adicionando um carro como item
		entrega1.adicionarItem(new Funcionario("Zico")); // adiconando um funcionário como item
		double custoEntrega1 = entrega1.calcularCustoTotal(10); // calculando o frete para 10km nas condições
		System.out.println("Custo total da entrega de 10km realizada por um funcionário de carro: R$" + custoEntrega1);
		
		// simulando uma entrega de 25km de motocicleta feita por um autônomo
		ServicoDeEntrega entrega2 = new ServicoDeEntrega();
		entrega2.adicionarItem(new Motocicleta("FL4", 2019)); // adicionando uma motocicleta como item
		entrega2.adicionarItem(new Autonomo("Júnior")); // adiconando um autônomo como item
		double custoEntrega2 = entrega2.calcularCustoTotal(25); // calculando o frete para 25km nas condições
		System.out.println("Custo total da entrega de 25km realizada por um autônomo de motocicleta: R$" + custoEntrega2);
	}
}