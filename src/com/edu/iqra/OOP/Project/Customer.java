package com.edu.iqra.OOP.Project;

import java.util.ArrayList;

public  class Customer {
	private String name;
	private String id;
	private String contact;
	private ArrayList<MenuItem> orderedItem;
	private static int numberOfCustomers;
	private Bill bill;
	private Waiter waiterAssigned;
	private String complain;
	Customer(){
		orderedItem=new ArrayList<>();
		numberOfCustomers++;
		bill=  new Bill();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void orderMeal(MenuItem m){
		orderedItem.add(m);
	}
	public void finishOrder(){
		for(MenuItem mi: orderedItem)
			bill.addToBill(mi);
		orderedItem.clear();
		
	}
	public double checkCurrentBill(){
	return	bill.getCostOfOrder();
	}
	public static int getNumberOfCustomers(){
		return numberOfCustomers;
	}
	public void checkOut(){
		System.out.println(bill.toString());
	}
	public String getWaiterAssigned() {
		return waiterAssigned.name;
	}
	public void setWaiter(Waiter waiterAssigned) {
		this.waiterAssigned = waiterAssigned;
	}
	public void complain(String s){
		complain=s;
	}
	
}
