package com.app.trading.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import com.app.trading.service.ApplicationService;


@ExtendWith(MockitoExtension.class)
public class ApplicationControllerTest {

	@Mock
	ApplicationService service;

	@InjectMocks
	ApplicationController controller;


	@Test
	public void processSignalTest() {

	doNothing().when(service).handleSignal(1);

		assertEquals(controller.processSignal(1).getStatusCode(),HttpStatus.OK);
	}

	@Test
	public void processSignalExceptionTest() {

		doThrow(new IllegalArgumentException()).when(service).handleSignal(1);

		assertEquals(controller.processSignal(1).getStatusCode(),HttpStatus.EXPECTATION_FAILED);
	}
}
