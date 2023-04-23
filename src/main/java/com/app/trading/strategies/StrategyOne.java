package com.app.trading.strategies;

import org.springframework.stereotype.Component;

import com.app.trading.Isignal.IAlgo;
import com.app.trading.algorithm.Algo;

@Component("1")
public class StrategyOne implements IAlgo {


	@Override
	public void executeAlgo() {
		Algo algo = new Algo();
		algo.setUp();
		algo.setAlgoParam(1, 60);
		algo.performCalc();
		algo.submitToMarket();
		algo.doAlgo();

	}

}
