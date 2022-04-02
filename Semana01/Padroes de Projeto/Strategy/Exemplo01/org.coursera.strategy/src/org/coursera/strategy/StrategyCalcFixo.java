package org.coursera.strategy;

public class StrategyCalcFixo implements StrategyCalculo {

	private final double LUCRO_FIXO = 10;

	@Override
	public double calculateProfit(double price) {
		return price + this.LUCRO_FIXO;
	}
	
	
}
