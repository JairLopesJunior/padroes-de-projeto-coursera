package org.coursera.strategy;

public class Produto {
	
	private String name;
	private double price;
	private double endPrice;

	private StrategyCalculo calculationStrategy;

	public Produto(String name, double price, StrategyCalculo calculationStrategy) {
		super();
		this.name = name;
		this.price = price;
		this.calculationStrategy = calculationStrategy;
	}
	
	// Aqui é onde a estrátegia ocorre (Trocas dos algoritmos)
	public void calculateEndPrice() {
		this.endPrice = this.calculationStrategy.calculateProfit(this.price);
	}
	
	public void trocarDeEstrategia(StrategyCalculo newStrategy) {
		this.calculationStrategy = newStrategy;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", endPrice=" + endPrice + ", calculationStrategy="
				+ calculationStrategy + "]";
	}
}
