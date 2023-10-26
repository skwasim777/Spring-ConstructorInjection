package com.constructor;

public class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void desplay() {
		System.out.println("Emp Id = " + id + " Emp Name =" + name);
	}
}
