package com.edu.iqra.OOP.Project;

public abstract class Staff {
	protected String name;
	protected String address;
	protected String cnic;
	public abstract String getCnic();
	public abstract void setCnic(String cnic);
	public abstract String getAddress();
	public abstract void setAddress(String address) ;
	public abstract String getName();
	public abstract void setName(String name);
}
