package com.direction.demo.pojo.google;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeocodedWaypoint {
	
	   private String geocoder_status;
	    private String place_id;
	    private ArrayList<String> types;
	    public GeocodedWaypoint() {
	    	
	    }
		public GeocodedWaypoint(String geocoder_status, String place_id, ArrayList<String> types) {
			super();
			this.geocoder_status = geocoder_status;
			this.place_id = place_id;
			this.types = types;
		}
		public String getGeocoder_status() {
			return geocoder_status;
		}
		public void setGeocoder_status(String geocoder_status) {
			this.geocoder_status = geocoder_status;
		}
		public String getPlace_id() {
			return place_id;
		}
		public void setPlace_id(String place_id) {
			this.place_id = place_id;
		}
		public ArrayList<String> getTypes() {
			return types;
		}
		public void setTypes(ArrayList<String> types) {
			this.types = types;
		}
		@Override
		public String toString() {
			return "GeocodedWaypoint [geocoder_status=" + geocoder_status + ", place_id=" + place_id + ", types="
					+ types + "]";
		}
	    

}
