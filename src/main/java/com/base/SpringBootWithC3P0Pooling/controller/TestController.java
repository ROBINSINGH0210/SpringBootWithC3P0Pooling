package com.base.SpringBootWithC3P0Pooling.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/notification")
	public ResponseEntity<String> requestController(@RequestParam Map<String, String> requestMap) {
		return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	}
}
