package com.edu.iqra.OOP.Project;
import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Customer> cust;
	private ArrayList<Cook> cook;
	private Manager man;
	private Menu menu;
	
	Restaurant(Manager manager,Menu menu)
	{
		setManager(manager);
		this.menu=menu;
	}
	public void addCustomer(Customer c) {
		this.cust.add(c);
	}

	public ArrayList<Cook> getCook() {
		return cook;
	}

	public void setCook(ArrayList<Cook> cook) {
		this.cook = cook;
	}

	public Manager getManager() {
		return man;
	}

	public void setManager(Manager man) {
		this.man = man;
	}

	
	
	
}
