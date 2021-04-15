package com.wolken.wolkenworkspace.dto;

public class VehicleDto {
private int vid;
private String type;
private String color;
private int noOfWhl;
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getNoOfWhl() {
	return noOfWhl;
}
public void setNoOfWhl(int noOfWhl) {
	this.noOfWhl = noOfWhl;
}
@Override
public String toString() {
	return "VehicleDto [vid=" + vid + ", type=" + type + ", color=" + color + ", noOfWhl=" + noOfWhl + "]";
}


}
