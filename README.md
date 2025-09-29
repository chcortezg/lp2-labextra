# SISTEMA DE FRETE  
### Cálculo de custo de entregas

Este projeto é um sistema simples desenvolvido em Java para cálculo do custo total de entregas em uma empresa de logística. Ele foi desenvolvido como prática laboratorial extra para a disciplina de Linguagem de Programação II do Bacharelado em Tecnologia da Informação do IMD/UFRN no período 2025.2.

---

## Funcionalidades

- **Modelagem orientada a objetos com interface e herança**  
  - Interface Fretavel com método para calcular o custo do frete;
  - Classes Veiculo (abstrata) e Entregador;
  - Implementações concretas: Carro, Motocicleta, Funcionario e Autonomo.

- **Cálculo do custo de frete por veículo**  
  - Carro: distância * 1,25;
  - Motocicleta: distância * 0,45.  

- **Cálculo do custo de frete por entregador**  
  - Funcionário: custo fixo de R$ 5,00 por entrega;
  - Autônomo: distância * 0,95.

- **Simulação de entregas**  
  - Entrega de 10 km feita por um funcionário com um carro;
  - Entrega de 25 km feita por um autônomo com uma motocicleta.  

---

## Estrutura do projeto

- Fretavel.java: interface que define o contrato de cálculo de frete;
- Veiculo.java: classe abstrata para veículos;
- Carro.java: implementa Veiculo e calcula custo por km;
- Motocicleta.java: implementa Veiculo e calcula custo por km;
- Entregador.java: classe abstrata para entregadores;
- Funcionario.java: entregador com custo fixo por entrega; 
- Autonomo.java: entregador com custo variável por km;
- ServicoDeEntrega.java: gerencia lista de itens fretáveis e calcula o custo total;
- Main.java: classe principal com as simulações de entrega.

---

## Exemplo de saída esperada

```text
Custo total da entrega de 10km realizada por um funcionário de carro: R$17.5
Custo total da entrega de 25km realizada por um autônomo de motocicleta: R$35.0
