package com.direction.demo.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;



public class RouteObject {
	@JsonProperty("sections")
	private ArrayList<SectionObject> sections;
	public RouteObject() {
		
	}
	public RouteObject(ArrayList<SectionObject> sections) {
		super();
		this.sections = sections;
	}
	public ArrayList<SectionObject> getSections() {
		return sections;
	}
	public void setSections(ArrayList<SectionObject> sections) {
		this.sections = sections;
	}
	@Override
	public String toString() {
		return "RouteObject [sections=" + sections + "]";
	}

	
	
	
	
}
