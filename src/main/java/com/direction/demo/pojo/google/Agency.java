package com.direction.demo.pojo.google;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Agency {

	private String name;
    private String phone;
    private String url;
    public Agency() {
    	
    }
	public Agency(String name, String phone, String url) {
		super();
		this.name = name;
		this.phone = phone;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Agency [name=" + name + ", phone=" + phone + ", url=" + url + "]";
	}
    
}
