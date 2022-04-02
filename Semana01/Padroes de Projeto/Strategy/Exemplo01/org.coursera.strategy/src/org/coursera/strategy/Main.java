package org.coursera.strategy;

public class Main {

	public static void main(String[] args) {
		
		StrategyCalcPrejuizo strategyCalcPrejuizo = new StrategyCalcPrejuizo();
		StrategyCalcLucro StrategyCalcLucro = new StrategyCalcLucro();
		
		Produto consoleNewGeracao = new Produto("Playstation 5", 500, strategyCalcPrejuizo);
		consoleNewGeracao.calculateEndPrice();
		System.out.println(consoleNewGeracao);
		
		consoleNewGeracao.trocarDeEstrategia(StrategyCalcLucro);
		consoleNewGeracao.calculateEndPrice();
		System.out.println(consoleNewGeracao);
	}

}
