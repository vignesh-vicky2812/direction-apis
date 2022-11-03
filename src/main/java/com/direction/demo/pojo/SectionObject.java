package com.direction.demo.pojo;

public class SectionObject {
	
	private String type;
	private String polyline;
	public SectionObject() {
		
	}
	public SectionObject(String type, String polyline) {
		super();
		this.type = type;
		this.polyline = polyline;
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
	@Override
	public String toString() {
		return "SectionObject [type=" + type + ", polyline=" + polyline + "]";
	}

}
