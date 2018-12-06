package com.base.SpringBootWithC3P0Pooling.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmileCentiliController {

	@Autowired
	private final Logger log = LoggerFactory.getLogger(SmileCentiliController.class);

	@GetMapping("/notification")
	public ResponseEntity<String> smileRequestController(@RequestParam Map<String, String> requestMap) {
		return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	}
}
