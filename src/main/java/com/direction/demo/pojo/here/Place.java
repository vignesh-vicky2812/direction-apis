package com.direction.demo.pojo.here;

public class Place {
	
	private String type;
    private Location location;
    private String name;
    private String id;
    private String code;
    public Place() {
    	
    }
	public Place(String type, Location location, String name, String id, String code) {
		super();
		this.type = type;
		this.location = location;
		this.name = name;
		this.id = id;
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
