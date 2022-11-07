package com.direction.demo.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteBean {
	@JsonProperty("sections")
	private ArrayList<SectionBean> sections;
	public RouteBean() {
		
	}
	public RouteBean(ArrayList<SectionBean> sections) {
		super();
		this.sections = sections;
	}
	public ArrayList<SectionBean> getSections() {
		return sections;
	}
	public void setSections(ArrayList<SectionBean> sections) {
		this.sections = sections;
	}
	@Override
	public String toString() {
		return "RouteObject [sections=" + sections + "]";
	}

	
	
	
	
}
