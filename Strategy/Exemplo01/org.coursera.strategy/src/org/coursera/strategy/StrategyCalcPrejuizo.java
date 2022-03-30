package org.coursera.strategy;

public class StrategyCalcPrejuizo implements StrategyCalculo {

	private final double PREJUIZO = 50;

	@Override
	public double calculateProfit(double price) {
		return price - this.PREJUIZO;
	}
	
	
}
