package com.direction.demo.pojo.here;


public class Transport{
    private String mode;
    private String name;
    private String category;
    private String color;
    private String textColor;
    private String headsign;
    private String shortName;
    private String longName;
    
    public Transport() {
    	
    }
	public Transport(String mode, String name, String category, String color, String textColor, String headsign,
			String shortName, String longName) {
		super();
		this.mode = mode;
		this.name = name;
		this.category = category;
		this.color = color;
		this.textColor = textColor;
		this.headsign = headsign;
		this.shortName = shortName;
		this.longName = longName;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTextColor() {
		return textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	public String getHeadsign() {
		return headsign;
	}
	public void setHeadsign(String headsign) {
		this.headsign = headsign;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
    
}