package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EndLocation {
	   private double lat;
	    private double lng;
	    public EndLocation() {
	    	
	    }
		public EndLocation(double lat, double lng) {
			super();
			this.lat = lat;
			this.lng = lng;
		}
		public double getLat() {
			return lat;
		}
		public void setLat(double lat) {
			this.lat = lat;
		}
		public double getLng() {
			return lng;
		}
		public void setLng(double lng) {
			this.lng = lng;
		}
		@Override
		public String toString() {
			return "EndLocation [lat=" + lat + ", lng=" + lng + "]";
		}
	    
}
