package com.app.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.trading.service.ApplicationService;

@RestController("/")
public class ApplicationController {

	@Autowired
	ApplicationService service;

	public ResponseEntity<String> processSignal(int signal) {

		return new ResponseEntity<String>("Signal Not Processed", HttpStatus.EXPECTATION_FAILED);
	}
}
