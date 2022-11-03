package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OverviewPolyline {
	private String points;

	public OverviewPolyline() {
		
	}
	public OverviewPolyline(String points) {
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
		return "OverviewPolyline [points=" + points + "]";
	}
	

}
