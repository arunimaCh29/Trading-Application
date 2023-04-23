package com.app.trading.strategies;

import org.springframework.stereotype.Component;

import com.app.trading.Isignal.SignalHandler;
import com.app.trading.algorithm.Algo;

@Component("1")
public class StrategyOne implements SignalHandler {

	@Override
	public void handleSignal(int signal) {

		Algo algo = new Algo();
		algo.setUp();
		algo.setAlgoParam(1, 60);
		algo.performCalc();
		algo.submitToMarket();
		algo.doAlgo();
	}

}
