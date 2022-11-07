package com.direction.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.direction.demo.pojo.ResponseApiFormat;
import com.direction.demo.service.GoogleDirectionService;
import com.direction.demo.service.HereDirectionService;

@RestController
@RequestMapping("/api")
public class DirectionController {

	@Autowired
	private GoogleDirectionService googleDirectionService;
	
	@Autowired
	private HereDirectionService hereDirectionService;


	@GetMapping("/heredirection")
	public ResponseEntity<?> retrieveHereDirection() {

		ResponseApiFormat hereDirection = hereDirectionService.getHereDirection();

		return new ResponseEntity<>(hereDirection, HttpStatus.OK);
	}


	@GetMapping("/googledirection")
	public ResponseEntity<?> retrieveGoogleDirection() {

		ResponseApiFormat googleDirection = googleDirectionService.getGoogleDirection();

		return new ResponseEntity<>(googleDirection, HttpStatus.OK);
	}

}
