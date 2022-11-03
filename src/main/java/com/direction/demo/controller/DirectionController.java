package com.direction.demo.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.direction.demo.service.DirectionService;

@RestController
@RequestMapping("/api")
public class DirectionController {

	private static final boolean Object = false;

	@Autowired
	private DirectionService directionService;

	@Autowired
	private Environment env;

	@GetMapping("/heredirection")
	public ResponseEntity<?> retrieveHereDirection() {

		MappingJacksonValue hereDirection = directionService.getHereDirection();

		return new ResponseEntity<>(hereDirection, HttpStatus.OK);
	}


	@GetMapping("/googledirection")
	public ResponseEntity<?> retrieveGoogleDirection() {

		MappingJacksonValue googleDirection = directionService.getGoogleDirection();


		return new ResponseEntity<>(googleDirection, HttpStatus.OK);
	}

}
