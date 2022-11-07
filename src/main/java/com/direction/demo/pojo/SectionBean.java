package com.direction.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionBean {
	
	private String type;
	private String polyline;
	private Integer distanceInMeters;
	private String suggestion;
	public SectionBean() {
		
	}
	
	

	public SectionBean(String type, String polyline, Integer distanceInMeters, String suggestion) {
		super();
		this.type = type;
		this.polyline = polyline;
		this.distanceInMeters = distanceInMeters;
		this.suggestion = suggestion;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPolyline() {
		return polyline;
	}
	public void setPolyline(String polyline) {
		this.polyline = polyline;
	}
	
	

	public Integer getDistanceInMeters() {
		return distanceInMeters;
	}



	public void setDistanceInMeters(Integer distanceInMeters) {
		this.distanceInMeters = distanceInMeters;
	}



	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "SectionObject [type=" + type + ", polyline=" + polyline + "]";
	}

}
