package com.edu.iqra.OOP.Project;

public class Cook extends Staff{
	public String getCnic() {
		return cnic;
	}
	public Cook(String name, String address, String cnic) {
		this.name=name;
		this.address=address;
		this.cnic=cnic;
}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
