package com.app.trading.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.trading.Isignal.SignalHandler;

@Service
public class ApplicationService {

	private Map<String, SignalHandler> strategies;
	
	  public ApplicationService(Map<String, SignalHandler> strategies) {
		  
	    this.strategies = strategies;
	    
	  }
	  
	  public void signalProcessing(int signal) {
		 
		      if (!strategies.containsKey(String.valueOf(signal))) {
		        throw new IllegalArgumentException("The signal " + signal + " does not exist.");
		      }
		      strategies.get(String.valueOf(signal)).handleSignal(signal);;
		    }
	
}
