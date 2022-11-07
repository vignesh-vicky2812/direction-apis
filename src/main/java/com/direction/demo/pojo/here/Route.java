package com.direction.demo.pojo.here;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonFilter("RoutesFilter")
public class Route{
    private String id;
    private ArrayList<Section> sections;
    public Route() {
    	
    }
	public Route(String id, ArrayList<Section> sections) {
		super();
		this.id = id;
		this.sections = sections;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Section> getSections() {
		return sections;
	}
	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}
	@Override
	public String toString() {
		return "Route [id=" + id + ", sections=" + sections + "]";
	}
    
}