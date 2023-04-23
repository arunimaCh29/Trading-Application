package com.app.trading.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.trading.Isignal.IAlgo;
import com.app.trading.Isignal.SignalHandler;

@Service
public class ApplicationService implements SignalHandler{

	private Map<String, IAlgo> strategies;
	  
	  public ApplicationService(Map<String, IAlgo> strategies) {
	  
	  this.strategies = strategies;
	  
	  }
	  
	@Override
	public void handleSignal(int signal) {
		
		 if (!strategies.containsKey(String.valueOf(signal))) { 
			 throw new IllegalArgumentException("The signal " + signal + " does not exist.");
		 }
			  strategies.get(String.valueOf(signal)).executeAlgo(); }
		
	}

	  
	 
