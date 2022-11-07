package com.direction.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.direction.demo.pojo.GoogleDirection;
import com.direction.demo.pojo.ResponseApiFormat;
import com.direction.demo.pojo.RouteBean;
import com.direction.demo.pojo.SectionBean;
import com.direction.demo.pojo.google.Leg;
import com.direction.demo.pojo.google.Route;

import com.direction.demo.pojo.google.StepObject;

@Service
public class GoogleDirectionService {
	@Autowired
	private Environment env;

	private RestTemplate restTemplate = new RestTemplate();

	public ResponseApiFormat getGoogleDirection() {
		String googleApi = env.getProperty("googleapi.url");

		GoogleDirection googleDirection = new GoogleDirection();
		googleDirection = restTemplate.getForObject(googleApi, GoogleDirection.class);

		ResponseApiFormat responseApiFormat = new ResponseApiFormat();

		ArrayList<Route> tempRoutes = new ArrayList<Route>();
		tempRoutes = googleDirection.getRoutes();
		ArrayList<Leg> tempLegs = new ArrayList<Leg>();
		ArrayList<StepObject> tempSteps = new ArrayList<StepObject>();
		ArrayList<RouteBean> tempRouteObjects =  new ArrayList<RouteBean>();
		ArrayList<SectionBean> tempSectionObjects = null;
		for (Route route : tempRoutes) {
			tempLegs = route.getLegs();
			for (Leg leg : tempLegs) {
				tempSteps = leg.getSteps();
				tempSectionObjects = new ArrayList<SectionBean>();
				for (StepObject step : tempSteps) {
					tempSectionObjects.add(new SectionBean(step.getTravel_mode(), step.getPolyline().getPoints(), null, null));
				}	
			}
			tempRouteObjects.add(new RouteBean(tempSectionObjects));
		}
		responseApiFormat.setRoutes(tempRouteObjects);
		return responseApiFormat;
	}

}


//public MappingJacksonValue getHereDirection() {
//
//	String hereApi = env.getProperty("hereapi.url");
//
//	HereDirection hereDirection = restTemplate.getForObject(hereApi, HereDirection.class);
//
//	MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(hereDirection);
//
//	FilterProvider filterProvider = new SimpleFilterProvider()
//			.addFilter("RoutesFilter", SimpleBeanPropertyFilter.filterOutAllExcept("sections"))
//			.addFilter("SectionFilter", SimpleBeanPropertyFilter.filterOutAllExcept("type", "polyline"));
//	mappingJacksonValue.setFilters(filterProvider);
//
//	return mappingJacksonValue;
//
//}
