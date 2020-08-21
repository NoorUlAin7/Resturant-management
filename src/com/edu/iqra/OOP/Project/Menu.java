package com.edu.iqra.OOP.Project;

import java.util.ArrayList;

public class Menu {
	private ArrayList <MenuItem> menu= new ArrayList<MenuItem>();
	Menu(){

	}
	public void addMenuItem(MenuItem m )
	{
		menu.add(m);
	}
	public void deleteMenuItem(MenuItem m )
	{
		menu.remove(m);
	}
	public void displayMenu(){
		System.out.println("Displaying Menu");
		for(MenuItem menu:menu)
		{
			System.out.println(menu.toString());
		}
		
	}


	public static void main(String[] args) {
		Menu menu= new Menu();
		MenuItem m1= new Beverage();
		m1.setCost(5);
		m1.setName("COld Coffee");
		MenuItem m2= new Beverage();
		m2.setCost(10);
		m2.setName("Hot Coffee");
		MenuItem m3= new Dessert();
		m3.setCost(2.5);
		m3.setName("Custord");
		MenuItem m4= new BBQ();
		m4.setCost(2);
		m4.setName("Tikka");

		menu.addMenuItem(m1);
		menu.addMenuItem(m2);
		menu.addMenuItem(m3);
		menu.addMenuItem(m4);
		menu.displayMenu();
		Customer me = new Customer();
		me.setName("asad");
		me.setId("1");
		me.orderMeal(m1);
		me.orderMeal(m2);
		me.finishOrder();
		System.out.println(	me.checkCurrentBill());
		me.checkOut();
		
		me.setWaiter(new Waiter("asad","ds","sd"));
		System.out.println(me.getWaiterAssigned());
		}
	
	
}
