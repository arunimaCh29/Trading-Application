package com.app.trading.strategies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.trading.Isignal.SignalHandler;
import com.app.trading.algorithm.Algo;

@Component
@Qualifier("2")
public class StrategyTwo implements SignalHandler{

	@Override
	public void handleSignal(int signal) {
		
		Algo algo = new Algo();
		algo.reverse();
		algo.setAlgoParam(1,80);
		algo.submitToMarket();
		algo.doAlgo();
	}	

}
