package com.edu.iqra.OOP.Project;

public class BBQ   extends MenuItem{
	private String name;
	private double cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String toString(){
		return this.name + " " + this.cost;
	}
}
