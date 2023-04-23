package com.app.trading.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.trading.Isignal.IAlgo;
import com.app.trading.strategies.StrategyOne;

@ExtendWith(MockitoExtension.class)
public class ApplicationServiceTest {

	@InjectMocks
	ApplicationService service;

	@Mock
	private Map<String, IAlgo> strategies;

	@Mock
	private StrategyOne strategy;

	@Test
	public void signalNotPresentTest() {

		assertThrows(IllegalArgumentException.class, () ->{
			service.handleSignal(5);
		});
	}

	@Test
	public void signalPresent() {

		String signal ="1";
		doReturn(true).when(strategies).containsKey(signal);
		doReturn(strategy).when(strategies).get(signal);
		doNothing().when(strategy).executeAlgo();

		assertDoesNotThrow(() -> {
			service.handleSignal(1);
		});
	}

}
