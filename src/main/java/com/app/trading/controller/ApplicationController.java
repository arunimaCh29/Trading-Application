package com.app.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.trading.service.ApplicationService;

import jakarta.websocket.server.PathParam;

@RestController("/")
public class ApplicationController {

	@Autowired
	ApplicationService service;

	@GetMapping("signal/{id}")
	public ResponseEntity<String> processSignal(@PathVariable(value = "id") int signal) {

		try {
			service.handleSignal(signal);
			return new ResponseEntity<String>("Signal Processed", HttpStatus.OK);

		} catch (IllegalArgumentException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);

		}
	}
}
