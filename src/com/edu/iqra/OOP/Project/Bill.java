package com.edu.iqra.OOP.Project;

import java.util.ArrayList;

public class Bill {

	private ArrayList<MenuItem> orderDone= new ArrayList<>();
	private double cost;
	
	public double getCostOfOrder()
	{
		for(int i=0;i<orderDone.size();i++)
			{
				cost +=orderDone.get(i).getCost();
			}
		return cost;
	}
	
	public void addToBill(MenuItem m){
		orderDone.add(m);
	}
	public void checkOut(){
		toString();
	}
	@Override
	public String toString()
	{
		String string="";
		for(MenuItem mi:orderDone){
			string+=mi.getName()+" "+ mi.getCost()  + " ";
		}
		return string;
	}
}
