# Trading-Application
The application executes third party functions after receiving signals through API.
To add new Signals, please follow steps:
 	1. Assume Signal as strategies and create a class in package com.app.trading.strategies.
 	2. Implement Interface IAlgo.
 	3. Add the third party functions to be called in executeAlgo method.
 	4. Annotate class with @Compenent and add the number of signal as name of component bean for example: @Component("5) for signal '5'.
 	
# Requirement

Spring boot => 3.0.6
Maven
Java 17