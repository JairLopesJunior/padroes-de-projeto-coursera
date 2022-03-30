package org.coursera.strategy;

public class StrategyCalcLucro implements StrategyCalculo {
	
	private final int LUCRO = 2;

	@Override
	public double calculateProfit(double price) {
		System.out.println("StrategyCalcLucro FOI CHAMADA");
		return price * this.LUCRO;
	}

}
