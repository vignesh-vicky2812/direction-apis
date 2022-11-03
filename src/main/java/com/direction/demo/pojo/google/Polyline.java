package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Polyline {
	public String points;
	public Polyline() {
		
	}

	public Polyline(String points) {
		super();
		this.points = points;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Polyline [points=" + points + "]";
	}
	
}
