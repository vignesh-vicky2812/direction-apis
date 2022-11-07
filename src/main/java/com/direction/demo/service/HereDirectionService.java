package com.direction.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.direction.demo.pojo.HereDirection;
import com.direction.demo.pojo.ResponseApiFormat;
import com.direction.demo.pojo.RouteBean;
import com.direction.demo.pojo.SectionBean;
import com.direction.demo.pojo.here.Route;
import com.direction.demo.pojo.here.Section;

@Service
public class HereDirectionService {

	@Autowired
	private Environment env;

	private RestTemplate restTemplate = new RestTemplate();

	public ResponseApiFormat getHereDirection() {

		String hereApi = env.getProperty("hereapi.url");
	
		HereDirection hereDirection = new HereDirection();
		hereDirection = restTemplate.getForObject(hereApi, HereDirection.class);

		ResponseApiFormat responseApiFormat = new ResponseApiFormat();

		ArrayList<Route> tempRoutes = new ArrayList<Route>();
		tempRoutes = hereDirection.getRoutes();
		ArrayList<Section> tempSections = new ArrayList<Section>();
		ArrayList<RouteBean> tempRouteObjects = new ArrayList<RouteBean>();
		ArrayList<SectionBean> tempSectionObjects = null;

		for (Route route : tempRoutes) {
			tempSections = route.getSections();
			tempSectionObjects = new ArrayList<SectionBean>();
			for (Section section : tempSections) {
				if (section.getType().equals("pedestrian")) {
					if (section.getTravelSummary().getLength() > 850)
						tempSectionObjects.add(new SectionBean(section.getType(), section.getPolyline(),
								section.getTravelSummary().getLength(), "uber lyst"));
					else
						tempSectionObjects.add(new SectionBean(section.getType(), section.getPolyline(),
								section.getTravelSummary().getLength(), null));
				}
				else 
					tempSectionObjects.add(new SectionBean(section.getType(), section.getPolyline(),
							section.getTravelSummary().getLength(), null));

			}
			tempRouteObjects.add(new RouteBean(tempSectionObjects));
		}
		responseApiFormat.setRoutes(tempRouteObjects);

		return responseApiFormat;

	}

}
