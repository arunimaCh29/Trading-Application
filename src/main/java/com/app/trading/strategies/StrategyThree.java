package com.app.trading.strategies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.trading.Isignal.IAlgo;
import com.app.trading.algorithm.Algo;

@Component("3")
public class StrategyThree implements IAlgo {


	@Override
	public void executeAlgo() {
		Algo algo = new Algo();
		algo.setAlgoParam(1,90);
		algo.setAlgoParam(2,15);
		algo.performCalc();
		algo.submitToMarket();
		algo.doAlgo();
	}

}
