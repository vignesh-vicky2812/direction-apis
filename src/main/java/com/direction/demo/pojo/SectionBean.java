package com.direction.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionBean {
	
	private String type;
	private String polyline;
	private Integer distanceInMeters;
	private String suggestion;
	private String vehicle;
	private String busColor;
	public SectionBean() {
		
	}
	
	public SectionBean(String type, String polyline, Integer distanceInMeters, String suggestion, String vehicle,
			String busColor) {
		super();
		this.type = type;
		this.polyline = polyline;
		this.distanceInMeters = distanceInMeters;
		this.suggestion = suggestion;
		this.vehicle = vehicle;
		this.busColor = busColor;
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

	public String getBusColor() {
		return busColor;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "SectionObject [type=" + type + ", polyline=" + polyline + "]";
	}

}
