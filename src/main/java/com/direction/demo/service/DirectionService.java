package com.direction.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.direction.demo.pojo.GoogleDirection;
import com.direction.demo.pojo.HereDirection;
import com.direction.demo.pojo.ResponseApiFormat;
import com.direction.demo.pojo.RouteObject;
import com.direction.demo.pojo.SectionObject;
import com.direction.demo.pojo.google.Leg;
import com.direction.demo.pojo.google.Route;

import com.direction.demo.pojo.google.StepObject;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Service
public class DirectionService {
	@Autowired
	private Environment env;

	private RestTemplate restTemplate = new RestTemplate();


	public MappingJacksonValue getHereDirection() {

		String hereApi = env.getProperty("hereapi.url");

		HereDirection hereDirection = restTemplate.getForObject(hereApi, HereDirection.class);

		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(hereDirection);

		FilterProvider filterProvider = new SimpleFilterProvider()
				.addFilter("RoutesFilter", SimpleBeanPropertyFilter.filterOutAllExcept("sections"))
				.addFilter("SectionFilter", SimpleBeanPropertyFilter.filterOutAllExcept("type", "polyline"));
		mappingJacksonValue.setFilters(filterProvider);

		return mappingJacksonValue;

	}

	public MappingJacksonValue getGoogleDirection() {
		String googleApi = env.getProperty("googleapi.url");

		GoogleDirection googleDirection = new GoogleDirection();
		googleDirection = restTemplate.getForObject(googleApi, GoogleDirection.class);

		ResponseApiFormat responseApiFormat = new ResponseApiFormat();

		ArrayList<Route> tempRoutes = new ArrayList<Route>();
		tempRoutes = googleDirection.getRoutes();
		ArrayList<Leg> tempLegs = new ArrayList<Leg>();
		ArrayList<StepObject> tempSteps = new ArrayList<StepObject>();
		ArrayList<RouteObject> tempRouteObjects =  new ArrayList<RouteObject>();
		ArrayList<SectionObject> tempSectionObjects = null;
		for (Route route : tempRoutes) {
			tempLegs = route.getLegs();
			for (Leg leg : tempLegs) {
				tempSteps = leg.getSteps();
				tempSectionObjects = new ArrayList<SectionObject>();
				for (StepObject step : tempSteps) {
					tempSectionObjects.add(new SectionObject(step.getTravel_mode(), step.getPolyline().getPoints()));
				}	
			}
			tempRouteObjects.add(new RouteObject(tempSectionObjects));
		}
		responseApiFormat.setRoutes(tempRouteObjects);
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(responseApiFormat);
		return mappingJacksonValue;

	}

}
