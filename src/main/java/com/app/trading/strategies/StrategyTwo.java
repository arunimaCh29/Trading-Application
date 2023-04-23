package com.app.trading.strategies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.trading.Isignal.IAlgo;
import com.app.trading.algorithm.Algo;

@Component("2")
public class StrategyTwo implements IAlgo {


	@Override
	public void executeAlgo() {

		Algo algo = new Algo();
		algo.reverse();
		algo.setAlgoParam(1,80);
		algo.submitToMarket();
		algo.doAlgo();
	}

}
