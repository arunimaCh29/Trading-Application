package com.app.trading.strategies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.trading.Isignal.SignalHandler;
import com.app.trading.algorithm.Algo;

@Component
@Qualifier("3")
public class StrategyThree implements SignalHandler{

	@Override
	public void handleSignal(int signal) {
		
		Algo algo = new Algo();
		algo.setAlgoParam(1,90);
		algo.setAlgoParam(2,15);
		algo.performCalc();
		algo.submitToMarket();
		algo.doAlgo();
	}	

}
