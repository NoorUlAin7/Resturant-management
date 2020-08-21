package com.edu.iqra.OOP.Project;

public class Beverage extends MenuItem{
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
	@Override
	public String toString(){
		return this.name + " " + this.cost;
	}
}
