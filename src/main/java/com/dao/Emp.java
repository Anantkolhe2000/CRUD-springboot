package com.dao;

public class Emp {

	public Emp() {
		// TODO Auto-generated constructor stub
	}
private	int id;
private String name;
public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
}


}
